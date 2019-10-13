package com.example.hw2_calculator_roma;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView textView;
    onViewHolderListener listener;
    int position;


    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.vh_text_view);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(position);
            }
        });


    }
    public void onBind(String string, int position) {
        textView.setText(string);
        this.position = position;
    }

    public void setOnClickListener(onViewHolderListener listener) {
        this.listener = listener;

    }
}