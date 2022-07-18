package com.example.breakingbadinfo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class EpisodesApiResponse {
    @SerializedName("episode_id")
    private int episodeId;

    @SerializedName("title")
    private String title;

    @SerializedName("season")
    private String season;

    @SerializedName("air_date")
    private String airDate;

    @SerializedName("characters")
    private ArrayList<String> characters = null;

    @SerializedName("episode")
    private String episode;

    @SerializedName("series")
    private String series;

    public int getEpisodeId() {
        return episodeId;
    }

    public String getTitle() {
        return title;
    }

    public String getSeason() {
        return season;
    }

    public String getAirDate() {
        return airDate;
    }

    public ArrayList<String> getCharacters() {
        return characters;
    }

    public String getEpisode() {
        return episode;
    }

    public String getSeries() {
        return series;
    }
}