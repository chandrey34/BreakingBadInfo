package com.example.breakingbadinfo;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BreakingBadApi {

    @GET("episodes")
    Call<List<EpisodesApiResponse>> getEpisodesApiResponse();
}