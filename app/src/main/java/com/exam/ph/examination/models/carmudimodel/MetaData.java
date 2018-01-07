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
public class MetaData implements Serializable {

    @SerializedName("product_count")
    @Expose
    private int productCount;

    @SerializedName("results")
    @Expose
    private ArrayList<CarData> results;
}
