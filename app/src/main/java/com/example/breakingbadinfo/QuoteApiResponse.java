package com.example.breakingbadinfo;


import com.google.gson.annotations.SerializedName;

//как я понял, это можно добавить через @SerializedName в QuoteDataModel дабы размножать лишние классы
public class QuoteApiResponse {

    @SerializedName("quote_id")
    private Integer quoteId;

    @SerializedName("quote")
    private String quote;

    @SerializedName("author")
    private String author;

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