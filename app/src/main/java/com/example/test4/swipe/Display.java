package com.example.test4.swipe;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by bridgelabz4 on 3/1/16.
 */
public class Display extends ActionBarActivity {
   
    EditText edit1,edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.display);
        edit=new EditText(this);
        edit1=(EditText)findViewById(R.id.editText);
        click();
        AlertDialog.Builder builder=new AlertDialog.Builder(Display.this);

        builder.setMessage("STATUS").
                setCancelable(true).
                setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String val=edit.getText().toString();
                        edit1.setText(val);
                        dialog.cancel();
                    }
                });


        AlertDialog alertDialog=builder.create();

        alertDialog.setTitle("Change status");
        alertDialog.setView(edit);
        alertDialog.show();

    }
    public void click(){
        Button b1=(Button)findViewById(R.id.but1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p2 = new Intent(getApplicationContext(), Confirm.class);
                startActivity(p2);


            }
        });


    }
}
