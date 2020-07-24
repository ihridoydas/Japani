package com.hridoy.language.japani.N1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
import com.hridoy.language.japani.N1.Grama.FragmentGrammerN1;
import com.hridoy.language.japani.N1.Voca.FragmentVocabolaryN1;
import com.hridoy.language.japani.N1.kanji.FragmentKanjiN1;
import com.hridoy.language.japani.N5.ViewPagerAdapterBangla;
import com.hridoy.language.japani.R;

public class N1Activity extends AppCompatActivity {


    private Toolbar toolbar;

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapterBangla adaptern;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n1);

        toolbar = findViewById(R.id.mytoolbarbutton);


        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tabLayout=findViewById(R.id.tabLayout_id_n1);
        viewPager=findViewById(R.id.viewpager_id_n1);
        adaptern = new ViewPagerAdapterBangla(getSupportFragmentManager());

        //add fragment

        adaptern.addFragment(new FragmentVocabolaryN1(),"Vocabulary");
        adaptern.addFragment(new FragmentGrammerN1(),"Grammar");
        adaptern.addFragment(new FragmentKanjiN1(),"Kanji");



        viewPager.setAdapter(adaptern);
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

        switch (item.getItemId())
        {
            case  R.id.bangla:


                Toast.makeText(getApplicationContext(),"Available in Next Update!! " ,Toast.LENGTH_LONG).show();


                break;


        }
        return super.onOptionsItemSelected(item);
    }
}
