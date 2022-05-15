package com.example.breakingbadinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class seasonAdapter extends RecyclerView.Adapter<seasonAdapter.MyViewHolder> {
    private final LayoutInflater inflater;
    private final ArrayList<Season> seasons;


    public seasonAdapter(Context context, ArrayList<Season> seasons) {
        this.seasons = seasons;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    //возвращает объект MyViewHolder, который будет хранить данные по одному объекту Seasons.
    public seasonAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflater - создает из содержимого layout файла элемет View
        View view = inflater.inflate(R.layout.list_season, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    //выполняет привязку объекта MyViewHolder к объекту Seasons по определенной позиции.
    public void onBindViewHolder(@NonNull seasonAdapter.MyViewHolder holder, int position) {
        Season season = seasons.get(position);
        holder.seasonView.setText(season.getNumber_season());
    }

    @Override
    //возвращает количество объектов в списке
    public int getItemCount() {
        return seasons.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView seasonView;
        public MyViewHolder(View view) {
            super(view);
            seasonView = view.findViewById(R.id.numberSeason);
        }
    }
}

