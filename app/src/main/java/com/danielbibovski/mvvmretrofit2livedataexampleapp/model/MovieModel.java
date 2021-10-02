package com.danielbibovski.mvvmretrofit2livedataexampleapp.model;

import com.google.gson.annotations.SerializedName;

public class MovieModel {

    private String title;

    @SerializedName("url")
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
