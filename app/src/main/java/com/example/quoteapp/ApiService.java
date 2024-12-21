package com.example.quoteapp;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/spiritual/quotes/hinduism")
    Call<List<Quotes>> getQuotes();
}
