package com.example.breakingbadinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CharacterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);
        CharacterDataList.setCharacter();
        CharacterDataList.setCharacter2();
        CharacterDataList.setCharacter3();
        CharacterDataList.setCharacter4();
        CharacterDataList.setCharacter5();
        CharacterDataList.setCharacter6();
        CharacterDataList.setCharacter7();
        RecyclerView recyclerView = findViewById(R.id.recyclerViewCharacter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CharacterAdapter characterAdapter = new CharacterAdapter(CharacterDataList.getCharacterDataModel());
        recyclerView.setAdapter(characterAdapter);
    }
}