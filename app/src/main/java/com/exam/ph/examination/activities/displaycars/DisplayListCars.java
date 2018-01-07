package com.exam.ph.examination.activities.displaycars;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ProgressBar;
import android.widget.Spinner;

import com.exam.ph.examination.BaseActivity;
import com.exam.ph.examination.ExamApplication;
import com.exam.ph.examination.R;
import com.exam.ph.examination.Utils.BaseUtil;
import com.exam.ph.examination.Utils.UiUtil;
import com.exam.ph.examination.activities.displayspecificuser.DisplaySpecificUser;
import com.exam.ph.examination.adapter.DisplayListCarsAdapter;
import com.exam.ph.examination.models.carmudimodel.CarData;
import com.exam.ph.examination.models.carmudimodel.QueryResponse;
import com.exam.ph.examination.restclient.LoadAction;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by IanBlanco on 12/26/2017.
 */

public class DisplayListCars extends BaseActivity implements AdapterView.OnItemSelectedListener, DisplayListCarView, DisplayListCarsAdapter.Callback {

    @Inject
    DisplayListCarsPresenter mDisplayListUserPresenter;

    @BindView(R.id.rvCarList)
    RecyclerView mRvCarList;

    @BindView(R.id.progBar)
    ProgressBar mProgBar;

    @BindView(R.id.spnFirst)
    Spinner mSpnFirst;

    private int spinnerPosition = 0;

    private int mPage = 1;

    private ArrayList<String> mStringCollection = new ArrayList<>();
    private ArrayList<CarData> mCarsList = new ArrayList<>();

    private String[] arrCollectionValue = {"", "oldest", "newest", "price-low",
    "price-high", "mileage-low", "mileage-high"};

    private DisplayListCarsAdapter mDisplayListCarsAdapter;

    private DialogInterface.OnClickListener onClick = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            mDisplayListUserPresenter.loadData(mTestInterface, LoadAction.LOAD_CARS_LIST, mPage, "");
        }
    };

    @Override
    protected int getLayoutResource() {
        return R.layout.activity_displaylistuser;
    }


    @Override
    protected DialogInterface.OnClickListener getListner() {
        return onClick;
    }

    @Override
    public void showProgress() {
        mProgBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        mProgBar.setVisibility(View.GONE);
    }

    @Override
    public void showSuccess(Object result) {
        Log.i("pumasok dito", "pumasok dito");
        if (result instanceof QueryResponse) {
            Log.i("pumasok dito", "pumasok dito o");
            QueryResponse queryResponse = (QueryResponse) result;
//            mUserList = quer.getUserList();
            mCarsList = queryResponse.getMetaData().getResults();
            mDisplayListCarsAdapter = new DisplayListCarsAdapter(this, mCarsList, this);
            BaseUtil.setDefaultRecyclerView(this, mRvCarList, mDisplayListCarsAdapter);
            hideProgress();
        }

    }

    @Override
    public void showError(String error) {
        hideProgress();
        Log.i("pumasok dito", "pumasok dito error: " + error);
        if (!networkHelper.isNetworkAvailable()) {
            UiUtil.dialogWithOnClick(mContext, "No Internet connection!", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    mDisplayListUserPresenter.loadData(mTestInterface, LoadAction.LOAD_CARS_LIST, mPage, "");
                }
            });
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {



        if (position > 0) {
            mDisplayListUserPresenter.loadData(mTestInterface,
                    LoadAction.LOAD_CARS_LIST_CATEGORIZED, mPage, arrCollectionValue[position]);
            return;
        }
        mDisplayListUserPresenter.loadData(mTestInterface,
                LoadAction.LOAD_CARS_LIST_CATEGORIZED, mPage, "");
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((ExamApplication) getApplication()).getAppComponent().inject(this);
        mDisplayListUserPresenter.attachView(this);
        initialize();
    }


    private void initialize() {

//        set data Spinner
        mStringCollection = new ArrayList<>();
        mStringCollection.add("All");
        mStringCollection.add("Oldest");
        mStringCollection.add("Newest");
        mStringCollection.add("Low Price");
        mStringCollection.add("High Price");
        mStringCollection.add("Low Mileage");
        mStringCollection.add("High Mileage");

        BaseUtil.setSpinner(mContext, mSpnFirst, mStringCollection);
//        ----------------

        mRvCarList.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }
        });

        mSpnFirst.setOnItemSelectedListener(this);
        if (!networkHelper.isNetworkAvailable()) {
            UiUtil.dialogWithOnClick(mContext, "No Internet connection!", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    mDisplayListUserPresenter.loadData(mTestInterface, LoadAction.LOAD_CARS_LIST, mPage, "");
                }
            });
            return;
        }
        mDisplayListUserPresenter.loadData(mTestInterface, LoadAction.LOAD_CARS_LIST, mPage, "");
    }

    @Override
    public void changeIntent(Context context, String response) {
        Intent intent = DisplaySpecificUser.getIntent(context, response);
        startActivity(intent);
    }


}
