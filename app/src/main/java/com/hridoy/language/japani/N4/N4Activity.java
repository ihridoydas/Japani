package com.hridoy.language.japani.N4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.hridoy.language.japani.N4.Grama.FragmentGrammerN4;
import com.hridoy.language.japani.N4.Voca.FragmentVocabolaryN4;
import com.hridoy.language.japani.N4.kanji.FragmentKanjiN4;
import com.hridoy.language.japani.N5.Grama.FragmentGrammer;
import com.hridoy.language.japani.N5.ViewPagerAdapter;
import com.hridoy.language.japani.N5.Voca.FragmentVocabolary;
import com.hridoy.language.japani.N5.kanji.FragmentKanji;
import com.hridoy.language.japani.R;

public class N4Activity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adaptern4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n4);



        tabLayout=findViewById(R.id.tabLayout_id_n4);
        viewPager=findViewById(R.id.viewpager_id_n4);
        adaptern4 = new ViewPagerAdapter(getSupportFragmentManager());

        //add fragment

        adaptern4.addFragment(new FragmentVocabolaryN4(),"Vocabulary");
        adaptern4.addFragment(new FragmentGrammerN4(),"Grammar");
        adaptern4.addFragment(new FragmentKanjiN4(),"Kanji");



        viewPager.setAdapter(adaptern4);
        tabLayout.setupWithViewPager(viewPager);
    }
}
