package com.example.breakingbadinfo;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class CharacterDataModel implements Parcelable {

    private String characterImage;

    private String characterText;

    private String birthdayCharacterTextInfo;

    private List<Integer> seasonsCharacterTextInfo = null;

    private String nickNameCharacterTextInfo;

    private String portrayedCharacterTextInfo;

    public CharacterDataModel(Parcel parcel) {
        characterImage = parcel.readString();
        characterText = parcel.readString();
        birthdayCharacterTextInfo = parcel.readString();
        parcel.readList(seasonsCharacterTextInfo, ClassLoader.getSystemClassLoader());
        nickNameCharacterTextInfo = parcel.readString();
        portrayedCharacterTextInfo = parcel.readString();
    }

    public CharacterDataModel(CharactersApiResponse charactersApiResponse) {
        this.characterImage = charactersApiResponse.getImg();
        this.characterText = charactersApiResponse.getName();
        this.birthdayCharacterTextInfo = charactersApiResponse.getBirthday();
        this.seasonsCharacterTextInfo = charactersApiResponse.getAppearance();
        this.nickNameCharacterTextInfo = charactersApiResponse.getNickname();
        this.portrayedCharacterTextInfo = charactersApiResponse.getPortrayed();
    }

    public CharacterDataModel() {
    }

    public String getCharacterImage() {
        return characterImage;
    }

    public String getCharacterText() {
        return characterText;
    }

    public String getBirthdayCharacterTextInfo() {
        return birthdayCharacterTextInfo;
    }

    public List<Integer> getSeasonsCharacterTextInfo() {
        return seasonsCharacterTextInfo;
    }

    public String getNickNameCharacterTextInfo() {
        return nickNameCharacterTextInfo;
    }

    public String getPortrayedCharacterTextInfo() {
        return portrayedCharacterTextInfo;
    }

    public static final Parcelable.Creator<CharacterDataModel> CREATOR = new Parcelable.Creator<CharacterDataModel>() {
        public CharacterDataModel createFromParcel(Parcel parcel) {
            return new CharacterDataModel(parcel);
        }

        @Override
        public CharacterDataModel[] newArray(int size) {
            return new CharacterDataModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(characterImage);
        parcel.writeString(characterText);
        parcel.writeString(birthdayCharacterTextInfo);
        parcel.writeString(String.valueOf(seasonsCharacterTextInfo));
        parcel.writeString(nickNameCharacterTextInfo);
        parcel.writeString(portrayedCharacterTextInfo);
    }
}