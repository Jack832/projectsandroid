package com.example.test4.swipe;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Switch;

import java.util.Locale;

/**
 * Created by bridgelabz4 on 15/12/15.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
         switch (position)
        {
            case 0: return  new TopratedFragment();
            case 1:return  new GameFragment();
            case 2:return  new pictureFragment();
            default:return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}



