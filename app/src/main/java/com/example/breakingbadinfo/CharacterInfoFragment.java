package com.example.breakingbadinfo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class CharacterInfoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_character_info, container, false);

        ImageView characterImageInfo = view.findViewById(R.id.characterImageInfo);
        TextView nameCharacterTextInfo = view.findViewById(R.id.nameCharacterTextInfo);
        TextView birthdayCharacterTextInfo = view.findViewById(R.id.birthdayCharacterTextInfo);
        TextView seasonsCharacterTextInfo = view.findViewById(R.id.seasonsCharacterTextInfo);
        TextView nickNameCharacterTextInfo = view.findViewById(R.id.nickNameCharacterTextInfo);
        TextView portrayedCharacterTextInfo = view.findViewById(R.id.portrayedCharacterTextInfo);

        CharacterDataModel characterDataModel = new CharacterDataModel();

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            characterDataModel = bundle.getParcelable(CharacterFragment.CHARACTER_TAG);
        }

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
        return view;
    }
}