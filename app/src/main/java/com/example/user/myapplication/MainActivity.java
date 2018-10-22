package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lvCategory;
    ArrayAdapter<Item> arrayAdapter;
    ArrayList<Item> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //    lvCategory = (ListView)  findViewById(R.id.lvCategory);

        arrayList.add(new Item(R.id.imageView,"My Dogs"));
        arrayList.add(new Item(R.id.imageView,"?"));
        arrayList.add(new Item(R.id.imageView,"About Aplication"));





        arrayAdapter = new ArrayAdapter<Item>(this, android.R.layout.simple_list_item_1, arrayList);
        lvCategory.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        arrayList.get(position);
        if(position == 0){
           Intent i = new Intent(this, MyDogList.class);
            startActivity(i);
        }
    }
}
