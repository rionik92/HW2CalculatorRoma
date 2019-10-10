package com.example.hw2_calculator_roma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Main2Activity_Launcher extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2__launcher);
        recyclerView = findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        MainAdapter adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);

        //TextView textView = findViewById(R.id.last_result_field_view);

        Intent intent1 = getIntent();
        String text = intent1.getStringExtra("number_text");
        String text2 = intent1.getStringExtra("number_text2");
        String text3 = intent1.getStringExtra("number_text3");

        //MainAdapter mainAdapter

//        if (textView.getText() == null) {
//            textView.setText("");
//        } else {
//            textView.setText(text + text2 + text3);
//        }

    }


    public void onCalculatorEnterForResult(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent, null);

    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if (requestCode == 1){
//            if (resultCode == RESULT_OK){
//                String text = data.getStringExtra("result_key");
//                Toast toast = Toast.makeText(this, text, Toast.LENGTH_LONG);
//                toast.show();
//            }
//        }
//    }
}