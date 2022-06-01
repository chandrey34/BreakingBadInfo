package com.example.breakingbadinfo;

import java.util.ArrayList;

public class SeasonDataList {
    private static ArrayList<SeasonDataModel> seasonDataModel = new ArrayList<>();

    public static ArrayList<SeasonDataModel> getSeasonDataModel() {
        return seasonDataModel;
    }

    public static void setSeason1() {
        ArrayList<String> season1 = new ArrayList<>();
        season1.add("Серия 1");
        season1.add("Серия 2");
        season1.add("Серия 3");
        season1.add("Серия 4");
        season1.add("Серия 5");
        season1.add("Серия 6");
        season1.add("Серия 7");
        season1.add("Серия 8");
        season1.add("Серия 9");
        season1.add("Серия 10");
        seasonDataModel.add(new SeasonDataModel(season1, "Сезон 1"));
    }

    public static void setSeason2() {
        ArrayList<String> season2 = new ArrayList<>();
        season2.add("Серия 1");
        season2.add("Серия 2");
        season2.add("Серия 3");
        season2.add("Серия 4");
        season2.add("Серия 5");
        season2.add("Серия 6");
        season2.add("Серия 7");
        season2.add("Серия 8");
        season2.add("Серия 9");
        season2.add("Серия 10");
        seasonDataModel.add(new SeasonDataModel(season2, "Сезон 2"));
    }

    public static void setSeason3() {
        ArrayList<String> season3 = new ArrayList<>();
        season3.add("Серия 1");
        season3.add("Серия 2");
        season3.add("Серия 3");
        season3.add("Серия 4");
        season3.add("Серия 5");
        season3.add("Серия 6");
        season3.add("Серия 7");
        season3.add("Серия 8");
        season3.add("Серия 9");
        season3.add("Серия 10");
        seasonDataModel.add(new SeasonDataModel(season3, "Сезон 3"));
    }

    public static void setSeason4() {
        ArrayList<String> season4 = new ArrayList<>();
        season4.add("Серия 1");
        season4.add("Серия 2");
        season4.add("Серия 3");
        season4.add("Серия 4");
        season4.add("Серия 5");
        season4.add("Серия 6");
        season4.add("Серия 7");
        season4.add("Серия 8");
        season4.add("Серия 9");
        season4.add("Серия 10");
        seasonDataModel.add(new SeasonDataModel(season4, "Сезон 4"));
    }

    public static void setSeason5() {
        ArrayList<String> season5 = new ArrayList<>();
        season5.add("Серия 1");
        season5.add("Серия 2");
        season5.add("Серия 3");
        season5.add("Серия 4");
        season5.add("Серия 5");
        season5.add("Серия 6");
        season5.add("Серия 7");
        season5.add("Серия 8");
        season5.add("Серия 9");
        season5.add("Серия 10");
        seasonDataModel.add(new SeasonDataModel(season5, "Сезон 5"));
    }
}
