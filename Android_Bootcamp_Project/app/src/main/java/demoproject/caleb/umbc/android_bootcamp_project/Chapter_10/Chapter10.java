package demoproject.caleb.umbc.android_bootcamp_project.Chapter_10;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Chapter10 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] list = {"Chapter 10: Move! Creating Animation"};

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                break;/*
            case 1:
                startActivity(new Intent(Chapter10.this, Chapter1.class));
                break;
            case 2:
                startActivity(new Intent(Chapter10.this, Chapter2.class));
                break;
            case 3:
                startActivity(new Intent(Chapter10.this, Chapter3.class));
                break;*/
        }
    }

}