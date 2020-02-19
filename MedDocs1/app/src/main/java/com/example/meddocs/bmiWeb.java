package com.example.meddocs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class bmiWeb extends AppCompatActivity {

    WebView bmiWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_web);

        bmiWeb = findViewById(R.id.calWebview);
        WebSettings settings = bmiWeb.getSettings();
        settings.setJavaScriptEnabled(true);

        bmiWeb.setWebViewClient(new WebViewClient());
        bmiWeb.loadUrl("https://www.cdc.gov/healthyweight/assessing/bmi/adult_bmi/english_bmi_calculator/bmi_calculator.html");
    }
}
