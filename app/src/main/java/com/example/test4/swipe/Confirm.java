package com.example.test4.swipe;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by bridgelabz4 on 3/1/16.
 */
public class Confirm extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.display2);
    }
}
