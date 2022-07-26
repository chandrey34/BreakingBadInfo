package com.example.breakingbadinfo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static final String BASE_URL = "https://www.breakingbadapi.com/api/";
    private static RetrofitClient retrofitClient;
    private BreakingBadApi breakingBadApi;

    private RetrofitClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        breakingBadApi = retrofit.create(BreakingBadApi.class);
    }

    public static RetrofitClient getRetrofitClient() {
        if (retrofitClient == null) {
            retrofitClient = new RetrofitClient();
        }
        return retrofitClient;
    }

    public BreakingBadApi getBreakingBadApi() {
        return breakingBadApi;
    }
}