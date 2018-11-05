package com.example.user.myapplication;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class FireActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etEmail;
    EditText etPass;
    TextView tvEmail;
    TextView tvProfession;
    Button btSave;
    ListView lvUsers;
    ArrayList<String>users;
    protected void onCreate(Bundle savedInstanceState) {
        final FirebaseDatabase firebaseDatabase;
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference().child("Name");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                tvEmail.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);

        etEmail = findViewById(R.id.etEmail);
        etPass = findViewById(R.id.etPass);
        tvEmail = findViewById(R.id.tvEmail);
        tvProfession = findViewById(R.id.tvProfession);
        btSave = findViewById(R.id.btSave);
        btSave.setOnClickListener(this);

         lvUsers = findViewById(R.id.lvUsers);
         users = new ArrayList<String>();
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,users);
        lvUsers.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {

    }
}
