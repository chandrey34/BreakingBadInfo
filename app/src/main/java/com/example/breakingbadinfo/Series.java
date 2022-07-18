package com.example.breakingbadinfo;


import com.google.gson.annotations.SerializedName;

public class Series {

    @SerializedName("episode")
    private String numberSeries;
    @SerializedName("title")
    private String nameSeries;

    public Series(String numberSeries, String nameSeries) {
        this.numberSeries = numberSeries;
        this.nameSeries = nameSeries;
    }


    public String getNumberSeries() {
        return numberSeries;
    }

    public String getNameSeries() {
        return nameSeries;
    }
}