package com.me.training.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by victo on 29/11/2016.
 */


public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    private List<Movie> movieList;
    Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title,year,genre;
        public ImageView image;

        public MyViewHolder(View view){
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
            image = (ImageView) view.findViewById(R.id.myImageView);
        }
    }

    public MoviesAdapter(List<Movie> movieList,Context context) {
        this.movieList = movieList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder,int position){
        Movie movie = movieList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
        Picasso.with(holder.itemView.getContext()).load(movie.getImage()).into(holder.image);

    }

    @Override
    public int getItemCount(){
        return movieList.size();
    }
}
