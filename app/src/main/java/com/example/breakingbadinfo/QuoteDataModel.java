package com.example.breakingbadinfo;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "quote")
public class QuoteDataModel {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "quote_id")
    private int quoteId;

    @NonNull
    @ColumnInfo(name = "quote")
    private String quote;

    @NonNull
    @ColumnInfo(name = "author")
    private String author;

    public QuoteDataModel(int quoteId,@NonNull String quote,@NonNull String author) {
        this.quoteId = quoteId;
        this.quote = quote;
        this.author = author;
    }

    public QuoteDataModel(QuoteApiResponse quoteApiResponse) {
        this.quoteId = quoteApiResponse.getQuoteId();
        this.quote = quoteApiResponse.getQuote();
        this.author = quoteApiResponse.getAuthor();
    }

    public int getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(int quoteId) {
        this.quoteId = quoteId;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(@NonNull String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(@NonNull String author) {
        this.author = author;
    }
}