package com.example.retrofittoturial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
Adapter_Song adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        RequestInterface requestInterface=ApiClient.getSong().create(RequestInterface.class);

        Call<List<Song>>call=requestInterface.getSongList();

        call.enqueue(new Callback<List<Song>>() {
            @Override
            public void onResponse(Call<List<Song>> call, Response<List<Song>> response) {
                Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();

if(response.isSuccessful()){
    adapter=new Adapter_Song(response.body());
    recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    recyclerView.setAdapter(adapter);
}




//for(Song song:response.body()){
//
//Log.i("getsong",song.getSong_name()+"__"+song.getArtist_name()+"__"+song.getSong_id());
//
//}


            }

            @Override
            public void onFailure(Call<List<Song>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "failur", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void init() {
        recyclerView=findViewById(R.id.recyclerView);
    }
}
