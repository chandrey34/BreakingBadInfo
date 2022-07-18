package com.example.breakingbadinfo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CharacterInfoFragment extends Fragment {
    private static final String CHARACTER_TAG = "characterTag";

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

        CharacterDataModel characterDataModel = new CharacterDataModel(Parcel.obtain());

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            characterDataModel = bundle.getParcelable(CHARACTER_TAG);
        } else {
            openErrorDialog();
        }

        //берем данные которые передали и вставляем в разметку фрагмента
        characterImageInfo.setImageResource(characterDataModel.getCharacterImage());
        nameCharacterTextInfo.setText(characterDataModel.getCharacterText());
        birthdayCharacterTextInfo.setText(characterDataModel.getBirthdayCharacterTextInfo());
        seasonsCharacterTextInfo.setText(characterDataModel.getSeasonsCharacterTextInfo());
        nickNameCharacterTextInfo.setText(characterDataModel.getNickNameCharacterTextInfo());
        portrayedCharacterTextInfo.setText(characterDataModel.getPortrayedCharacterTextInfo());

        return view;
    }

    public static CharacterInfoFragment getInstance(CharacterDataModel characterDataModel) {
        CharacterInfoFragment fragment = new CharacterInfoFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(CHARACTER_TAG, characterDataModel);
        fragment.setArguments(bundle);
        return fragment;
    }

    public void openErrorDialog() {
        ErrorDialog errorDialog = new ErrorDialog();
        errorDialog.show(getParentFragmentManager(), "Error");
    }
}