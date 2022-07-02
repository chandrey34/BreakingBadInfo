package com.example.breakingbadinfo;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button season_btn = (Button) view.findViewById(R.id.season_btn);
        Button character_btn = (Button) view.findViewById(R.id.character_btn);

        //обработчик события по нажатию на кнопку Серии
        season_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SeasonFragment seasonFragment = new SeasonFragment();
                openFragment(seasonFragment);
            }
        });
        //обработчик события по нажатию на кнопку Персонажи
        character_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharacterFragment characterFragment = new CharacterFragment();
                openFragment(characterFragment);
            }
        });

        return view;
    }

    private void openFragment(Fragment fragment) {
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.activity_main_container, fragment)
                .addToBackStack(null)
                .commit();
    }
}