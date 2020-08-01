package com.hridoy.language.japani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class WebViewMain extends AppCompatActivity {

    private WebView webView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);



        //Start This is connect to xml file
        webView = findViewById(R.id.webviewId);


        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings =webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://www.youtube.com/watch?v=wDpsF90DoeI&list=PLag_mhJfCJ-1-EZcPapMFPTlzVzwjz33M&index=1");


        Toast.makeText(getApplicationContext(),"Please Wait ... File is Loading..",Toast.LENGTH_LONG).show();

        webView.setVerticalScrollBarEnabled(false);


        //END  This is connect to xml file

    }
}