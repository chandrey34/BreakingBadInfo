package com.example.breakingbadinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class CharacterActivity extends AppCompatActivity implements CharacterAdapter.OnCharacterClickListener {

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

    //реализовываем метод интерфейса для перехода во 2 активити с ключами модельки по которой кликнул
    @Override
    public void onCharacterClick(CharacterDataModel characterDataModel) {
        Intent intent = new Intent(CharacterActivity.this, CharacterInfoActivity.class);
        intent.putExtra("imageCharacter", characterDataModel.getCharacterImage());
        intent.putExtra("nameCharacter", characterDataModel.getCharacterText());
        intent.putExtra("imageCharacterInfo", characterDataModel.getCharacterImage());
        intent.putExtra("nameCharacterInfo", characterDataModel.getCharacterText());
        intent.putExtra("birthdayCharacterInfo", characterDataModel.getBirthdayCharacterTextInfo());
        intent.putExtra("seasonCharacterInfo", characterDataModel.getSeasonsCharacterTextInfo());
        intent.putExtra("nickNameCharacterInfo", characterDataModel.getNickNameCharacterTextInfo());
        intent.putExtra("portrayedCharacterInfo", characterDataModel.getPortrayedCharacterTextInfo());
        startActivity(intent);
    }
}