package com.example.android.learngerman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class GreetingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Hello", "Hallo"));
        words.add(new Word("Hello [Informal (in Southern Germany)] ", "Grüß Gott"));
        words.add(new Word("Good Morning", "Guten Morgen"));
        words.add(new Word("Good day/Good afternoon/Hello", "Guten Tag?"));
        words.add(new Word("Good evening", "Guten Abend"));
        words.add(new Word("Goodbye [Normal]", "Auf Wiedersehen"));
        words.add(new Word("Goodbye", "Tschüs"));
        words.add(new Word("Goodbye [on the telephone]", "Auf Wiederhören"));
        words.add(new Word("See you later", "Bis spatter"));
        words.add(new Word("See you soon", "Bis bald"));
        words.add(new Word("See you tomorrow", "Bis morgen"));
        words.add(new Word("See you on Friday", "Bis Freitag"));
        words.add(new Word("All the best", "Alles Gute"));
        words.add(new Word("Good luck", "Viel Glück"));
        words.add(new Word("Take care", "Machs gut/Pass auf dich auf"));
        words.add(new Word("How’s it going?", "Wie geht’s?"));
        words.add(new Word("Are you well?", "Geht es Ihnen gut?"));
        words.add(new Word("How are you? [Informal]", "Wie geht es dir?"));
        words.add(new Word("How are you? [Formal]", "Wie geht es Ihnen?"));
        words.add(new Word("I’m fine, thank you", "Gut, danke"));
        words.add(new Word("I’m very well", "Es geht mir sehr gut"));
        words.add(new Word("I’m rather well", "Ziemlich gut"));
        words.add(new Word("Not bad", "Nicht schlecht"));
        words.add(new Word("Much better", "Viel besser"));
        words.add(new Word("Not well", "Nicht gut"));
        words.add(new Word("Excuse me! [Formal]", "Entschuldigen Sie bitte!"));
        words.add(new Word("Excuse me! [Casual]", "Entschuldigen!"));
        words.add(new Word("Pardon me!", "Wie bitte?"));
        words.add(new Word("Thank you", "Danke"));
        words.add(new Word("I'm sorry", "(Es) Tut mit leid"));
        words.add(new Word("Really?", "Wirklich?/Echt?"));
        words.add(new Word("Gladly!", "Gerne!/Mit Vergnügen!"));
        words.add(new Word("Nice to meet you", "Sehr erfreut/Freut mich"));
        words.add(new Word("Pardon me!", "Wie bitte?"));
        words.add(new Word("Please", "Bitte"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_greetings);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}