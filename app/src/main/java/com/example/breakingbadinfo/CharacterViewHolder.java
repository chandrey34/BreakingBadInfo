package com.example.breakingbadinfo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class CharacterViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageViewCharacter;
    private TextView textViewCharacter;
    private TextView textViewNameCharacter;

    public CharacterViewHolder(@NonNull View itemView) {
        super(itemView);
        imageViewCharacter = itemView.findViewById(R.id.characterImageView);
        textViewCharacter = itemView.findViewById(R.id.textViewCharacter);
        textViewNameCharacter = itemView.findViewById(R.id.textViewNameCharacter);

    }

    public void bind(CharacterDataModel characterDataModel) {

        Glide.with(imageViewCharacter.getContext())
                .load(characterDataModel.getCharacterImage())
                .into(imageViewCharacter);

        textViewCharacter.setText(characterDataModel.getCharacterText());
        textViewNameCharacter.setText(characterDataModel.getPortrayedCharacterTextInfo());
    }
}