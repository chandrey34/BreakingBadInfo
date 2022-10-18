package com.example.breakingbadinfo;

import android.app.Application;
import android.os.AsyncTask;


import java.util.List;

public class QuoteRepository {

    public QuoteDao quoteDao;
    public List<QuoteDataModel> getAllQuotes;
    private QuoteDatabase quoteDatabase;

    public QuoteRepository(Application application) {
        quoteDatabase = QuoteDatabase.getInstance(application);
        quoteDao = quoteDatabase.quoteDao();
        getAllQuotes=quoteDao.getAll();
    }

    public void insert(List<QuoteDataModel> quotes) {
        new InsertAsyncTask (quoteDao).execute(quotes);
    }

    public List<QuoteDataModel> getAllQuotes() {
        return getAllQuotes;
    }

    private static class InsertAsyncTask extends AsyncTask<List<QuoteDataModel>, Void, Void> {
        private QuoteDao quoteDao;
        public InsertAsyncTask(QuoteDao quotDao) {
            this.quoteDao = quotDao;
        }
        @Override
        protected Void doInBackground(List<QuoteDataModel>... lists) {
            quoteDao.insertAll(lists[0]);
            return null;
        }
    }
}