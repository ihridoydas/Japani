package com.hridoy.language.japani.N5;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.hridoy.language.japani.N5.GramaBangla.FragmentN5GrammerBangla;
import com.hridoy.language.japani.R;

import java.util.Objects;

public class N5Bangla extends AppCompatActivity {

    private Toolbar toolbar;

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapterBangla adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n5_bangla);

        toolbar = findViewById(R.id.mytoolbar);

        setSupportActionBar(toolbar);


        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


        tabLayout=findViewById(R.id.tabLayout_id_bangla);
        viewPager=findViewById(R.id.viewpager_id_bangla);
        adapter = new ViewPagerAdapterBangla(getSupportFragmentManager());

        //add fragment


        adapter.addFragment(new FragmentN5GrammerBangla(),"Bangla Grammar");




        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }







}


