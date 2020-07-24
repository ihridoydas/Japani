package com.hridoy.language.japani.N5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;
import com.hridoy.language.japani.N5.Grama.FragmentGrammer;
import com.hridoy.language.japani.N5.Voca.FragmentVocabolary;
import com.hridoy.language.japani.N5.kanji.FragmentKanji;
import com.hridoy.language.japani.R;

public class N5Activity extends AppCompatActivity {

    private Toolbar toolbar;

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapterBangla adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n5);

        toolbar = findViewById(R.id.mytoolbarbutton);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        tabLayout=findViewById(R.id.tabLayout_id);
        viewPager=findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapterBangla(getSupportFragmentManager());

        //add fragment

        adapter.addFragment(new FragmentVocabolary(),"Vocabulary");
        adapter.addFragment(new FragmentGrammer(),"Grammar");
        adapter.addFragment(new FragmentKanji(),"Kanji");



        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menubangla,menu);


        return true;





    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        Intent intent = new Intent(this, N5Bangla.class);
        startActivity(intent);


             //   Toast.makeText(getApplicationContext(),"Selected Value " ,Toast.LENGTH_LONG).show();



        return super.onOptionsItemSelected(item);
    }





}
