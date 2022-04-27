package com.example.breakingbadinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //объявляем кнопки
    private Button series_btn, character_btn, quotes_btn, death_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //присваеваем кнопкам ссылки
        series_btn = (Button) findViewById(R.id.series_btn);
        character_btn = (Button) findViewById(R.id.character_btn);
        quotes_btn = (Button) findViewById(R.id.quotes_btn);
        death_btn = (Button) findViewById(R.id.death_btn);

        //обработчик события по нажатию на кнопку Серии
        series_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSeriesActivity();
            }
        });
        //обработчик события по нажатию на кнопку Персонажи
        character_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCharacterActivity();
            }
        });
        //обработчик события по нажатию на кнопку Цитаты
        quotes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openQuotesActivity();
            }
        });
        //обработчик события по нажатию на кнопку Смерти
        death_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDeathActivity();
            }
        });
    }

    //метод перехода на другой экран с Сериями
    public void openSeriesActivity() {
        Intent intent = new Intent(this, SeriesActivity.class);
        startActivity(intent);
    }
    //метод перехода на другой экран с Персонажами
    public void openCharacterActivity() {
        Intent intent = new Intent(this, CharacterActivity.class);
        startActivity(intent);
    }
    //метод перехода на другой экран с Цитатами
    public void openQuotesActivity() {
        Intent intent = new Intent(this, QuotesActivity.class);
        startActivity(intent);
    }
    //метод перехода на другой экран с Смертями
    public void openDeathActivity() {
        Intent intent = new Intent(this, DeathActivity.class);
        startActivity(intent);
    }


}
