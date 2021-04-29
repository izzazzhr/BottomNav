package com.example.bottomnav;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MovieRecyclerAdapter extends RecyclerView.Adapter<MovieRecyclerAdapter.ViewHolder> {
    private List<MovieModel> movies;
    private OnItemClickListener<MovieModel> clickListener;

    public void setMovies(ArrayList<MovieModel> movies) {this.movies=movies;}


    public void setClickListener(OnItemClickListener<MovieModel> clickListener) {
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_layout, parent, false );

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(movies.get(position));
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        MovieModel movie;
        ImageView ivPosters;
        TextView tvMovieName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            ivPosters = itemView.findViewById(R.id.iv_movies);
            tvMovieName = itemView.findViewById(R.id.tv_movieTitle);
        }

        public void onBind(MovieModel movie){
            this.movie = movie;
            ivPosters.setImageResource(movie.getPoster());
            tvMovieName.setText(movie.getMovieNme());

        }

        @Override
        public void onClick(View v) {
            clickListener.onClick(movie);

        }
    }
}
