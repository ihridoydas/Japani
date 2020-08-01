package com.hridoy.language.japani.ui.slideshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.hridoy.language.japani.R;

public class ListenPractise extends AppCompatActivity {

    private Toolbar toolbar;
    private WebView Listen1;
    private WebView Listen2;
    private WebView Listen3;
    private WebView Listen4;
    private WebView Listen5;
    private WebView Listen6;
    private WebView Listen7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen_practise);


        toolbar = findViewById(R.id.mytoolbar);


        Listen1 = findViewById(R.id.listen1);
        Listen1.setWebViewClient(new WebViewClient());
        WebSettings webSettings =Listen1.getSettings();
        webSettings.setJavaScriptEnabled(true);
        Listen1.loadUrl("https://www.youtube.com/embed/2aqVJS6QOoY");


        Toast.makeText(getApplicationContext(),"Please Wait ... File is Loading..",Toast.LENGTH_LONG).show();

        Listen1.setVerticalScrollBarEnabled(false);

//----------



        Listen2 = findViewById(R.id.listen2);

        Listen2.setWebViewClient(new WebViewClient());
        WebSettings webSettings2 =Listen2.getSettings();
        webSettings2.setJavaScriptEnabled(true);
        Listen2.loadUrl("https://www.youtube.com/embed/jTnkizxydh8");


        Toast.makeText(getApplicationContext(),"Please Wait ... File is Loading..",Toast.LENGTH_LONG).show();

        Listen2.setVerticalScrollBarEnabled(false);

//----------

        Listen3 = findViewById(R.id.listen3);

        Listen3.setWebViewClient(new WebViewClient());
        WebSettings webSettings3 =Listen3.getSettings();
        webSettings3.setJavaScriptEnabled(true);
        Listen3.loadUrl("https://www.youtube.com/embed/shMezSrVfig");


        Toast.makeText(getApplicationContext(),"Please Wait ... File is Loading..",Toast.LENGTH_LONG).show();

        Listen3.setVerticalScrollBarEnabled(false);

//----------

        Listen4 = findViewById(R.id.listen4);

        Listen4.setWebViewClient(new WebViewClient());
        WebSettings webSettings4 =Listen4.getSettings();
        webSettings4.setJavaScriptEnabled(true);
        Listen4.loadUrl("https://www.youtube.com/embed/u0lMClEVWFk");


        Toast.makeText(getApplicationContext(),"Please Wait ... File is Loading..",Toast.LENGTH_LONG).show();

        Listen4.setVerticalScrollBarEnabled(false);

//----------

        Listen5 = findViewById(R.id.listen5);

        Listen5.setWebViewClient(new WebViewClient());
        WebSettings webSettings5 =Listen5.getSettings();
        webSettings5.setJavaScriptEnabled(true);
        Listen5.loadUrl("https://www.youtube.com/embed/chjx4NAnS8s");


        Toast.makeText(getApplicationContext(),"Please Wait ... File is Loading..",Toast.LENGTH_LONG).show();

        Listen5.setVerticalScrollBarEnabled(false);

//----------

        Listen6 = findViewById(R.id.listen6);

        Listen6.setWebViewClient(new WebViewClient());
        WebSettings webSettings6 =Listen6.getSettings();
        webSettings6.setJavaScriptEnabled(true);
        Listen6.loadUrl("https://www.youtube.com/embed/mtZxj2axphM");


        Toast.makeText(getApplicationContext(),"Please Wait ... File is Loading..",Toast.LENGTH_LONG).show();

        Listen6.setVerticalScrollBarEnabled(false);

//----------

        Listen7 = findViewById(R.id.listen7);

        Listen7.setWebViewClient(new WebViewClient());
        WebSettings webSettings7 =Listen7.getSettings();
        webSettings7.setJavaScriptEnabled(true);
        Listen7.loadUrl("https://www.youtube.com/embed/kiRtXlmeVyY");


        Toast.makeText(getApplicationContext(),"Please Wait ... File is Loading..",Toast.LENGTH_LONG).show();

        Listen7.setVerticalScrollBarEnabled(false);

//----------


        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }
}