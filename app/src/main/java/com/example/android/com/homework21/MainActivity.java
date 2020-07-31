package com.example.android.com.homework21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Items> words = new ArrayList<Items>();
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit1),
                getString(R.string.home_work1_1), true));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit1),
                getString(R.string.home_work1_2), false));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit1),
                getString(R.string.home_work1_3), false));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit2),
                getString(R.string.home_work2_1), false));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit2),
                getString(R.string.home_work2_2), false));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit3),
                getString(R.string.home_work3_1), false));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit3),
                getString(R.string.home_work3_2), false));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit3),
                getString(R.string.home_work3_3), false));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit4),
                getString(R.string.home_work4_1), false));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit1),
                getString(R.string.home_work1_1), true));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit1),
                getString(R.string.home_work1_2), false));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit1),
                getString(R.string.home_work1_3), false));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit2),
                getString(R.string.home_work2_1), false));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit2),
                getString(R.string.home_work2_2), false));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit3),
                getString(R.string.home_work3_1), false));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit3),
                getString(R.string.home_work3_2), false));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit3),
                getString(R.string.home_work3_3), false));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit4),
                getString(R.string.home_work4_1), false));

        Adapter adapter = new Adapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}