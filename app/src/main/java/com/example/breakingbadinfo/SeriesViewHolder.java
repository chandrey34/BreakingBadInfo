package com.example.breakingbadinfo;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SeriesViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewNumberSeries;
    private TextView textViewNameSeries;

    public SeriesViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewNumberSeries = itemView.findViewById(R.id.textViewNumberSeries);
        textViewNameSeries = itemView.findViewById(R.id.textViewNameSeries);
    }

    public void bind(Series series) {
        textViewNumberSeries.setText(series.getNumberSeries());
        textViewNameSeries.setText(series.getNameSeries());
    }
}