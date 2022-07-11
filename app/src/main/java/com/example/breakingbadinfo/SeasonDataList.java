package com.example.breakingbadinfo;

import java.util.ArrayList;

public class SeasonDataList {
    private static ArrayList<SeasonDataModel> seasonDataModel = new ArrayList<>();

    public static ArrayList<SeasonDataModel> getSeasonDataModel() {
        return seasonDataModel;
    }

    public static void setSeason1() {

        ArrayList<Series> season1 = new ArrayList<>();
        season1.add(new Series("Серия 1", "Первая серия"));
        season1.add(new Series("Серия 2", "Вторая серия"));
        season1.add(new Series("Серия 3", "Третья серия"));
        season1.add(new Series("Серия 4", "Четвертая серия"));

        seasonDataModel.add(new SeasonDataModel(season1, "Сезон 1"));
    }

    public static void setSeason2() {
        ArrayList<Series> season2 = new ArrayList<>();
        season2.add(new Series("Серия 1", "Первая серия 2 сезон"));
        season2.add(new Series("Серия 2", "Вторая серия 2 сезон"));
        season2.add(new Series("Серия 3", "Третья серия 2 сезон"));
        season2.add(new Series("Серия 4", "Четвертая серия 2 сезон"));

        seasonDataModel.add(new SeasonDataModel(season2, "Сезон 2"));
    }

    public static void setSeason3() {
        ArrayList<Series> season3 = new ArrayList<>();
        season3.add(new Series("Серия 1", "Первая серия 3 сезон"));
        season3.add(new Series("Серия 2", "Вторая серия 3 сезон"));
        season3.add(new Series("Серия 3", "Третья серия 3 сезон"));
        season3.add(new Series("Серия 4", "Четвертая серия 3 сезон"));

        seasonDataModel.add(new SeasonDataModel(season3, "Сезон 3"));
    }

    public static void setSeason4() {
        ArrayList<Series> season4 = new ArrayList<>();
        season4.add(new Series("Серия 1", "Первая серия 4 сезон"));
        season4.add(new Series("Серия 2", "Вторая серия 4 сезон"));
        season4.add(new Series("Серия 3", "Третья серия 4 сезон"));
        season4.add(new Series("Серия 4", "Четвертая серия 4 сезон"));

        seasonDataModel.add(new SeasonDataModel(season4, "Сезон 4"));
    }

    public static void setSeason5() {
        ArrayList<Series> season5 = new ArrayList<>();
        season5.add(new Series("Серия 1", "Первая серия 5 сезон"));
        season5.add(new Series("Серия 2", "Вторая серия 5 сезон"));
        season5.add(new Series("Серия 3", "Третья серия 5 сезон"));
        season5.add(new Series("Серия 4", "Четвертая серия 5 сезон"));
        seasonDataModel.add(new SeasonDataModel(season5, "Сезон 5"));
    }
}