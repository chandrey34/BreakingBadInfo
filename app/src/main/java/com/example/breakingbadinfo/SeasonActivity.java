package com.example.breakingbadinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;

public class SeasonActivity extends AppCompatActivity {
    private ArrayList<SeasonDataModel> seasonDataModel = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season);
        SeasonDataList.setSeason1();
        SeasonDataList.setSeason2();
        SeasonDataList.setSeason3();
        SeasonDataList.setSeason4();
        SeasonDataList.setSeason5();
        //объявляем RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        //упорядочиваем элементы в виде списка с одной колонкой
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //создаем объект адаптера
        SeasonAdapter adapter = new SeasonAdapter(SeasonDataList.getSeasonDataModel());
        //устанавливаем адаптер
        recyclerView.setAdapter(adapter);
    }
}