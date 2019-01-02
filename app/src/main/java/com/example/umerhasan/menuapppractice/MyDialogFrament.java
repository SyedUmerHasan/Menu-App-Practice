package com.example.umerhasan.menuapppractice;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

public class MyDialogFrament extends DialogFragment {
//    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder myDialog = new AlertDialog.Builder(getActivity());
        myDialog.setTitle("Close the App");
        myDialog.setMessage("Are you sure you want to exit?");
        myDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"Okay Clicked" , Toast.LENGTH_SHORT).show();
            }
        });
        myDialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity()," Cancel Clicked" , Toast.LENGTH_SHORT).show();
            }
        });
                return myDialog.create();
    }
}
