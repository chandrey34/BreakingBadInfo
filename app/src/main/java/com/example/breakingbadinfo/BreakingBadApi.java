package com.example.breakingbadinfo;


import retrofit2.Call;
import retrofit2.http.GET;

public interface BreakingBadApi {

    @GET("episodes/")
    Call<SeasonDataModel> getSeasonDataModel();

    @GET("episodes/")
    Call<Series> getSeries();

}
