package com.example.bottomnav;

import android.os.Parcel;
import android.os.Parcelable;

public class MovieModel implements Parcelable {

    private String movieNme;
    private int poster;

    public MovieModel(){}

    protected MovieModel(Parcel in){
        movieNme = in.readString();
        poster = in.readInt();
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(movieNme);
        dest.writeInt(poster);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<MovieModel> CREATOR = new Creator<MovieModel>() {
        @Override
        public MovieModel createFromParcel(Parcel in) {
            return new MovieModel(in);
        }

        @Override
        public MovieModel[] newArray(int size) {
            return new MovieModel[size];
        }
    };

    public String getMovieNme() {
        return movieNme;
    }

    public void setMovieNme(String movieNme) {
        this.movieNme = movieNme;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }
}
