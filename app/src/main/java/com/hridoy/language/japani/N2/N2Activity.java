package com.hridoy.language.japani.N2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.hridoy.language.japani.N2.Grama.FragmentGrammerN2;
import com.hridoy.language.japani.N2.Voca.FragmentVocabolaryN2;
import com.hridoy.language.japani.N2.kanji.FragmentKanjiN2;
import com.hridoy.language.japani.N5.ViewPagerAdapter;
import com.hridoy.language.japani.R;

public class N2Activity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adaptern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n2);



        tabLayout=findViewById(R.id.tabLayout_id_n2);
        viewPager=findViewById(R.id.viewpager_id_n2);
        adaptern = new ViewPagerAdapter(getSupportFragmentManager());

        //add fragment

        adaptern.addFragment(new FragmentVocabolaryN2(),"Vocabulary");
        adaptern.addFragment(new FragmentGrammerN2(),"Grammar");
        adaptern.addFragment(new FragmentKanjiN2(),"Kanji");



        viewPager.setAdapter(adaptern);
        tabLayout.setupWithViewPager(viewPager);
    }
}
