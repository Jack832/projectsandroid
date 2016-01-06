package com.example.test4.swipe;

import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by bridgelabz4 on 4/1/16.
 */
public class Sett extends Activity{
    ListView l2;
    public static int [] Images={R.drawable.nehra,R.drawable.nehra,R.drawable.nehra};
    public static String [] NameList={"Let Us C","c++","JAVA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        l2=(ListView)findViewById(R.id.list);
        l2.setAdapter(new CustomAd(this, NameList, Images));

    }
}
