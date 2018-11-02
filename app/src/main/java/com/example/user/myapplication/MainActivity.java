package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btMyDogs, btAboutApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btMyDogs = (Button) findViewById(R.id.btMyDogs);
        btAboutApp = (Button) findViewById(R.id.btAboutApp);

        btMyDogs.setOnClickListener(this);
        btAboutApp.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v==btMyDogs){
            Intent i = new Intent(this, MyDogList.class);
            startActivity(i);
        }
        if(v==btAboutApp){
            Intent i = new Intent(this,AboutAplication.class);
            startActivity(i);
        }


    }
}

