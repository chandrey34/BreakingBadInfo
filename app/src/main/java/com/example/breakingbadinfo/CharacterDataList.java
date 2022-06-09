package com.example.breakingbadinfo;

import java.util.ArrayList;

public class CharacterDataList {
    private ArrayList<CharacterDataModel> characterDataModel = new ArrayList<>();

    public ArrayList<CharacterDataModel> getCharacterDataModel() {
        return characterDataModel;
    }

    public void characterList() {
        characterDataModel.add(new CharacterDataModel(R.drawable.character, "Андрей Чеченов", "01/02/1996", "1,2", "Чечен", "Андрей Сергеевич Чеченов"));
        characterDataModel.add(new CharacterDataModel(R.drawable.character1, "Алексей Гвоздев", "Не помню(", "1,2,3", "Леха", "Алексей Гвоздев"));
        characterDataModel.add(new CharacterDataModel(R.drawable.character2, "Жанна Абашина", "20.11.1996", "1,2,3, 4", "Жанэт", "Жанна Сергеевна Абашина"));
    }
}