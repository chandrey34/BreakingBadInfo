package com.example.breakingbadinfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeasonMapper {

    public static List<SeasonDataModel> transformSmart(List<EpisodesApiResponse> episodesApiResponseList) {
        List<SeasonDataModel> seasonDataModelList = new ArrayList<>();
        Map<String, SeasonDataModel> map = new HashMap<>();
        for (EpisodesApiResponse episodesApiResponse : episodesApiResponseList) {
            String numberSeason = episodesApiResponse.getSeason().trim();
            boolean isContains = map.containsKey(numberSeason);
            if (!isContains) {
                map.put(numberSeason, new SeasonDataModel(new ArrayList<>(), numberSeason));
            }
        }
        for (String key : map.keySet()) {
            SeasonDataModel seasonDataModel = map.get(key);
            if (seasonDataModel != null) {
                for (EpisodesApiResponse episodesApiResponse : episodesApiResponseList) {
                    if (seasonDataModel.getNumberSeason().equals(episodesApiResponse.getSeason().trim())) {
                        seasonDataModel.getSeriesList().add(new Series(episodesApiResponse));
                    }
                }
            }
        }
        seasonDataModelList.addAll(map.values());
        return seasonDataModelList;
    }
}