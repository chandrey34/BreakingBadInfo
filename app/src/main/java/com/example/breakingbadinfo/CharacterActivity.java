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

        CharacterDataList characterDataList = new CharacterDataList();
        characterDataList.characterList();

        RecyclerView recyclerView = findViewById(R.id.recyclerViewCharacter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        CharacterAdapter characterAdapter = new CharacterAdapter(characterDataList.getCharacterDataModel());
        recyclerView.setAdapter(characterAdapter);
    }
}