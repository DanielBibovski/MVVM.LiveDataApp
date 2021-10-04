package com.danielbibovski.mvvmretrofit2livedataexampleapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.danielbibovski.mvvmretrofit2livedataexampleapp.adapter.MovieListAdapter;
import com.danielbibovski.mvvmretrofit2livedataexampleapp.model.MovieModel;
import com.danielbibovski.mvvmretrofit2livedataexampleapp.viewmodel.MovieListViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private MovieListAdapter adapter;
    private List<MovieModel> movieModelsList;
    private MovieListViewModel viewModel;
    private TextView noResultTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noResultTv = findViewById(R.id.noResultTv);
        recyclerView = findViewById(R.id.recyclerView);
        linearLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter = new MovieListAdapter(this, movieModelsList);
        recyclerView.setAdapter(adapter);

        viewModel = new ViewModelProvider(this).get(MovieListViewModel.class);
        viewModel.getMoviesListObserver().observe(this, new Observer<List<MovieModel>>() {
            @Override
            public void onChanged(List<MovieModel> movieModels) {
                if(movieModels != null){
                    movieModelsList = movieModels;
                    adapter.setMovieList(movieModels);
                    noResultTv.setVisibility(View.GONE);
                }else{
                    noResultTv.setVisibility(View.VISIBLE);
                }
            }
        });
        viewModel.makeApiCall();
    }
}