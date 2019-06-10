package com.example.android.learngerman;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view that shows the numbers category
        TextView greetingsTextView = (TextView) findViewById(R.id.greetings);

        //Set a click listener on that view
        greetingsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent greetingsListIntent = new Intent(MainActivity.this, GreetingsActivity.class);
                startActivity(greetingsListIntent);
            }
        });

        // Find the view that shows the numbers category
        TextView numbersTextView = (TextView) findViewById(R.id.numbers);

        //Set a click listener on that view
        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numberListIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numberListIntent);
            }
        });

        TextView familyTextView = (TextView) findViewById(R.id.family);

        //Set a click listener on that view
        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyListIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyListIntent);
            }
        });

        TextView colorsTextView = (TextView) findViewById(R.id.colors);

        //Set a click listener on that view
        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorsListIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsListIntent);
            }
        });

        TextView phrasesTextView = (TextView) findViewById(R.id.phrases);

        //Set a click listener on that view
        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesListIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesListIntent);
            }
        });
    }
}

