package com.danielbibovski.mvvmretrofit2livedataexampleapp.network;

import com.danielbibovski.mvvmretrofit2livedataexampleapp.model.MovieModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

   // @GET("volley_array.json")
    //@GET("photos")

    @GET("v2/list")
    Call<List<MovieModel>> getMovieList();

    //public List<Top250DataDetail> Items { get; set; }
    /*
    public class Top250DataDetail
    {
        public string Id { get; set; }
        public string Rank { get; set; }
        public string Title { set; get; }
        public string FullTitle { set; get; }
        public string Year { set; get; }
        public string Image { get; set; }
        public string Crew { get; set; }
        public string IMDbRating { get; set; }
        public string IMDbRatingCount { get; set; }
    }
     */

}
