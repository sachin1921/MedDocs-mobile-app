package com.example.meddocs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class selection extends AppCompatActivity {

    Button book,cancel,healthTools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        book = findViewById(R.id.bmiCal);
        cancel = findViewById(R.id.calCalc);
        healthTools = findViewById(R.id.healthTools);

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selection.this, showHospitals.class);
                startActivity(intent);
            }
        });

        healthTools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selection.this, healthTools.class);
                startActivity(intent);
            }
        });



    }
}
