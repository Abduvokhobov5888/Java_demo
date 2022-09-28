package com.example.java_demo.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.java_demo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    void initViews(){
        Button b_open = findViewById(R.id.b_open);
        b_open.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                callLanguageActivity();
            }
        });
    }

    void callLanguageActivity(){
        Intent intent = new Intent(this,LanguageActivity.class);
        startActivity(intent);
    }
}