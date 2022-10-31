package com.example.breakingbadinfo;

import android.content.Context;
import android.os.AsyncTask;


import androidx.lifecycle.LiveData;
import java.util.List;

public class QuoteRepository {

    private LiveData<List<QuoteDataModel>> getAllQuotes;
    private QuoteDatabase quoteDatabase;

    public QuoteRepository(Context context) {
        quoteDatabase = QuoteDatabase.getInstance(context);
        getAllQuotes = quoteDatabase.quoteDao().getAllQuotes();
    }

    public void insert(List<QuoteApiResponse> quotes) {
        new InsertAsyncTask (quoteDatabase).execute(quotes);
    }

    public LiveData<List<QuoteDataModel>> getAllQuotes() {
        return getAllQuotes;
    }

    private static class InsertAsyncTask extends AsyncTask<List<QuoteDataModel>, Void, Void> {
        private QuoteDao quoteDao;

        public InsertAsyncTask(QuoteDatabase quoteDatabase) {
            quoteDao = quoteDatabase.quoteDao();
        }
        @Override
        protected Void doInBackground(List<QuoteDataModel>... lists) {
            quoteDao.insert(lists[0]);
            return null;
        }

        public void execute(List<QuoteApiResponse> quotes) {
        }
    }
}