package com.example.breakingbadinfo;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CharacterFragment extends Fragment implements CharacterAdapter.OnCharacterClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_character, container, false);

        CharacterDataList characterDataList = new CharacterDataList();
        characterDataList.characterList();

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewCharacter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        CharacterAdapter characterAdapter = new CharacterAdapter((CharacterAdapter.OnCharacterClickListener) this, characterDataList.getCharacterDataModel());
        recyclerView.setAdapter(characterAdapter);

        return view;
    }

    @Override
    public void onCharacterClick(CharacterDataModel characterDataModel) {
        CharacterInfoFragment fragment = CharacterInfoFragment.getInstance(characterDataModel);
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.activity_main_container, fragment)
                .addToBackStack(null)
                .commit();
    }
}