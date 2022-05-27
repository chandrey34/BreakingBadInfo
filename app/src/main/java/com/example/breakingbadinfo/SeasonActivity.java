package com.example.breakingbadinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import java.util.ArrayList;

public class SeasonActivity extends AppCompatActivity {
    private ArrayList<DataModel> dataModel = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season);
        setSeason1();
        setSeason2();
        setSeason3();
        setSeason4();
        //объявляем RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        //упорядочиваем элементы в виде списка с одной колонкой
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //список
        //создаем объект адаптера
        SeasonAdapter adapter = new SeasonAdapter(dataModel);
        //устанавливаем адаптер
        recyclerView.setAdapter(adapter);
    }

    private void setSeason1() {
        ArrayList<String> season1 = new ArrayList<>();
        season1.add("Серия 1");
        season1.add("Серия 2");
        season1.add("Серия 3");
        season1.add("Серия 4");
        season1.add("Серия 5");
        season1.add("Серия 6");
        season1.add("Серия 7");
        season1.add("Серия 8");
        season1.add("Серия 9");
        season1.add("Серия 10");
        dataModel.add(new DataModel(season1, "Сезон 1"));
    }

    private void setSeason2() {
        ArrayList<String> season2 = new ArrayList<>();
        season2.add("Серия 1");
        season2.add("Серия 2");
        season2.add("Серия 3");
        season2.add("Серия 4");
        season2.add("Серия 5");
        season2.add("Серия 6");
        season2.add("Серия 7");
        season2.add("Серия 8");
        season2.add("Серия 9");
        season2.add("Серия 10");
        dataModel.add(new DataModel(season2, "Сезон 2"));
    }

    private void setSeason3() {
        ArrayList<String> season3 = new ArrayList<>();
        season3.add("Серия 1");
        season3.add("Серия 2");
        season3.add("Серия 3");
        season3.add("Серия 4");
        season3.add("Серия 5");
        season3.add("Серия 6");
        season3.add("Серия 7");
        season3.add("Серия 8");
        season3.add("Серия 9");
        season3.add("Серия 10");
        dataModel.add(new DataModel(season3, "Сезон 3"));
    }

    private void setSeason4() {
        ArrayList<String> season4 = new ArrayList<>();
        season4.add("Серия 1");
        season4.add("Серия 2");
        season4.add("Серия 3");
        season4.add("Серия 4");
        season4.add("Серия 5");
        season4.add("Серия 6");
        season4.add("Серия 7");
        season4.add("Серия 8");
        season4.add("Серия 9");
        season4.add("Серия 10");
        dataModel.add(new DataModel(season4, "Сезон 4"));
    }
}