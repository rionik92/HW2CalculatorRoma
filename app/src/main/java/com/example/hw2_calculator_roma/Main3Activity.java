package com.example.hw2_calculator_roma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //

        Intent intent = getIntent();
        String s = intent.getStringExtra("key");

        TextView textView = findViewById(R.id.text_view_2);
        textView.setText(s);
    }
}
