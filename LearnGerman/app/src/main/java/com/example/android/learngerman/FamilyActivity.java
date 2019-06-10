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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("the father", "der Vater"));
        words.add(new Word("the mother", "die Mutter"));
        words.add(new Word("the son", "der Sohn"));
        words.add(new Word("the daughter", "die Tochter"));
        words.add(new Word("the child", "das Kind"));
        words.add(new Word("the children", "die Kinder"));
        words.add(new Word("the siblings", "die Geschwister"));
        words.add(new Word("the sister", "die Schwester"));
        words.add(new Word("the brother", "der Bruder"));
        words.add(new Word("the wife", "die Ehefrau"));
        words.add(new Word("the husband", "der Ehemann"));
        words.add(new Word("the children", "die Kinder"));
        words.add(new Word("the grandparents", "die Großeltern"));
        words.add(new Word("the grandmother ", "die Großmutter"));
        words.add(new Word("the grandfather", "der Großvater"));
        words.add(new Word("the grandchildren", "die Enkelkinder"));
        words.add(new Word("the granddaughter", "die Enkelin"));
        words.add(new Word("the grandson", "der Enkel"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}