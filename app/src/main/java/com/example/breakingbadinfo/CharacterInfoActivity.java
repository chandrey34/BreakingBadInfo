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

        CharacterDataModel characterDataModel = getIntent().getParcelableExtra(CharacterActivity.CHARACTER_TAG);

//        берем ключи которые передали из 1 активити
        int imageCharacterInfo = characterDataModel.getCharacterImage();
        String nameCharacterInfo = characterDataModel.getCharacterText();
        String birthdayCharacterInfo = characterDataModel.getBirthdayCharacterTextInfo();
        String seasonCharacterInfo = characterDataModel.getSeasonsCharacterTextInfo();
        String nickNameCharacterInfo = characterDataModel.getNickNameCharacterTextInfo();
        String portrayedCharacterInfo = characterDataModel.getPortrayedCharacterTextInfo();

//        вставляем ключи в разметку
        characterImageInfo.setImageResource(imageCharacterInfo);
        nameCharacterTextInfo.setText(nameCharacterInfo);
        birthdayCharacterTextInfo.setText(birthdayCharacterInfo);
        seasonsCharacterTextInfo.setText(seasonCharacterInfo);
        nickNameCharacterTextInfo.setText(nickNameCharacterInfo);
        portrayedCharacterTextInfo.setText(portrayedCharacterInfo);
    }
}