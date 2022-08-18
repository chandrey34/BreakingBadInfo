package com.example.breakingbadinfo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SeasonFragment extends Fragment {
    List<EpisodesApiResponse> episodesApiResponses;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_season, container, false);

        //объявляем RecyclerView
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        //упорядочиваем элементы в виде списка с одной колонкой
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        fetchData();

        return view;
    }

    public void fetchData() {
        RetrofitClient.getRetrofitClient().getBreakingBadApi().getEpisodesApiResponse().enqueue(new Callback<List<EpisodesApiResponse>>() {
            @Override
            public void onResponse(Call<List<EpisodesApiResponse>> call, Response<List<EpisodesApiResponse>> response) {
                if (response.isSuccessful()) {
                    episodesApiResponses = response.body();
                    SeasonAdapter adapter = new SeasonAdapter(SeasonDataMapper.transform(episodesApiResponses));
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<List<EpisodesApiResponse>> call, Throwable t) {
                Toast.makeText(getActivity(), "Ошибка!", Toast.LENGTH_SHORT).show();
                Log.d("API222", t.toString());
            }
        });
    }
}