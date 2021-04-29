package com.example.bottomnav;

import java.util.ArrayList;

public class MovieDatabase {

    private static String[] movieNames = {
            "The Smurfs",
            "Smurfs: The Lost Village",
            "The Legend of Smurfy Hollow",
            "The Smurfs 2",
            "The Good, the Bad and the Smurfy",
            "The Prince and the Peewit",
            "Return of Clockwork Smurf",
            "Once in a Bluemoon",
            "The Haunted Castle",
            "The Black Hellebore"

    };

    private static int[] movieImages = {
            R.drawable.the_smurfs,
            R.drawable.lostvillage,
            R.drawable.smurfy_hollow,
            R.drawable.smurfs2,
            R.drawable.goodbad,
            R.drawable.peewit,
            R.drawable.clockwork,
            R.drawable.bluemoon,
            R.drawable.haunted,
            R.drawable.blackhallebore
    };

    static ArrayList<MovieModel> getListMovies(){
        ArrayList<MovieModel> list = new ArrayList<>();
        for (int position = 0; position<movieNames.length; position++){
            MovieModel movies = new MovieModel();
            movies.setMovieNme(movieNames[position]);
            movies.setPoster(movieImages[position]);
            list.add(movies);

        }
        return list;
    }
}
