package com.example.meddocs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class calorieWeb extends AppCompatActivity {

    WebView calWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_web);

        setContentView(R.layout.activity_bmi_web);

        calWeb = findViewById(R.id.calWebview);

        calWeb.setWebViewClient(new WebViewClient());
        calWeb.loadUrl("https://www.calculator.net/calorie-calculator.html");

    }
}
