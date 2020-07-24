package com.hridoy.language.japani.N4;

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
import com.hridoy.language.japani.N4.Grama.FragmentGrammerN4;
import com.hridoy.language.japani.N4.Voca.FragmentVocabolaryN4;
import com.hridoy.language.japani.N4.kanji.FragmentKanjiN4;
import com.hridoy.language.japani.N5.ViewPagerAdapterBangla;
import com.hridoy.language.japani.R;

public class N4Activity extends AppCompatActivity {

    private Toolbar toolbar;

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapterBangla adaptern4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n4);

        toolbar = findViewById(R.id.mytoolbarbutton);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        tabLayout=findViewById(R.id.tabLayout_id_n4);
        viewPager=findViewById(R.id.viewpager_id_n4);
        adaptern4 = new ViewPagerAdapterBangla(getSupportFragmentManager());

        //add fragment

        adaptern4.addFragment(new FragmentVocabolaryN4(),"Vocabulary");
        adaptern4.addFragment(new FragmentGrammerN4(),"Grammar");
        adaptern4.addFragment(new FragmentKanjiN4(),"Kanji");



        viewPager.setAdapter(adaptern4);
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
