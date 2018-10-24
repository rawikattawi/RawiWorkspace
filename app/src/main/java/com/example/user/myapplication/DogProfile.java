package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DogProfile extends AppCompatActivity implements View.OnClickListener{
    //1.
    EditText etDogName ,etDate , etWeight, etTime ;
    Button btAdd, btCamera, btGallery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_profile);

        //2.
        etDogName = findViewById(R.id.etDogName);
        etDate = findViewById(R.id.etDate);
        etWeight = findViewById(R.id.etWieght);
        etTime = findViewById(R.id.etTime);

        btAdd = findViewById(R.id.btAdd);
        btAdd.setOnClickListener(this);

        btCamera = findViewById(R.id.btCamera);
        btCamera.setOnClickListener(this);

        btGallery = findViewById(R.id.btGallery);
        btGallery.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        //אם המשתמש לחץ על כפתור ה- add
        if(v == btAdd) {
            String name = etDogName.getText().toString();

          //  String name = etDogName.getText().toString();


            Intent i = new Intent(this, MyDogList.class);
            startActivity(i);
        }
        if(v == btCamera) {

        }
        if(v == btGallery) {

        }
    }
}

