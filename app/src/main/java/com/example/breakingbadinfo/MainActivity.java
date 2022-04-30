package com.example.breakingbadinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //объявляем кнопки и присваеваем кнопкам ссылки
        Button series_btn = (Button) findViewById(R.id.series_btn);
        Button character_btn = (Button) findViewById(R.id.character_btn);
        Button quotes_btn = (Button) findViewById(R.id.quotes_btn);
        Button death_btn = (Button) findViewById(R.id.death_btn);

        //обработчик события по нажатию на кнопку Серии
        series_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(view);
            }
        });
        //обработчик события по нажатию на кнопку Персонажи
        character_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(view);
            }
        });
        //обработчик события по нажатию на кнопку Цитаты
        quotes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(view);
            }
        });
        //обработчик события по нажатию на кнопку Смерти
        death_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(view);
            }
        });
    }

    //метод перехода на другой экран с Сериями
    public void openActivity(View view) {
        switch (view.getId()) {
            case R.id.series_btn:
                Intent intent = new Intent(MainActivity.this, SeriesActivity.class);
                startActivity(intent);
                break;
            case R.id.character_btn:
                Intent intent1 = new Intent(MainActivity.this, CharacterActivity.class);
                startActivity(intent1);
                break;
            case R.id.quotes_btn:
                Intent intent2 = new Intent(this, QuotesActivity.class);
                startActivity(intent2);
                break;
            case R.id.death_btn:
                Intent intent3 = new Intent(this, DeathActivity.class);
                startActivity(intent3);
                break;
        }
    }
}







