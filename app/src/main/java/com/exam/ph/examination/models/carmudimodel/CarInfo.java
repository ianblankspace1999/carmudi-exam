package com.exam.ph.examination.models.carmudimodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

import lombok.Data;

/**
 * Created by IanBlanco on 07/01/2018.
 */
@Data
public class CarInfo implements Serializable{

    @SerializedName("original_name")
    @Expose
    private String originalName;

    @SerializedName("agency_logo")
    @Expose
    private String agencyLogo;

    @SerializedName("google_formatted_address")
    @Expose
    private String address;

    @SerializedName("item_contact_name")
    @Expose
    private String contactName;

    @SerializedName("item_contact_email")
    @Expose
    private String contactEmail;

    @SerializedName("agency_name")
    @Expose
    private String agencyName;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("price")
    @Expose
    private double price;

    @SerializedName("original_price")
    @Expose
    private double originalPrice;

    @SerializedName("brand")
    @Expose
    private String brand;

    @SerializedName("transmission")
    @Expose
    private String transmission;

}
