package com.example.bottomnav;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MovieFragment extends Fragment implements OnItemClickListener<SmurfsModel> {


    private RecyclerView recyclerViewSmurfs;
    private SmurfsRecyclerAdapter adapter;


    public static MovieFragment newInstance() {
        MovieFragment fragment = new MovieFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_movie_fragment, container, false);
        recyclerViewSmurfs = view.findViewById(R.id.recyclerview);
        adapter = new SmurfsRecyclerAdapter();
        adapter.setSmurfs(SmurfsDatabase.getListData());
        recyclerViewSmurfs.setHasFixedSize(true);
        adapter.setClickListener(this);
        recyclerViewSmurfs.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerViewSmurfs.setAdapter(adapter);
        return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void onClick(SmurfsModel smurfsModel){
        Intent intent = new Intent(getActivity(), SmurfDetails.class);
        intent.putExtra(SmurfDetails.details, smurfsModel);
        startActivity(intent);
    }

}