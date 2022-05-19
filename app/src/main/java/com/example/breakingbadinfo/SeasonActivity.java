package com.example.breakingbadinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import java.util.ArrayList;

public class SeasonActivity extends AppCompatActivity {
    ArrayList<Season> seasons = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season);
        //вызываем список данных
        setInitialData();
        //объявляем RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        //упорядочиваем элементы в виде списка с одной колонкой
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //создаем объект адаптера
        SeasonAdapter adapter = new SeasonAdapter(seasons);
        adapter.setList(seasons);
        //устанавливаем адаптер
        recyclerView.setAdapter(adapter);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                adapter.setList(seasons);
                adapter.seasons.add(new Season("Пробую что-то положить в список 1"));
                adapter.seasons.add(new Season("Пробую что-то положить в список 2"));
                adapter.seasons.add(new Season("Пробую что-то положить в список 3"));
                adapter.seasons.add(new Season("Пробую что-то положить в список 4"));
            }
        }, 3000);

    }

    private void setInitialData() {

        seasons.add(new Season("Сезон №1"));
        seasons.add(new Season("Сезон №2"));
        seasons.add(new Season("Сезон №3"));
        seasons.add(new Season("Сезон №4"));
        seasons.add(new Season("Сезон №5"));
    }
}