package com.example.test4.swipe;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

/**
 * Created by bridgelabz4 on 11/1/16.
 */
public class Edit extends Activity{
    EditText editText1,editText2,editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editlayout);
        editText1=(EditText)findViewById(R.id.edit1);
        editText2=(EditText)findViewById(R.id.edit2);
        editText3=(EditText)findViewById(R.id.edit3);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);


    }

}
