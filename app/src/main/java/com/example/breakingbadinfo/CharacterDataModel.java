package com.example.breakingbadinfo;


import android.os.Parcel;
import android.os.Parcelable;

public class CharacterDataModel implements Parcelable {
    private int characterImage;
    private String characterText;
    private String birthdayCharacterTextInfo;
    private String seasonsCharacterTextInfo;
    private String nickNameCharacterTextInfo;
    private String portrayedCharacterTextInfo;

    public CharacterDataModel(Parcel parcel) {
        characterImage = parcel.readInt();
        characterText = parcel.readString();
        birthdayCharacterTextInfo = parcel.readString();
        seasonsCharacterTextInfo = parcel.readString();
        nickNameCharacterTextInfo = parcel.readString();
        portrayedCharacterTextInfo = parcel.readString();
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

    public static final Parcelable.Creator<CharacterDataModel> CREATOR = new Parcelable.Creator<CharacterDataModel>() {
        public CharacterDataModel createFromParcel(Parcel parcel) {
            return new CharacterDataModel(parcel);
        }

        @Override
        public CharacterDataModel[] newArray(int size) {
            return new CharacterDataModel[size];
        }
    };

    public CharacterDataModel(int characterImage, String characterText, String birthdayCharacterTextInfo, String seasonsCharacterTextInfo, String nickNameCharacterTextInfo, String portrayedCharacterTextInfo) {
        this.characterImage = characterImage;
        this.characterText = characterText;
        this.birthdayCharacterTextInfo = birthdayCharacterTextInfo;
        this.seasonsCharacterTextInfo = seasonsCharacterTextInfo;
        this.nickNameCharacterTextInfo = nickNameCharacterTextInfo;
        this.portrayedCharacterTextInfo = portrayedCharacterTextInfo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(characterImage);
        parcel.writeString(characterText);
        parcel.writeString(birthdayCharacterTextInfo);
        parcel.writeString(seasonsCharacterTextInfo);
        parcel.writeString(nickNameCharacterTextInfo);
        parcel.writeString(portrayedCharacterTextInfo);
    }
}