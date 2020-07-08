package com.example.retrofittoturial;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adapter_Song extends RecyclerView.Adapter<Adapter_Song.MyViewHolder>  {
private List<Song>myfriends;


    public Adapter_Song(List<Song> myfriends){
        this.myfriends=(myfriends==null)?
                new ArrayList<Song>():myfriends;



    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
      View itemView=  LayoutInflater.from(parent.getContext()).inflate(R.layout.list_lay,parent,false);



      return new MyViewHolder(itemView);
    }




    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
holder.bind(myfriends.get(position));
    }

    @Override
    public int getItemCount() {//...........تعداد عناصر لیست...............
        return myfriends.size();
    }





    public  class  MyViewHolder extends RecyclerView.ViewHolder  {
TextView artistname,songname,year;
    MyViewHolder(View itemView){

        super(itemView);

        artistname=itemView.findViewById(R.id.artistname);
        songname=itemView.findViewById(R.id.songname);
        year=itemView.findViewById(R.id.id);

    }
public  void bind(final Song myfriend){
        artistname.setText(myfriend.getArtist_name());
        songname.setText(myfriend.getSong_name());
        year.setText(myfriend.getSong_id());

}


    }


}
