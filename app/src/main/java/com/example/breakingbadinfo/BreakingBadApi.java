package com.example.breakingbadinfo;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BreakingBadApi {

    @GET("episodes/{id}")
    Call<List<EpisodesApiResponse>> getEpisodesApiResponse(@Path("id") int episodesId);
}