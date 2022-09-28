package com.example.java_demo.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.java_demo.R;

import java.util.Locale;

public class LanguageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        initViews();
    }
    void initViews(){
        Button b_english = findViewById(R.id.b_english);
        Button b_russian = findViewById(R.id.b_russian);
        Button b_uzbek = findViewById(R.id.b_uzbek);
        Button b_japan = findViewById(R.id.b_japan);
        Button b_korean = findViewById(R.id.b_korea);
        Button b_china = findViewById(R.id.b_china);

        b_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("en");
            }
        });

        b_russian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("ru");
            }
        });

        b_uzbek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("uz");
            }
        });

        b_japan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("ja");
            }
        });

        b_korean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("ko");
            }
        });

        b_china.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setLocale("zh");
            }
        });
    }


    void setLocale(String lan){
        Locale locale = new Locale(lan);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        finish();
    }
}