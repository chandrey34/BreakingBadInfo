package com.example.breakingbadinfo;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class SeasonViewHolder extends RecyclerView.ViewHolder {

    private RelativeLayout expandableLayout;
    private TextView textViewNumberSeason;
    private ImageView imageArrow;
    private RecyclerView seasonRecyclerView;

    public SeasonViewHolder(View view) {
        super(view);
        expandableLayout = view.findViewById(R.id.expandableLayout);
        textViewNumberSeason = view.findViewById(R.id.textViewNumberSeason);
        imageArrow = view.findViewById(R.id.imageArrow);
        seasonRecyclerView = view.findViewById(R.id.seasonRecyclerView);
    }

    public void bind(SeasonDataModel seasonDataModel) {
        textViewNumberSeason.setText(seasonDataModel.getItemText());
        boolean isExpandable = seasonDataModel.isExpandable();
        expandableLayout.setVisibility(seasonDataModel.isExpandable() ? View.VISIBLE : View.GONE);
        if (isExpandable) {
            imageArrow.setImageResource(R.drawable.arrow_up);
        } else {
            imageArrow.setImageResource(R.drawable.arrow_down);
        }
        SeriesAdapter seriesAdapter = new SeriesAdapter(seasonDataModel.getSeriesList());
        seasonRecyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext()));
        seasonRecyclerView.setHasFixedSize(true);
        seasonRecyclerView.setAdapter(seriesAdapter);
    }
}