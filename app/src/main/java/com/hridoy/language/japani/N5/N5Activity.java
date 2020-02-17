package com.hridoy.language.japani.N5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.hridoy.language.japani.N5.Grama.FragmentGrammer;
import com.hridoy.language.japani.N5.Voca.FragmentVocabolary;
import com.hridoy.language.japani.N5.kanji.FragmentKanji;
import com.hridoy.language.japani.R;

public class N5Activity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n5);



        tabLayout=findViewById(R.id.tabLayout_id);
        viewPager=findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //add fragment

        adapter.addFragment(new FragmentVocabolary(),"Vocabulary");
        adapter.addFragment(new FragmentGrammer(),"Grammar");
        adapter.addFragment(new FragmentKanji(),"Kanji");



        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
