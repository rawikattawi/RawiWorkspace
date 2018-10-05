package com.example.user.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DogProfile extends AppCompatActivity implements DialogInterface.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_profile);
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {

    }
}
