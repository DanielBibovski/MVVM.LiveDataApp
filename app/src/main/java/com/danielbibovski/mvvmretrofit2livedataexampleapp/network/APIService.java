package com.danielbibovski.mvvmretrofit2livedataexampleapp.network;

import com.danielbibovski.mvvmretrofit2livedataexampleapp.model.MovieModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("v2/list")
    Call<List<MovieModel>> getMovieList();



}
