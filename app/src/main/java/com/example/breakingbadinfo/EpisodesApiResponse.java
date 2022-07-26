package com.example.breakingbadinfo;

import com.google.gson.annotations.SerializedName;


public class EpisodesApiResponse {

    @SerializedName("title")
    private String title;

    @SerializedName("season")
    private String season;

    @SerializedName("episode")
    private String episode;

    public String getTitle() {
        return title;
    }

    public String getSeason() {
        return season;
    }

    public String getEpisode() {
        return episode;
    }
}