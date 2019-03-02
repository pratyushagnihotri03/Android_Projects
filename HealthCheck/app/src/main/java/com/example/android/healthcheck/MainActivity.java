package com.example.android.healthcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity {

    int healthLevel;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void yes(View view) {
        healthLevel = healthLevel + 1;
        message = "You answered yes, current health level is " + healthLevel;
        display(message);
    }

    public void no(View view) {
        healthLevel = healthLevel - 1;
        message = "You answered no, current health level is " + healthLevel;
        display(message);
    }

    public void sometimes(View view) {
        healthLevel = healthLevel + 0;
        message = "You answered sometimes, current health level is " + healthLevel;
        display(message);
    }

    private void display(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.Health_text_view);
        priceTextView.setText(message);
    }
}
