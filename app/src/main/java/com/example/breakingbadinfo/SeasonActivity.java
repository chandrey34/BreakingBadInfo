package com.example.breakingbadinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SeasonActivity extends AppCompatActivity {
    private final ArrayList<Season> seasons = new ArrayList<>();


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
        //устанавливаем адаптер
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        seasons.add(new Season("Сезон №1"));
        seasons.add(new Season("Сезон №2"));
        seasons.add(new Season("Сезон №3"));
        seasons.add(new Season("Сезон №4"));
        seasons.add(new Season("Сезон №5"));


    }


}