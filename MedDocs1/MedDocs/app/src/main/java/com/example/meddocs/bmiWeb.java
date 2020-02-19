package com.example.meddocs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class bmiWeb extends AppCompatActivity {

    WebView bmiWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_web);

        bmiWeb = findViewById(R.id.calWebview);

        bmiWeb.setWebViewClient(new WebViewClient());
        bmiWeb.loadUrl("https://www.diabetes.ca/managing-my-diabetes/tools---resources/body-mass-index-(bmi)-calculator");
    }
}
