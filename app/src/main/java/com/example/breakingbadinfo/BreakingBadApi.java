package com.example.breakingbadinfo;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BreakingBadApi {

    @GET("episodes?series=Breaking+Bad")
    Call<List<EpisodesApiResponse>> getEpisodesApiResponse();

    @GET("characters?category=Breaking+Bad")
    Call<List<CharactersApiResponse>> getCharactersApiResponse();
}