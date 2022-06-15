package com.example.breakingbadinfo;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class CharacterActivity extends AppCompatActivity implements CharacterAdapter.OnCharacterClickListener {
    public static final String CHARACTER_TAG = "characterTag";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        CharacterDataList characterDataList = new CharacterDataList();
        characterDataList.characterList();

        RecyclerView recyclerView = findViewById(R.id.recyclerViewCharacter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CharacterAdapter characterAdapter = new CharacterAdapter(this, characterDataList.getCharacterDataModel());
        recyclerView.setAdapter(characterAdapter);
    }

    //реализовываем метод интерфейса для перехода во 2 активити с передачей всего объекта
    @Override
    public void onCharacterClick(CharacterDataModel characterDataModel) {
        Intent intent = new Intent(CharacterActivity.this, CharacterInfoActivity.class);
        intent.putExtra(CHARACTER_TAG, characterDataModel);
        startActivity(intent);
    }
}