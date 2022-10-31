package com.example.breakingbadinfo;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {QuoteDataModel.class}, version = 1)
public abstract class QuoteDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "Quote";
    public abstract QuoteDao quoteDao();
    public static QuoteDatabase INSTANCE;

    public static QuoteDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (QuoteDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context, QuoteDatabase.class, DATABASE_NAME)
                            .fallbackToDestructiveMigration()
                            .addCallback(callback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    public static Callback callback = new Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsync(INSTANCE);
        }
    };

    static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {
        private QuoteDao quoteDao;

        public PopulateDbAsync(QuoteDatabase quoteDatabase) {
            quoteDao = quoteDatabase.quoteDao();
        }
        @Override
        protected Void doInBackground(Void... voids) {
            quoteDao.delete();
            return null;
        }
    }
}