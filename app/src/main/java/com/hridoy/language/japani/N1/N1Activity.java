package com.hridoy.language.japani.N1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.hridoy.language.japani.N1.Grama.FragmentGrammerN1;
import com.hridoy.language.japani.N1.Voca.FragmentVocabolaryN1;
import com.hridoy.language.japani.N1.kanji.FragmentKanjiN1;
import com.hridoy.language.japani.N5.ViewPagerAdapter;
import com.hridoy.language.japani.R;

public class N1Activity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adaptern;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n1);


        tabLayout=findViewById(R.id.tabLayout_id_n1);
        viewPager=findViewById(R.id.viewpager_id_n1);
        adaptern = new ViewPagerAdapter(getSupportFragmentManager());

        //add fragment

        adaptern.addFragment(new FragmentVocabolaryN1(),"Vocabulary");
        adaptern.addFragment(new FragmentGrammerN1(),"Grammar");
        adaptern.addFragment(new FragmentKanjiN1(),"Kanji");



        viewPager.setAdapter(adaptern);
        tabLayout.setupWithViewPager(viewPager);
    }
}
