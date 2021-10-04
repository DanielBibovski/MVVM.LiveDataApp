package com.danielbibovski.mvvmretrofit2livedataexampleapp.model;

import com.google.gson.annotations.SerializedName;

public class MovieModel {

    @SerializedName("author")
    private String title;

    @SerializedName("download_url")
    private String image;

    public MovieModel() {
    }

    public MovieModel(String title, String image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
