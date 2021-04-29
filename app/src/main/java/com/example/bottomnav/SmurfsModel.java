package com.example.bottomnav;

import android.os.Parcel;
import android.os.Parcelable;

public class SmurfsModel implements Parcelable {

    private String name;
    private String summary;
    private int photo;

    public SmurfsModel(){}

    protected SmurfsModel(Parcel in){
        name = in.readString();
        summary = in.readString();
        photo = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(summary);
        dest.writeInt(photo);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<SmurfsModel> CREATOR = new Creator<SmurfsModel>() {
        @Override
        public SmurfsModel createFromParcel(Parcel in) {
            return new SmurfsModel(in);
        }

        @Override
        public SmurfsModel[] newArray(int size) {
            return new SmurfsModel[size];
        }
    };


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
