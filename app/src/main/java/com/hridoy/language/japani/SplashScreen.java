package com.hridoy.language.japani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SplashScreen extends AppCompatActivity {

    Animation topAnim,bottomAnim;
    ImageView image;
    TextView logotxt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Animation

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim=AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

//Hooks
        image=findViewById(R.id.imagesplessh);
        logotxt=findViewById(R.id.textspless);


        image.setAnimation(topAnim);
        logotxt.setAnimation(bottomAnim);


        new Handler().postDelayed(new Runnable() {
                                      @Override public void run() {
                                          Intent i = new Intent(SplashScreen.this, MainActivity.class);
                                          startActivity(i);
                                          finish();
                                      }
                                  },
                3000);

    }
}