package com.example.breakingbadinfo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QuoteFragment extends Fragment {
    private QuoteRepository quoteRepository;
    private QuoteViewModel quoteViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_quote, container, false);

        quoteRepository = new QuoteRepository(getActivity());
        quoteViewModel = new ViewModelProvider(this).get(QuoteViewModel.class);

        fetchData();
        observeDb();
        //up

        return view;
    }

    public void fetchData() {
        RetrofitClient.getRetrofitClient().getBreakingBadApi().getQuoteApiResponse().enqueue(new Callback<List<QuoteApiResponse>>() {
            @Override
            public void onResponse(Call<List<QuoteApiResponse>> call, Response<List<QuoteApiResponse>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    quoteRepository.insert(response.body());
                    Log.d("main1", "onResponse: " +response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<List<QuoteApiResponse>> call, Throwable t) {

            }
        });
    }

    public void observeDb() {
        quoteViewModel.getAllQuote()
                .observe(getViewLifecycleOwner(), new Observer<List<QuoteDataModel>>() {
                    @Override
                    public void onChanged(List<QuoteDataModel> quoteDataModels) {

                    }
                });
    }
}