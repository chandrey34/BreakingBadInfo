package com.example.breakingbadinfo;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface QuoteDao {

    @Query("SELECT * FROM quotedatamodel")
    List<QuoteDataModel> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<QuoteDataModel> quotes);

    @Query("DELETE FROM quotedatamodel")
    void deleteAll();
}