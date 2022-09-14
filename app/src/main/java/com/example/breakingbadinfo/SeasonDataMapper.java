package com.example.breakingbadinfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeasonDataMapper {

//   SeasonDataMapper public static List<SeasonDataModel> transform(List<EpisodesApiResponse> episodesApiResponseList) {
//        List<SeasonDataModel> seasonDataModelList = new ArrayList<>();
//        Set<String> seasonSet = new HashSet<>();
//        for (EpisodesApiResponse episodesApiResponse : episodesApiResponseList) {
//            boolean isContains = seasonSet.contains(episodesApiResponse.getSeason().trim());
//            if (!isContains) {
//                seasonSet.add(episodesApiResponse.getSeason());
//                seasonDataModelList.add(new SeasonDataModel(new ArrayList<>(), episodesApiResponse.getSeason().trim()));
//            }
//        }
//        for (SeasonDataModel seasonDataModel : seasonDataModelList) {
//            for (EpisodesApiResponse episodesApiResponse : episodesApiResponseList) {
//                if (seasonDataModel.getNumberSeason().equals(episodesApiResponse.getSeason().trim())) {
//                    seasonDataModel.getSeriesList().add(new Series(episodesApiResponse));
//                }
//            }
//        }
//        return seasonDataModelList;
//    }

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