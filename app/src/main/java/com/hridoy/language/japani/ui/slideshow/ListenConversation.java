package com.hridoy.language.japani.ui.slideshow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hridoy.language.japani.R;

import java.util.Locale;
import java.util.Objects;

public class ListenConversation extends AppCompatActivity {

    private Toolbar toolbar;


    private TextToSpeech mTTS;

    private TextView mDisplaytext1,mDisplaytext2,mDisplaytext3,mDisplaytext4,mDisplaytext5,mDisplaytext6,mDisplaytext7,mDisplaytext8,mDisplaytext9,mDisplaytext10,mDisplaytext11,mDisplaytext12,mDisplaytext13,mDisplaytext14,mDisplaytext15,mDisplaytext16,mDisplaytext17,mDisplaytext18;


    private Button mKSayBtn1,mKSayBtn2,mKSayBtn3,mKSayBtn4,mKSayBtn5,mKSayBtn6,mKSayBtn7,mKSayBtn8,mKSayBtn9,mKSayBtn10,mKSayBtn11,mKSayBtn12,mKSayBtn13,mKSayBtn14,mKSayBtn15,mKSayBtn16,mKSayBtn17,mKSayBtn18;
    private Button mDispalyEnBtn1,mDispalyEnBtn2,mDispalyEnBtn3,mDispalyEnBtn4,mDispalyEnBtn5,mDispalyEnBtn6,mDispalyEnBtn7,mDispalyEnBtn8,mDispalyEnBtn9,mDispalyEnBtn10,mDispalyEnBtn11,mDispalyEnBtn12,mDispalyEnBtn13,mDispalyEnBtn14,mDispalyEnBtn15,mDispalyEnBtn16,mDispalyEnBtn17,mDispalyEnBtn18;
    private Button mDispalyBnBtn1,mDispalyBnBtn2,mDispalyBnBtn3,mDispalyBnBtn4,mDispalyBnBtn5,mDispalyBnBtn6,mDispalyBnBtn7,mDispalyBnBtn8,mDispalyBnBtn9,mDispalyBnBtn10,mDispalyBnBtn11,mDispalyBnBtn12,mDispalyBnBtn13,mDispalyBnBtn14,mDispalyBnBtn15,mDispalyBnBtn16,mDispalyBnBtn17,mDispalyBnBtn18;










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen_conversation);


        toolbar = findViewById(R.id.mytoolbarbutton);

        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);



        mTTS = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = mTTS.setLanguage(Locale.JAPAN);

                    if (result == TextToSpeech.LANG_MISSING_DATA
                            || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Language not supported");
                    }
                } else {
                    Log.e("TTS", "Initialization failed");
                }
            }
        });








// Kaiwa 1 start

        mDisplaytext1=findViewById(R.id.display_text1);
        mKSayBtn1=findViewById(R.id.kSayBtn1);
        mDispalyEnBtn1=findViewById(R.id.dispayEnBtn1);
        mDispalyBnBtn1=findViewById(R.id.dispayBnBtn1);



        mKSayBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplaytext1.setText("いらつしゃませ");
                speak1();
            }
        });


        mDispalyEnBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext1.setText("Welcome");
            }
        });


        mDispalyBnBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext1.setText("আপনাকে স্বাগতম।(দোকানদার কাস্টমারকে বলবে)");
            }
        });




//Kaiwa 2 end


//Kaiwa 2 start

        mDisplaytext2=findViewById(R.id.display_text2);
        mKSayBtn2=findViewById(R.id.kSayBtn2);
        mDispalyEnBtn2=findViewById(R.id.dispayEnBtn2);
        mDispalyBnBtn2=findViewById(R.id.dispayBnBtn2);




        mKSayBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplaytext2.setText("すみません");
                speak2();
            }
        });


        mDispalyEnBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext2.setText("Excuse Me");
            }
        });


        mDispalyBnBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext2.setText("এই যে শুনছেন।(কাউকে ডাকার সময়)");
            }
        });




//Kaiwa 2 end




//Kaiwa 3 start

        mDisplaytext3=findViewById(R.id.display_text3);
        mKSayBtn3=findViewById(R.id.kSayBtn3);
        mDispalyEnBtn3=findViewById(R.id.dispayEnBtn3);
        mDispalyBnBtn3=findViewById(R.id.dispayBnBtn3);




        mKSayBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplaytext3.setText("ごめんください");
                speak3();
            }
        });


        mDispalyEnBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext3.setText("Im Sorry!");
            }
        });


        mDispalyBnBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext3.setText("আমি দুঃখিত।(ভুল করলে দুঃখ প্রকাশের সময়)");
            }
        });




//Kaiwa 3 end


        //Kaiwa 4 start

        mDisplaytext4=findViewById(R.id.display_text4);
        mKSayBtn4=findViewById(R.id.kSayBtn4);
        mDispalyEnBtn4=findViewById(R.id.dispayEnBtn4);
        mDispalyBnBtn4=findViewById(R.id.dispayBnBtn4);




        mKSayBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplaytext4.setText("ここどうぞ");
                speak4();
            }
        });


        mDispalyEnBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext4.setText("Here, please");
            }
        });


        mDispalyBnBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext4.setText("এখানে দয়া করে।(কাউকে বসতে বলার সময়)");
            }
        });




//Kaiwa 4 end


        //Kaiwa 5 start

        mDisplaytext5=findViewById(R.id.display_text5);
        mKSayBtn5=findViewById(R.id.kSayBtn5);
        mDispalyEnBtn5=findViewById(R.id.dispayEnBtn5);
        mDispalyBnBtn5=findViewById(R.id.dispayBnBtn5);




        mKSayBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplaytext5.setText("ありがとうございます");
                speak5();
            }
        });


        mDispalyEnBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext5.setText("Thank You Very Much");
            }
        });


        mDispalyBnBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext5.setText("ধন্যবাদ।(কেউ কোন কিছু দিলে)");
            }
        });




//Kaiwa 5 end




    }

//Kaiwa 1 start


    private void speak1() {
        String text = mDisplaytext1.getText().toString();
        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


//Kaiwa 1 end


    //Kaiwa 2 start


    private void speak2() {
        String text = mDisplaytext2.getText().toString();
        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


//Kaiwa 2 end


    //Kaiwa 3 start


    private void speak3() {
        String text = mDisplaytext3.getText().toString();
        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


//Kaiwa 3 end


    //Kaiwa 4 start


    private void speak4() {
        String text = mDisplaytext4.getText().toString();
        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


//Kaiwa 4 end




    //Kaiwa 5 start


    private void speak5() {
        String text = mDisplaytext5.getText().toString();
        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


//Kaiwa 5 end

    @Override
    protected void onDestroy() {
        if (mTTS != null) {
            mTTS.stop();
            mTTS.shutdown();
        }

        super.onDestroy();
    }
}