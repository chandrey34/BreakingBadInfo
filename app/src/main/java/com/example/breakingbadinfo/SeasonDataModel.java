package com.example.breakingbadinfo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SeasonDataModel {
    private ArrayList<Series> seriesList;

    @SerializedName("season")
    private String numberSeason;

    private boolean isExpandable;

    public SeasonDataModel(ArrayList<Series> seriesList, String numberSeason) {
        this.seriesList = seriesList;
        this.numberSeason = numberSeason;
        isExpandable = false;

    }

    public ArrayList<Series> getSeriesList() {
        return seriesList;
    }

    public String getItemText() {
        return numberSeason;
    }

    public boolean isExpandable() {
        return isExpandable;
    }

    public void setExpandable(boolean expandable) {
        isExpandable = expandable;
    }
}