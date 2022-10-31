package com.example.breakingbadinfo;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CharacterFragment extends Fragment implements CharacterAdapter.OnCharacterClickListener {
    List<CharactersApiResponse> charactersApiResponses;
    RecyclerView recyclerView;
    CharacterAdapter characterAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_character, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewCharacter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        fetchData();

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

    public void fetchData() {
        RetrofitClient.getRetrofitClient().getBreakingBadApi().getCharactersApiResponse().enqueue(new Callback<List<CharactersApiResponse>>() {
            @Override
            public void onResponse(Call<List<CharactersApiResponse>> call, Response<List<CharactersApiResponse>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    charactersApiResponses = response.body();
                    characterAdapter = new CharacterAdapter(CharacterFragment.this::onCharacterClick, CharactersMapper.transformSmart(charactersApiResponses));
                    recyclerView.setAdapter(characterAdapter);
                }
            }

            @Override
            public void onFailure(Call<List<CharactersApiResponse>> call, Throwable t) {
                Toast.makeText(getActivity(), "Ошибка!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}