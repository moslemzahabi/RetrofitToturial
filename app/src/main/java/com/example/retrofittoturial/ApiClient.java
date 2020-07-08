package com.example.retrofittoturial;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
public  static Retrofit getSong(){
String BaseUrl ="https://programchi.ir/api/";
    Retrofit retrofit =new Retrofit.Builder()
            .baseUrl(BaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    return  retrofit;
}

}
//https://programchi.ir/api/song_json.php/192.168.1.36