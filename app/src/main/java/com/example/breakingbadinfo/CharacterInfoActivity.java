package com.example.breakingbadinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class CharacterInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_info);

        ImageView characterImageInfo = findViewById(R.id.characterImageInfo);
        TextView nameCharacterTextInfo = findViewById(R.id.nameCharacterTextInfo);
        TextView birthdayCharacterTextInfo = findViewById(R.id.birthdayCharacterTextInfo);
        TextView seasonsCharacterTextInfo = findViewById(R.id.seasonsCharacterTextInfo);
        TextView nickNameCharacterTextInfo = findViewById(R.id.nickNameCharacterTextInfo);
        TextView portrayedCharacterTextInfo = findViewById(R.id.portrayedCharacterTextInfo);

        //берем ключи которые передали из 1 активити
        Intent intent = getIntent();
        int imageCharacterInfo = intent.getIntExtra(CharacterActivity.IMAGE_CHARACTER_INFO, 0);
        String nameCharacterInfo = intent.getStringExtra(CharacterActivity.NAME_CHARACTER_INFO);
        String birthdayCharacterInfo = intent.getStringExtra(CharacterActivity.BIRTHDAY_CHARACTER_INFO);
        String seasonCharacterInfo = intent.getStringExtra(CharacterActivity.SEASON_CHARACTER_INFO);
        String nickNameCharacterInfo = intent.getStringExtra(CharacterActivity.NICKNAME_CHARACTER_INFO);
        String portrayedCharacterInfo = intent.getStringExtra(CharacterActivity.PORTRAYED_CHARACTER_INFO);

        //вставляем ключи в разметку
        characterImageInfo.setImageResource(imageCharacterInfo);
        nameCharacterTextInfo.setText(nameCharacterInfo);
        birthdayCharacterTextInfo.setText(birthdayCharacterInfo);
        seasonsCharacterTextInfo.setText(seasonCharacterInfo);
        nickNameCharacterTextInfo.setText(nickNameCharacterInfo);
        portrayedCharacterTextInfo.setText(portrayedCharacterInfo);
    }
}