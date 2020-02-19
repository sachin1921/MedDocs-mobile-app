package com.example.meddocs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Confirmation extends AppCompatActivity {
    TextView name, time_view;
    String user_name, user_email, user_phone;
    DatabaseHelper2 myDb;
    Button home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        name = (TextView) findViewById(R.id.name);
        time_view = (TextView) findViewById(R.id.time);
        home = findViewById(R.id.homeBtn);
        myDb = new DatabaseHelper2(this);

        SharedPreferences sp = getSharedPreferences("User", MODE_PRIVATE);

           user_name =sp.getString("NAME", null);
           user_email = sp.getString("EMAIL", null);
           user_phone = sp.getString("PHONENUM", null);
        Intent intent = getIntent();
        String hospital = intent.getStringExtra("CLICKED_HOSPITAL");
        String doc = intent.getStringExtra("CLICKED_DOCTOR");
        String time = intent.getStringExtra("CLICKED_TIME");
        myDb.delete(hospital,doc,time);


        Toast.makeText(Confirmation.this, hospital + " " + doc + " " + time, Toast.LENGTH_SHORT).show();

        name.setText(user_name);
        time_view.setText(time);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Confirmation.this, selection.class);
                startActivity(intent);
            }
        });

    }

//        String user_name =sp.getString("NAME", null);
//        String user_email = sp.getString("EMAIL", null);
//        String user_phone = sp.getString("PHONENUM", null);


    }

