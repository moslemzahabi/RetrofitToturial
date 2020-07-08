package com.example.retrofittoturial;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {
    @GET("song_json.php")
    Call<List<Song>>getSongList();
}
