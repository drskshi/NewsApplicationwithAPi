package com.example.newsapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    TabItem tHome, tInternational, tSports, tTechnology, tFinical;
    Toolbar toolbar;

    PagerAdapter pagerAdapter;


    ViewPager viewPager;

    String api= "0cf67e07f24345539ba31cd914d3bbc3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.fragmentContainer);

//        tabitem
        tHome = findViewById(R.id.tabHome);
        tInternational =findViewById(R.id.tabInternational);
        tSports =findViewById(R.id.tabSports);
        tTechnology= findViewById(R.id.tabTechnology);
        tFinical = findViewById(R.id.tabFinancial);

        pagerAdapter = new PagerAdpater(getSupportFragmentManager(),5);

        viewPager.setAdapter(pagerAdapter);



        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0||tab.getPosition()==1|tab.getPosition()==3
                ||tab.getPosition()==4||tab.getPosition()==5
                ){
                    pagerAdapter.notifyDataSetChanged();
                }


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
