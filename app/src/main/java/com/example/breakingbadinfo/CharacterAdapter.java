package com.example.breakingbadinfo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterViewHolder> {
    public ArrayList<CharacterDataModel> characterList;
    private OnCharacterClickListener onCharacterClickListener;

    public CharacterAdapter(OnCharacterClickListener onCharacterClickListener, ArrayList<CharacterDataModel> characterList) {
        this.onCharacterClickListener = onCharacterClickListener;
        this.characterList = new ArrayList<>(characterList);
    }

    public void updateDataModel(ArrayList<CharacterDataModel> characterList) {
        this.characterList = characterList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_character, parent, false);
        return new CharacterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {
        CharacterDataModel characterDataModel = characterList.get(position);
        holder.bind(characterDataModel);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onCharacterClickListener.onCharacterClick(characterDataModel);
            }
        });
    }

    @Override
    public int getItemCount() {
        return characterList.size();
    }

    public interface OnCharacterClickListener {
        void onCharacterClick(CharacterDataModel characterDataModel);
    }
}