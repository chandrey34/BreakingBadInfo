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

        //обработчик события по нажатию на кнопки с главного экрана
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.series_btn:
                        openSeriesActivity();
                        break;
                    case R.id.character_btn:
                        openCharacterActivity();
                        break;
                    case R.id.quotes_btn:
                        openQuotesActivity();
                        break;
                    case R.id.death_btn:
                        openDeathActivity();
                        break;
                }
            }
        };
        series_btn.setOnClickListener(onClickListener);
        character_btn.setOnClickListener(onClickListener);
        quotes_btn.setOnClickListener(onClickListener);
        death_btn.setOnClickListener(onClickListener);
    }

//        //обработчик события по нажатию на кнопку Серии
//        series_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openSeriesActivity();
//                openCharacterActivity();
//                openQuotesActivity();
//                openDeathActivity();
//            }
//        });
//        //обработчик события по нажатию на кнопку Персонажи
//        character_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openCharacterActivity();
//            }
//        });
//        //обработчик события по нажатию на кнопку Цитаты
//        quotes_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openQuotesActivity();
//            }
//        });
//        //обработчик события по нажатию на кнопку Смерти
//        death_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openDeathActivity();
//            }
//        });
//}


    //метод перехода на другой экран с Сериями
    public void openSeriesActivity() {
        Intent intent = new Intent(this, SeriesActivity.class);
        startActivity(intent);
    }

    public void openCharacterActivity() {
        Intent intent = new Intent(this, CharacterActivity.class);
        startActivity(intent);
    }

    public void openQuotesActivity() {
        Intent intent = new Intent(this, QuotesActivity.class);
        startActivity(intent);
    }

    public void openDeathActivity() {
        Intent intent = new Intent(this, DeathActivity.class);
        startActivity(intent);
    }


}







