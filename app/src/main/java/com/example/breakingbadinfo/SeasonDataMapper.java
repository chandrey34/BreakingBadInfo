package com.example.breakingbadinfo;

import android.util.Log;

import java.util.ArrayList;

import java.util.List;

public class SeasonDataMapper {

    public static SeasonDataModel transform(EpisodesApiResponse episodesApiResponse) {
        SeasonDataModel seasonDataModel = null;
        if (episodesApiResponse != null) {
            seasonDataModel = new SeasonDataModel();
            seasonDataModel.setNumberSeason(episodesApiResponse.getSeason());
        }
        return seasonDataModel;
    }

    public static List<SeasonDataModel> transform(List<EpisodesApiResponse> episodesApiResponseList) {
        List<SeasonDataModel> seasonDataModelList = new ArrayList<>();
        for (EpisodesApiResponse episodesApiResponse : episodesApiResponseList) {
            seasonDataModelList.add(transform(episodesApiResponse));
        }
        Log.d("ARRAY", seasonDataModelList.toString());
        return seasonDataModelList;
    }
}