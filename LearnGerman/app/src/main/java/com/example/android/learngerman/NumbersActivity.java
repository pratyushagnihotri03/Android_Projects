package com.example.android.learngerman;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "eins"));
        words.add(new Word("two", "zwei"));
        words.add(new Word("three", "drei"));
        words.add(new Word("four", "vier"));
        words.add(new Word("five", "fünf"));
        words.add(new Word("six", "sechs"));
        words.add(new Word("seven", "sieben"));
        words.add(new Word("eight", "acht"));
        words.add(new Word("nine", "neun"));
        words.add(new Word("ten", "zehn"));
        words.add(new Word("eleven", "elf"));
        words.add(new Word("twelve", "zwölf"));
        words.add(new Word("thirteen", "dreizehn"));
        words.add(new Word("fourteen", "vierzehn"));
        words.add(new Word("fifteen", "fünfzehn"));
        words.add(new Word("sixteen", "sechzehn"));
        words.add(new Word("seventeen", "siebzehn"));
        words.add(new Word("eighteen", "achtzehn"));
        words.add(new Word("nineteen", "neunzehn"));
        words.add(new Word("twenty", "zwanzig"));
        words.add(new Word("twenty one", "einundzwanzig"));
        words.add(new Word("twenty two", "zweiundzwanzig"));
        words.add(new Word("thirteen", "dreizig"));
        words.add(new Word("fourteen", "vierzig"));
        words.add(new Word("fifteen", "fünfzig"));
        words.add(new Word("hundred", "einhundert (hundert)"));
        words.add(new Word("one hundred one", "einhunderteins"));
        words.add(new Word("one hundred thirty", "einhundertdreißig"));
        words.add(new Word("one thousand", "eintausend (tausend)"));
        words.add(new Word("ten thousand", "zehntausend"));
        words.add(new Word("one million", " eine Million"));
        words.add(new Word("one billion", "eine Milliarde"));
        words.add(new Word("one trillion", "eine Billion"));
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}