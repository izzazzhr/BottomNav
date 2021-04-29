package com.example.bottomnav;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TvShowFragment extends Fragment implements OnItemClickListener<MovieModel> {

    private RecyclerView rvMovies;
    private MovieRecyclerAdapter adapter;

    public static TvShowFragment newInstance() {
        TvShowFragment fragment = new TvShowFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_tv_show_fragment, container, false);
        rvMovies = view.findViewById(R.id.rvMovies);
        adapter = new MovieRecyclerAdapter();
        adapter.setMovies(MovieDatabase.getListMovies());
        rvMovies.setHasFixedSize(true);
        adapter.setClickListener(this);
        rvMovies.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        rvMovies.setAdapter(adapter);
        return view;



    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public void onClick(MovieModel movieModel) {

    }
}