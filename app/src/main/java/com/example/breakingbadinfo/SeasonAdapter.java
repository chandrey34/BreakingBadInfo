package com.example.breakingbadinfo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class SeasonAdapter extends RecyclerView.Adapter<SeasonViewHolder> {
    private ArrayList<SeasonDataModel> myList;

    public SeasonAdapter(List<SeasonDataModel> myList) {
        this.myList = new ArrayList<>(myList);
    }



    public void setList(ArrayList<SeasonDataModel> myList) {
        this.myList = myList;
        myList.clear();
        myList.addAll(myList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public SeasonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_seasons, parent, false);
        return new SeasonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SeasonViewHolder holder, int position) {
        SeasonDataModel seasonDataModel = myList.get(position);
        holder.bind(seasonDataModel);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seasonDataModel.setExpandable(!seasonDataModel.isExpandable());
                notifyItemChanged(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }
}