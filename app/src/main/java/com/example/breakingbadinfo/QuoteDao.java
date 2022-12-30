package com.example.breakingbadinfo;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface QuoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<QuoteDataModel> quotes);

    @Query("SELECT * FROM quote")
    LiveData<List<QuoteDataModel>> getAllQuotes();

    @Query("DELETE FROM quote")
    void delete();
}