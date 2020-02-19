package com.example.meddocs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class healthTools extends AppCompatActivity {

    Button calorie, bmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_tools);

        calorie = findViewById(R.id.calCalc);
        bmi = findViewById(R.id.bmiCal);

        calorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(healthTools.this, calorieWeb.class);
                startActivity(intent);
            }
        });

        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (healthTools.this, bmiWeb.class);
                startActivity(intent);
            }
        });

    }
}
