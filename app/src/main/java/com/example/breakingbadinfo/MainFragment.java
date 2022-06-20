package com.example.breakingbadinfo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MainFragment extends Fragment {
    public static final String SEASON_TAG = "season";
    public static final String CHARACTER_TAG = "character";
    public static final String QUOTES_TAG = "quotes";
    public static final String DEATH_TAG = "death";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        Button season_btn = (Button) view.findViewById(R.id.season_btn);
        Button character_btn = (Button) view.findViewById(R.id.character_btn);
        Button quotes_btn = (Button) view.findViewById(R.id.quotes_btn);
        Button death_btn = (Button) view.findViewById(R.id.death_btn);

        //обработчик события по нажатию на кнопку Серии
        season_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SeasonFragment seasonFragment = new SeasonFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.activity_main_container, seasonFragment, SEASON_TAG)
                        .addToBackStack(null)
                        .commit();
            }
        });
        //обработчик события по нажатию на кнопку Персонажи
        character_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharacterFragment characterFragment = new CharacterFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.activity_main_container, characterFragment, CHARACTER_TAG)
                        .addToBackStack(null)
                        .commit();
            }
        });
        //обработчик события по нажатию на кнопку Цитаты
        quotes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QuotesFragment quotesFragment = new QuotesFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.activity_main_container, quotesFragment, QUOTES_TAG)
                        .addToBackStack(null)
                        .commit();
            }
        });
        //обработчик события по нажатию на кнопку Смерти
        death_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DeathFragment death_fragment = new DeathFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.activity_main_container, death_fragment, DEATH_TAG)
                        .addToBackStack(null)
                        .commit();
            }
        });
        return view;
    }
}