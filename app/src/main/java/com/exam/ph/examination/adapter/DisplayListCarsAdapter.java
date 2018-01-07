package com.exam.ph.examination.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.exam.ph.examination.R;
import com.exam.ph.examination.Utils.BaseUtil;
import com.exam.ph.examination.Utils.ModelUtil;
import com.exam.ph.examination.models.User;
import com.exam.ph.examination.models.carmudimodel.CarData;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by IanBlanco on 12/26/2017.
 */

public class DisplayListCarsAdapter extends RecyclerView.Adapter<DisplayListCarsAdapter.CarHolder> {


    public interface Callback {
        void changeIntent(Context context, String response);
    }

    private Context mContext;
    private ArrayList<CarData> mCarsList;
    private Callback mCallback;

    public DisplayListCarsAdapter(Context mContext, ArrayList<CarData> mCarsList, Callback callback) {
        this.mContext = mContext;
        this.mCarsList = mCarsList;
        this.mCallback = callback;
    }

    @Override
    public CarHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.adapter_userlist, parent, false);
        return new CarHolder(view);
    }

    @Override
    public void onBindViewHolder(CarHolder holder, int position) {
        CarData carData = mCarsList.get(position);
        holder.tvName.setText(carData.getCarData().getBrand());
//        holder.cardUser.setOnClickListener(v -> mCallback.changeIntent(mContext, ModelUtil.toJsonString(user)));
        CarData.CarImage url = carData.getImages().get(0);
        BaseUtil.setUpImageGlide(url.getUrl(), holder.ivImage, mContext);
    }

    @Override
    public int getItemCount() {
        return mCarsList.size();
    }


    public class CarHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tvName)
        TextView tvName;

        @BindView(R.id.cardUser)
        CardView cardUser;

        @BindView(R.id.ivImage)
        ImageView ivImage;

        public CarHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
