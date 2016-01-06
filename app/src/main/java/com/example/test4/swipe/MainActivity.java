package com.example.test4.swipe;

import android.animation.LayoutTransition;
import android.app.ActionBar;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;

import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements ActionBar.TabListener,TextView.OnEditorActionListener{
    private ArrayAdapter<String> adap;
    private MenuItem menuitem;
    private AutoCompleteTextView auto;
    TabsPagerAdapter adapter;
    ViewPager pager;
    ActionBar action;
    private int titlecol;
    private ArrayAdapter<String> listAdapter;
    //public static int[] prgmImages = {R.drawable.nehra, R.drawable.nehra, R.drawable.warner, R.drawable.warner, R.drawable.nehra, R.drawable.warner, R.drawable.nehra, R.drawable.warner, R.drawable.nehra};
    //public static String[] prgmNameList = {"Let Us C", "c++", "JAVA", "Jsp", "Microsoft .Net", "Android", "PHP", "Jquery", "JavaScript"};
    ListView l1;


    String st[] = {"topp stories", "games", "picture"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auto = (AutoCompleteTextView) findViewById(R.id.auto1);
        action = getActionBar();
        pager = (ViewPager) findViewById(R.id.pager);
        adapter = new TabsPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);


        Resources res= getResources();
        titlecol=res.getColor(R.color.titlered);


        action.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        for (String title : st) {
            action.addTab(action.newTab().setText(title).setTabListener(this));
        }

        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                action.setSelectedNavigationItem(position);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {


            }
        });
    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {


    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        menuitem =menu.findItem(R.id.main);
       // requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        //SearchManager search= (SearchManager)MainActivity.this.getSystemService(getBaseContext().SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.main).getActionView();
        int searchBarId = searchView.getContext().getResources().getIdentifier("android:id/search_plate", null, null);
        searchView.setQueryHint("enter your name");

        LinearLayout searchBar = (LinearLayout) searchView.findViewById(searchBarId);
        View searchPlate=searchView.findViewById(searchBarId);
        searchPlate.setBackgroundColor(titlecol);
        searchBar.setLayoutTransition(new LayoutTransition());
        //menuitem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
           // @Override
           // public boolean onMenuItemClick(MenuItem item) {
            //   action.removeAllTabs();
            //    return true;
            //}
       // });


       // if(searchView.getVisibility() == View.VISIBLE) {
        //    searchView.startAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
       //     searchView.setVisibility(View.INVISIBLE);
       // }
        //final Animation in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.in);
        // final Animation out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.out);

        //if (menuitem != null) {
           // searchView = (SearchView) menuitem.getActionView();
        //}
        //if (searchView != null) {
            //searchView.setSearchableInfo(search.getSearchableInfo(MainActivity.this.getComponentName()));
       // }
        //final SearchView finalSearchView = searchView;
        //searchView.setIconifiedByDefault(true);
       // searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() {
           // @Override
            //public void onFocusChange(View view, boolean queryTextFocused) {

               //if(!queryTextFocused){
                //    finalSearchView.startAnimation(out);
               //     menuitem.getTitleCondensed();
               // }
                //else
                   // finalSearchView.startAnimation(in);
           // }
       // });
        return true;



    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent in=null;
        switch (item.getItemId()) {
            case R.id.main:
                // Code you want run when activity is clicked
                // LinearLayout linLayout= new LinearLayout(this);
                //linLayout.setId(100);
                //setContentView(linLayout);
                menuitem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                 @Override
                 public boolean onMenuItemClick(MenuItem item) {

                   return true;
                }
                 });

             /*   Myfrag frag1=new Myfrag();
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.add(100,frag1);
                ft.commit();
                */

                Toast.makeText(this, "Search clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.main1:
                in= new Intent(Intent.ACTION_MAIN);
                in.setData(Uri.parse("http://www.https://www.youtube.com/watch?v=uMR0X4bUMrY.com"));
                Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings:
                Intent i= new Intent(this,Sett.class);
                startActivity(i);


            //default:
              //  return super.onOptionsItemSelected(item);
        }
        if (item.getItemId() == R.id.profile_pic)

        {
            Intent sharingintent = new Intent(Intent.ACTION_SEND);
            sharingintent.setType("text/plain");
            String stringtoshare = "Hi How are you";
            sharingintent.putExtra(Intent.EXTRA_TEXT, stringtoshare);
            startActivity(Intent.createChooser(sharingintent, "Share via"));

            return true;
        }
        else {
            if(item.getItemId() == R.id.status)
            {
                Intent i= new Intent(getApplicationContext(),Display.class);
                startActivity(i);
            }
        }



        return super.onOptionsItemSelected(item);

    }




    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        return false;
    }

    public void changeprofile(MenuItem item) {

    }
}
