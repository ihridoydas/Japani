package com.hridoy.language.japani.N3;

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
import com.hridoy.language.japani.N3.Grama.FragmentGrammerN3;
import com.hridoy.language.japani.N3.Voca.FragmentVocabolaryN3;
import com.hridoy.language.japani.N3.kanji.FragmentKanjiN3;
import com.hridoy.language.japani.N5.ViewPagerAdapterBangla;
import com.hridoy.language.japani.R;

public class N3Activity extends AppCompatActivity {

    private Toolbar toolbar;

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapterBangla adaptern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n3);


        toolbar = findViewById(R.id.mytoolbarbutton);


        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tabLayout=findViewById(R.id.tabLayout_id_n3);
        viewPager=findViewById(R.id.viewpager_id_n3);
        adaptern = new ViewPagerAdapterBangla(getSupportFragmentManager());

        //add fragment

        adaptern.addFragment(new FragmentVocabolaryN3(),"Vocabulary");
        adaptern.addFragment(new FragmentGrammerN3(),"Grammar");
        adaptern.addFragment(new FragmentKanjiN3(),"Kanji");



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
