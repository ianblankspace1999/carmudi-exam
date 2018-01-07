package com.exam.ph.examination.models.carmudimodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

import lombok.Data;

/**
 * Created by IanBlanco on 07/01/2018.
 */
@Data
public class CarData implements Serializable{

    @SerializedName("data")
    @Expose
    private CarInfo carData;

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("images")
    @Expose
    private ArrayList<CarImage> images;


    public class CarImage implements Serializable {

        @SerializedName("url")
        @Expose
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
