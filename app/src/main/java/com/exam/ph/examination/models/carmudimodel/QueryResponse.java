package com.exam.ph.examination.models.carmudimodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import lombok.Data;

/**
 * Created by IanBlanco on 07/01/2018.
 */
@Data
public class QueryResponse implements Serializable {

    @SerializedName("success")
    @Expose
    private boolean success;

//    @SerializedName("messages")
//    @Expose
//    private String messages;

    @SerializedName("metadata")
    @Expose
    private MetaData metaData;

}
