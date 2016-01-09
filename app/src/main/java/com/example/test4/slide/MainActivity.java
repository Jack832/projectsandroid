package com.example.test4.slide;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.logging.Handler;

public class MainActivity extends Activity {

    private ListView mainListView;
    private ArrayAdapter<String> listAdapter;
    ArrayList<String> all_rowtext = new ArrayList<String>() ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the ListView resource.
        mainListView = (ListView) findViewById(android.R.id.list);
        all_rowtext.add("Angel");
        all_rowtext.add("Mark");
        all_rowtext.add("Coding");
        all_rowtext.add("Playground");
        all_rowtext.add("For");
        all_rowtext.add("All");
        all_rowtext.add("Android");
        all_rowtext.add("Coderz");
        // Create ArrayAdapter using the planet list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow,
                all_rowtext);
        // Set the ArrayAdapter as the ListView's adapter.
        mainListView.setAdapter(listAdapter);
        mainListView
                .setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> parent,
                                            View rowView, int positon, long id) {
                        Toast.makeText(rowView.getContext(), "" + positon,
                                Toast.LENGTH_LONG).show();
                        removeListItem(rowView, positon);
                    }
                });
    }


    protected void removeListItem(View rowView, final int positon) {
        final Animation animation = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        rowView.startAnimation(animation);
        /*Handler handle = new Handler();
        handle.postDelayed(new Runnable() {

            public void run() {
                all_rowtext.remove(positon);
                listAdapter.notifyDataSetChanged();
            }
        }, 1000);*/


        //Handler handle = new Handler();
        rowView.postDelayed(new Runnable() {
            @Override
            public void run() {
                all_rowtext.remove(positon);
                listAdapter.notifyDataSetChanged();
            }
        },1000);
    }
}

