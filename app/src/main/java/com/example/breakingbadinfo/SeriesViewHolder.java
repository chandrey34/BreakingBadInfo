package com.example.breakingbadinfo;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SeriesViewHolder extends RecyclerView.ViewHolder {
    private TextView textViewNumberSeries;

    public SeriesViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewNumberSeries = itemView.findViewById(R.id.textViewNumberSeries);
    }

    public void bind(String series) {
        textViewNumberSeries.setText(series);
    }
}