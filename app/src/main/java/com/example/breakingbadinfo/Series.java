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

    public Series() {
    }

    public Series(EpisodesApiResponse episodesApiResponse) {
        this.nameSeries = episodesApiResponse.getTitle();
        this.numberSeries = episodesApiResponse.getEpisode();

    }


    public void setNumberSeries(String numberSeries) {
        this.numberSeries = numberSeries;
    }

    public void setNameSeries(String nameSeries) {
        this.nameSeries = nameSeries;
    }

    public String getNumberSeries() {
        return numberSeries;
    }

    public String getNameSeries() {
        return nameSeries;
    }
}