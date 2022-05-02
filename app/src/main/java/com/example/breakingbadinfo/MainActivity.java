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

    //переход на соответствующее activity по нажатию на кнопку Серии, Песонажи, Цитаты, Смерти
    public void openActivity(View view) {
        switch (view.getId()) {
            case R.id.series_btn:
                startActivity(SeriesActivity.class);
                break;
            case R.id.character_btn:
                startActivity(CharacterActivity.class);
                break;
            case R.id.quotes_btn:
                startActivity(QuotesActivity.class);
                break;
            case R.id.death_btn:
                startActivity(DeathActivity.class);
                break;
        }
    }

    //метод реализующий переход на другое activity
    private void startActivity(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }
}







