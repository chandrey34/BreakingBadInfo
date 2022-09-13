package com.example.breakingbadinfo;

import java.util.ArrayList;
import java.util.List;

public class CharactersMapper {

    public static List<CharacterDataModel> transformSmart(List<CharactersApiResponse> charactersApiResponseList) {
        List<CharacterDataModel> characterDataModelList = new ArrayList<>();
        for (CharactersApiResponse charactersApiResponse : charactersApiResponseList) {
            characterDataModelList.add(new CharacterDataModel(charactersApiResponse));

        }
        return characterDataModelList;
    }
}