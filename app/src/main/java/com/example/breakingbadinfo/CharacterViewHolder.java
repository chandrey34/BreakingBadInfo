package com.example.breakingbadinfo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CharacterViewHolder extends RecyclerView.ViewHolder {
    private ImageView imageViewCharacter;
    private TextView textViewCharacter;

    public CharacterViewHolder(@NonNull View itemView) {
        super(itemView);
        imageViewCharacter = itemView.findViewById(R.id.characterImageView);
        textViewCharacter = itemView.findViewById(R.id.textViewCharacter);
    }

    public void bind(CharacterDataModel characterDataModel) {
        imageViewCharacter.setImageResource(R.drawable.character);
        textViewCharacter.setText(characterDataModel.getCharacterText());
    }
}