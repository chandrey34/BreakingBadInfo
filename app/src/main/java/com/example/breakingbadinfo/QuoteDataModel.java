package com.example.breakingbadinfo;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class QuoteDataModel {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "quote_id")
    Integer quoteId;

    @NonNull
    @ColumnInfo(name = "quote")
    String quote;

    @NonNull
    @ColumnInfo(name = "author")
    String author;

    public Integer getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}