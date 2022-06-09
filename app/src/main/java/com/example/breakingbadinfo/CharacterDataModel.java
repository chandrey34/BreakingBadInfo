package com.example.breakingbadinfo;


public class CharacterDataModel {
    private int characterImage;
    private String characterText;
    private String birthdayCharacterTextInfo;
    private String seasonsCharacterTextInfo;
    private String nickNameCharacterTextInfo;
    private String portrayedCharacterTextInfo;

    public CharacterDataModel(int characterImage, String characterText, String birthdayCharacterTextInfo, String seasonsCharacterTextInfo, String nickNameCharacterTextInfo, String portrayedCharacterTextInfo) {
        this.characterImage = characterImage;
        this.characterText = characterText;
        this.birthdayCharacterTextInfo = birthdayCharacterTextInfo;
        this.seasonsCharacterTextInfo = seasonsCharacterTextInfo;
        this.nickNameCharacterTextInfo = nickNameCharacterTextInfo;
        this.portrayedCharacterTextInfo = portrayedCharacterTextInfo;
    }

    public int getCharacterImage() {
        return characterImage;
    }

    public String getCharacterText() {
        return characterText;
    }

    public String getBirthdayCharacterTextInfo() {
        return birthdayCharacterTextInfo;
    }

    public String getSeasonsCharacterTextInfo() {
        return seasonsCharacterTextInfo;
    }

    public String getNickNameCharacterTextInfo() {
        return nickNameCharacterTextInfo;
    }

    public String getPortrayedCharacterTextInfo() {
        return portrayedCharacterTextInfo;
    }
}