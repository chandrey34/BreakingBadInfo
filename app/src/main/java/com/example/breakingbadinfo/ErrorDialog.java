package com.example.breakingbadinfo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class ErrorDialog extends AppCompatDialogFragment {

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Ошибка!")
                .setMessage("Нет данных")
                .setPositiveButton("Показать персонажей", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        CharacterFragment characterFragment = new CharacterFragment();
                        getActivity().getSupportFragmentManager().beginTransaction()
                                .replace(R.id.activity_main_container, characterFragment)
                                .addToBackStack(null)
                                .commit();
                    }
                });
        return builder.create();
    }
}
