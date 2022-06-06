package com.example.breakingbadinfo;

import android.widget.ImageView;

import java.util.ArrayList;

public class CharacterDataModel {
    private String characterImage;
    private String characterText;

    public CharacterDataModel(String characterImage, String characterText) {
        this.characterImage = characterImage;
        this.characterText = characterText;
    }

    public String getCharacterImage() {
        return characterImage;
    }

    public String getCharacterText() {
        return characterText;
    }
}