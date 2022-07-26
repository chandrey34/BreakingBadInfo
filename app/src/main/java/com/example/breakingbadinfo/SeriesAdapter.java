package com.example.breakingbadinfo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SeriesAdapter extends RecyclerView.Adapter<SeriesViewHolder> {
    private ArrayList<Series> seriesList;

    public SeriesAdapter(ArrayList<Series> seriesList) {
        this.seriesList = seriesList;
    }

    @NonNull
    @Override
    public SeriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_series, parent, false);
        return new SeriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SeriesViewHolder holder, int position) {
        Series series = seriesList.get(position);
        holder.bind(series);
    }

    @Override
    public int getItemCount() {
        return seriesList.size();
    }
}