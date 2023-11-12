package com.example.multimediakolana;

import android.os.Parcel;
import android.os.Parcelable;

public class Jokalariak implements Parcelable {
    private String playerName;
    private int imgId;

    public Jokalariak(String playerName, int imgId) {
        this.playerName = playerName;
        this.imgId = imgId;
    }
    protected Jokalariak(Parcel in) {
        playerName = in.readString();
        imgId = in.readInt();
    }
    public static final Creator<Jokalariak> CREATOR = new Creator<Jokalariak>() {
        @Override
        public Jokalariak createFromParcel(Parcel in) {
            return new Jokalariak(in);
        }

        @Override
        public Jokalariak[] newArray(int size) {
            return new Jokalariak[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(playerName);
        dest.writeInt(imgId);
    }

    public int getImage() {
        return  imgId;
    }



    public String getJokalariakName() {
        return playerName;
    }
}