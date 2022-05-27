package com.example.breakingbadinfo;

import java.util.ArrayList;

public class DataModel {
    private ArrayList<String> seriesList;
    private String numberSeason;
    private boolean isExpandable;

    public DataModel(ArrayList<String> seriesList, String numberSeason) {
        this.seriesList = seriesList;
        this.numberSeason = numberSeason;
        isExpandable = false;
    }

    public ArrayList<String> getSeriesList() {
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