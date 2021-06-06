package com.example.habari;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private TabLayout TabLayout;
    private ViewPager viewPager;
    private MyPageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        TabLayout = findViewById(R.id.tablayout);


        viewPager.setAdapter(adapter);

        TabLayout.setTabsFromPagerAdapter(adapter);


        // to keep working together of tab layout and view pager
        TabLayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(TabLayout));


        // for top bar of activity
        ActionBar bar = getSupportActionBar();
        bar.setTitle("News list");
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("blue")));

    }



}