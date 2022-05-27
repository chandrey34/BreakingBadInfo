package com.example.breakingbadinfo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeasonAdapter extends RecyclerView.Adapter<SeasonAdapter.SeasonViewHolder> {
    private ArrayList<DataModel> myList;
    private ArrayList<String> list = new ArrayList<>();

    public SeasonAdapter(ArrayList<DataModel> myList) {
        this.myList = new ArrayList<>(myList);
    }

    public void setList(ArrayList<DataModel> myList) {
        this.myList = myList;
        myList.clear();
        myList.addAll(myList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SeasonAdapter.SeasonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_seasons, parent, false);
        return new SeasonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SeasonAdapter.SeasonViewHolder holder, int position) {
        DataModel dataModel = myList.get(position);
        holder.textViewNumberSeason.setText(dataModel.getItemText());

        boolean isExpandable = dataModel.isExpandable();
        holder.expandableLayout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);

        if (isExpandable) {
            holder.imageArrow.setImageResource(R.drawable.arrow_up);
        } else holder.imageArrow.setImageResource(R.drawable.arrow_down);

        SeriesAdapter seriesAdapter = new SeriesAdapter(list);
        holder.seasonsRecyclerView.setLayoutManager(new LinearLayoutManager(holder.itemView.getContext()));
        holder.seasonsRecyclerView.setHasFixedSize(true);
        holder.seasonsRecyclerView.setAdapter(seriesAdapter);

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataModel.setExpandable(!dataModel.isExpandable());
                list = dataModel.getSeriesList();
                notifyItemChanged(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    public static class SeasonViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout linearLayout;
        private RelativeLayout expandableLayout;
        private TextView textViewNumberSeason;
        private ImageView imageArrow;
        private RecyclerView seasonsRecyclerView;

        public SeasonViewHolder(View view) {
            super(view);
            linearLayout = view.findViewById(R.id.linerLayout);
            expandableLayout = view.findViewById(R.id.expandableLayout);
            textViewNumberSeason = view.findViewById(R.id.textViewNumberSeason);
            imageArrow = view.findViewById(R.id.imageArrow);
            seasonsRecyclerView = view.findViewById(R.id.seasonsRecyclerView);
        }
    }
}