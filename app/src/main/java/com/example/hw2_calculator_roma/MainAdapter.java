package com.example.hw2_calculator_roma;

import android.content.Intent;
import android.icu.text.Transliterator;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> implements onViewHolderListener {


    ArrayList<String> data;
    //MainViewHolder vh;
    MainViewHolder viewHolder;
    MainActivity activity;


//    Intent intent1 = getIntent();
//    String text = intent1.getStringExtra("number_text");
//    String text2 = intent1.]getStringExtra("number_text2");
//    String text3 = intent1.getStringExtra("number_text3");


    public MainAdapter() {
        data = new ArrayList<>();

    }

    public void addText(String text) {
        data.add(text);
        notifyDataSetChanged();
//    for (int i = 0; i < 100;
// //           data.get(i).length();
//         i++) {
//        data.add( i +"" );
//       //        text + text2 + text3 );
//    }
    }


    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_main, parent, false);
//         vh = new MainViewHolder(view);
//        return vh;
        MainViewHolder viewHolder = new MainViewHolder(view);
        viewHolder.setOnClickListener(this);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        String text = data.get(position);
        holder.textView.setText(text);
        holder.onBind(data.get(position), position);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    //    @Override
//    public void onClick(int position) {
//
//    }
//}
    public void addString(String s) {
        s = s + " : " + data.size();
        data.add(s);
        notifyDataSetChanged();

    }

    @Override
    public void onClick(int position) {
        String s = data.get(position);
        Intent intent = new Intent(activity, Main3Activity.class);
        intent.putExtra("key", s);
        activity.startActivity(intent);
    }
}
