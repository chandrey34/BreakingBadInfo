package com.example.breakingbadinfo;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class QuoteViewModel extends AndroidViewModel {
    private QuoteRepository quoteRepository;
    public LiveData<List<QuoteDataModel>> getAllQuotes;

    public QuoteViewModel(@NonNull Application application) {
        super(application);
        quoteRepository = new QuoteRepository(application);
        getAllQuotes = quoteRepository.getAllQuotes();
    }

    public void insert(List<QuoteApiResponse> quotes) {
        quoteRepository.insert(quotes);
    }

    public LiveData<List<QuoteDataModel>> getAllQuotes() {
        return getAllQuotes;
    }
}