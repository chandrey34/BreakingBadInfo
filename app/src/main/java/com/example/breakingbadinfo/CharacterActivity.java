package com.example.breakingbadinfo;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class CharacterActivity extends AppCompatActivity implements CharacterAdapter.OnCharacterClickListener {
    public static final String IMAGE_CHARACTER = "imageCharacter";
    public static final String NAME_CHARACTER = "nameCharacter";
    public static final String IMAGE_CHARACTER_INFO = "imageCharacterInfo";
    public static final String NAME_CHARACTER_INFO = "nameCharacterInfo";
    public static final String BIRTHDAY_CHARACTER_INFO = "birthdayCharacterInfo";
    public static final String SEASON_CHARACTER_INFO = "seasonCharacterInfo";
    public static final String NICKNAME_CHARACTER_INFO = "nickNameCharacterInfo";
    public static final String PORTRAYED_CHARACTER_INFO = "portrayedCharacterInfo";

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
        intent.putExtra(IMAGE_CHARACTER, characterDataModel.getCharacterImage());
        intent.putExtra(NAME_CHARACTER, characterDataModel.getCharacterText());
        intent.putExtra(IMAGE_CHARACTER_INFO, characterDataModel.getCharacterImage());
        intent.putExtra(NAME_CHARACTER_INFO, characterDataModel.getCharacterText());
        intent.putExtra(BIRTHDAY_CHARACTER_INFO , characterDataModel.getBirthdayCharacterTextInfo());
        intent.putExtra(SEASON_CHARACTER_INFO, characterDataModel.getSeasonsCharacterTextInfo());
        intent.putExtra(NICKNAME_CHARACTER_INFO, characterDataModel.getNickNameCharacterTextInfo());
        intent.putExtra(PORTRAYED_CHARACTER_INFO, characterDataModel.getPortrayedCharacterTextInfo());
        startActivity(intent);
    }
}