package com.example.breakingbadinfo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class SeasonAdapter extends RecyclerView.Adapter<SeasonAdapter.MyViewHolder> {
    ArrayList<Season> seasons;

    public SeasonAdapter(ArrayList<Season> seasons) {
        this.seasons = new ArrayList<>(seasons);
    }

    public void setList(ArrayList<Season> seasons) {
        this.seasons = seasons;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SeasonAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_season, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SeasonAdapter.MyViewHolder holder, int position) {
        Season season = seasons.get(position);
        holder.seasonView.setText(season.getNumberSeason());
    }

    @Override
    public int getItemCount() {
        return seasons.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView seasonView;

        public MyViewHolder(View view) {
            super(view);
            seasonView = view.findViewById(R.id.textViewNumberSeason);
        }
    }
}

