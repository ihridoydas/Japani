package com.hridoy.language.japani.N3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.hridoy.language.japani.N3.Grama.FragmentGrammerN3;
import com.hridoy.language.japani.N3.Voca.FragmentVocabolaryN3;
import com.hridoy.language.japani.N3.kanji.FragmentKanjiN3;
import com.hridoy.language.japani.N5.ViewPagerAdapter;
import com.hridoy.language.japani.R;

public class N3Activity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adaptern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n3);



        tabLayout=findViewById(R.id.tabLayout_id_n3);
        viewPager=findViewById(R.id.viewpager_id_n3);
        adaptern = new ViewPagerAdapter(getSupportFragmentManager());

        //add fragment

        adaptern.addFragment(new FragmentVocabolaryN3(),"Vocabulary");
        adaptern.addFragment(new FragmentGrammerN3(),"Grammar");
        adaptern.addFragment(new FragmentKanjiN3(),"Kanji");



        viewPager.setAdapter(adaptern);
        tabLayout.setupWithViewPager(viewPager);
    }
}
