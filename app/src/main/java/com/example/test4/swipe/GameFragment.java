package com.example.test4.swipe;

import android.support.v4.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by bridgelabz4 on 15/12/15.
 */
public class GameFragment extends ListFragment {
    public static int [] prgmImages={R.drawable.nehra,R.drawable.nehra,R.drawable.warner,R.drawable.warner,R.drawable.nehra,R.drawable.warner,R.drawable.nehra,R.drawable.warner,R.drawable.nehra};
    public static String [] prgmNameList={"Let Us C","c++","JAVA","Jsp","Microsoft .Net","Android","PHP","Jquery","JavaScript"};
    ListView l1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        setListAdapter(new CustomAd(getActivity(), prgmNameList, prgmImages));
    /*public void zoom(View view){
        ImageView image = (ImageView)findViewById(R.id.imageView);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        image.startAnimation(animation1);*/
        return inflater.inflate(R.layout.listvi,container,false);

    }
}
