package com.example.retrofittoturial;

import com.google.gson.annotations.SerializedName;

public class Song {
    @SerializedName("song_name")
    private  String song_name;

    @SerializedName("song_id")
    private  String song_id ;

    @SerializedName("artist_name")
    private  String artist_name;

    public Song(String song_name, String song_id, String artist_name) {
        this.song_name = song_name;
        this.song_id = song_id;
        this.artist_name = artist_name;
    }

    public String getSong_name() {
        return song_name;
    }

    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }

    public String getSong_id() {
        return song_id;
    }

    public void setSong_id(String song_id) {
        this.song_id = song_id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }
}
