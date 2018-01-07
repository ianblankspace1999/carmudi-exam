package com.exam.ph.examination.activities.displaycars;

import android.util.Log;

import com.exam.ph.examination.repository.DataRepository;
import com.exam.ph.examination.restclient.LoadAction;
import com.exam.ph.examination.restclient.restinterface.TestInterface;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by IanBlanco on 12/26/2017.
 */

public class DisplayListCarsPresenterImpl implements DisplayListCarsPresenter {

    DisplayListCarView mDisplayListCarView;
    DataRepository mDataRepository;

    @Override
    public void attachView(DisplayListCarView displayListCarView) {
        mDisplayListCarView = displayListCarView;
    }

    @Override
    public void loadData(TestInterface testInterface, LoadAction loadAction, int page, String category) {

        if (mDisplayListCarView != null) {
            mDataRepository = new DataRepository();
            mDisplayListCarView.showProgress();
            if (category.equals("")) {
            mDataRepository.getCars(testInterface, page).
                    subscribeOn(Schedulers.newThread()).
                    observeOn(AndroidSchedulers.mainThread()).
                    subscribe(result -> mDisplayListCarView.showSuccess(result),
                            throwable -> mDisplayListCarView.showError(throwable.toString()),
                            () -> Log.i("api", "api request completed --> "));
            return;
        }
            mDataRepository.getCarsCateorized(testInterface, page, category).
                    subscribeOn(Schedulers.newThread()).
                    observeOn(AndroidSchedulers.mainThread()).
                    subscribe(result -> mDisplayListCarView.showSuccess(result),
                            throwable -> mDisplayListCarView.showError(throwable.toString()),
                            () -> Log.i("api", "api request completed --> "));

        }
    }


    @Override
    public void detachView() {
        mDisplayListCarView = null;
    }
}
