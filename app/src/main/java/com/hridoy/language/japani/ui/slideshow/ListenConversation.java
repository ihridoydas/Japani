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
                mDisplaytext1.setText("いらっしゃいませ");
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




//Kaiwa 1 end


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



        //Kaiwa 6 start

        mDisplaytext6=findViewById(R.id.display_text6);
        mKSayBtn6=findViewById(R.id.kSayBtn6);
        mDispalyEnBtn6=findViewById(R.id.dispayEnBtn6);
        mDispalyBnBtn6=findViewById(R.id.dispayBnBtn6);




        mKSayBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplaytext6.setText("ここにすわってもいいですか");
                speak6();
            }
        });


        mDispalyEnBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext6.setText("Can i sit here?");
            }
        });


        mDispalyBnBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext6.setText("আমি এখানে বসতে পারি। (বসতে চাওয়ার সময়) ");
            }
        });




//Kaiwa 6 end




        //Kaiwa 7 start

        mDisplaytext7=findViewById(R.id.display_text7);
        mKSayBtn7=findViewById(R.id.kSayBtn7);
        mDispalyEnBtn7=findViewById(R.id.dispayEnBtn7);
        mDispalyBnBtn7=findViewById(R.id.dispayBnBtn7);




        mKSayBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplaytext7.setText("いただきます");
                speak7();
            }
        });


        mDispalyEnBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext7.setText("to receive, to get, to accept, to take");
            }
        });


        mDispalyBnBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext7.setText("খাবার গ্রহণের পূর্বে বলা হয়।");
            }
        });




//Kaiwa 7 end






        //Kaiwa 8 start

        mDisplaytext8=findViewById(R.id.display_text8);
        mKSayBtn8=findViewById(R.id.kSayBtn8);
        mDispalyEnBtn8=findViewById(R.id.dispayEnBtn8);
        mDispalyBnBtn8=findViewById(R.id.dispayBnBtn8);




        mKSayBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplaytext8.setText("じゃあまた");
                speak8();
            }
        });


        mDispalyEnBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext8.setText("see you(Next time)");
            }
        });


        mDispalyBnBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext8.setText("আবার দেখা হবে।(বিদায় নেওয়ার সময়)");
            }
        });




//Kaiwa 8 end


//-------------------------------------------------------------







        //Kaiwa 9 start

        mDisplaytext9=findViewById(R.id.display_text9);
        mKSayBtn9=findViewById(R.id.kSayBtn9);
        mDispalyEnBtn9=findViewById(R.id.dispayEnBtn9);
        mDispalyBnBtn9=findViewById(R.id.dispayBnBtn9);




        mKSayBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplaytext9.setText("きをつけて");
                speak9();
            }
        });


        mDispalyEnBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext9.setText("take care");
            }
        });


        mDispalyBnBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext9.setText("সাবধান।(কাউকে সতর্ক করার সময়)");
            }
        });




//Kaiwa 9 end


// Kaiwa 10 start

        mDisplaytext10=findViewById(R.id.display_text10);
        mKSayBtn10=findViewById(R.id.kSayBtn10);
        mDispalyEnBtn10=findViewById(R.id.dispayEnBtn10);
        mDispalyBnBtn10=findViewById(R.id.dispayBnBtn10);



        mKSayBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplaytext10.setText("ただいま");
                speak10();
            }
        });


        mDispalyEnBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext10.setText("I'm back(Home)");
            }
        });


        mDispalyBnBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext10.setText("ফিরে এসেছি।(বাহিরে থেকে কেউ যখন বাসায় ফিরবে) ");
            }
        });




//Kaiwa 10 end



        //---------------------------------------------------------------------


// Kaiwa 11 start

        mDisplaytext11=findViewById(R.id.display_text11);
        mKSayBtn11=findViewById(R.id.kSayBtn11);
        mDispalyEnBtn11=findViewById(R.id.dispayEnBtn11);
        mDispalyBnBtn11=findViewById(R.id.dispayBnBtn11);



        mKSayBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplaytext11.setText("おかえりなさい");
                speak11();
            }
        });


        mDispalyEnBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext11.setText("Welcome back");
            }
        });


        mDispalyBnBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext11.setText("স্বাগতম।(ঘরের ভিতরে যে থাকবে সে বলবে) ");
            }
        });




//Kaiwa 11 end


//Kaiwa 12 start

        mDisplaytext12=findViewById(R.id.display_text12);
        mKSayBtn12=findViewById(R.id.kSayBtn12);
        mDispalyEnBtn12=findViewById(R.id.dispayEnBtn12);
        mDispalyBnBtn12=findViewById(R.id.dispayBnBtn12);




        mKSayBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplaytext12.setText(".....ましょうか");
                speak12();
            }
        });


        mDispalyEnBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext12.setText("Shall we...");
            }
        });


        mDispalyBnBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext12.setText("করবো নাকি।.....");
            }
        });




//Kaiwa 12 end




//Kaiwa 13 start

        mDisplaytext13=findViewById(R.id.display_text13);
        mKSayBtn13=findViewById(R.id.kSayBtn13);
        mDispalyEnBtn13=findViewById(R.id.dispayEnBtn13);
        mDispalyBnBtn13=findViewById(R.id.dispayBnBtn13);




        mKSayBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplaytext13.setText("いってきます");
                speak13();
            }
        });


        mDispalyEnBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext13.setText("See you(Go Anywhere)");
            }
        });


        mDispalyBnBtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext13.setText("আমি এখন চলে যাচ্ছি।");
            }
        });




//Kaiwa 13 end


        //Kaiwa 14 start

        mDisplaytext14=findViewById(R.id.display_text14);
        mKSayBtn14=findViewById(R.id.kSayBtn14);
        mDispalyEnBtn14=findViewById(R.id.dispayEnBtn14);
        mDispalyBnBtn14=findViewById(R.id.dispayBnBtn14);




        mKSayBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplaytext14.setText("いってらっしゃい");
                speak14();
            }
        });


        mDispalyEnBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext14.setText("Go and come back safely.");
            }
        });


        mDispalyBnBtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext14.setText("যান এবং নিরাপদে ফিরে আসুন।");
            }
        });




//Kaiwa 14 end


        //Kaiwa 15 start

        mDisplaytext15=findViewById(R.id.display_text15);
        mKSayBtn15=findViewById(R.id.kSayBtn15);
        mDispalyEnBtn15=findViewById(R.id.dispayEnBtn15);
        mDispalyBnBtn15=findViewById(R.id.dispayBnBtn15);




        mKSayBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplaytext15.setText("おはようございます");
                speak15();
            }
        });


        mDispalyEnBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext15.setText("Good Morning");
            }
        });


        mDispalyBnBtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext15.setText(" শুভ সকাল।");
            }
        });




//Kaiwa 15 end



        //Kaiwa 16 start

        mDisplaytext16=findViewById(R.id.display_text16);
        mKSayBtn16=findViewById(R.id.kSayBtn16);
        mDispalyEnBtn16=findViewById(R.id.dispayEnBtn16);
        mDispalyBnBtn16=findViewById(R.id.dispayBnBtn16);




        mKSayBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplaytext16.setText("こんばんわ");
                speak16();
            }
        });


        mDispalyEnBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext16.setText("Good evening");
            }
        });


        mDispalyBnBtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext16.setText("শুভ সন্ধ্যা।");
            }
        });




//Kaiwa 16 end




        //Kaiwa 17 start

        mDisplaytext17=findViewById(R.id.display_text17);
        mKSayBtn17=findViewById(R.id.kSayBtn17);
        mDispalyEnBtn17=findViewById(R.id.dispayEnBtn17);
        mDispalyBnBtn17=findViewById(R.id.dispayBnBtn17);




        mKSayBtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplaytext17.setText("こんにちは");
                speak17();
            }
        });


        mDispalyEnBtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext17.setText("Good Afternoon");
            }
        });


        mDispalyBnBtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext17.setText("শুভ অপরাহ্ণ।");
            }
        });




//Kaiwa 17 end






        //Kaiwa 18 start

        mDisplaytext18=findViewById(R.id.display_text18);
        mKSayBtn18=findViewById(R.id.kSayBtn18);
        mDispalyEnBtn18=findViewById(R.id.dispayEnBtn18);
        mDispalyBnBtn18=findViewById(R.id.dispayBnBtn18);




        mKSayBtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDisplaytext18.setText("おやすみなさい");
                speak18();
            }
        });


        mDispalyEnBtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext18.setText("Good Night");
            }
        });


        mDispalyBnBtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mDisplaytext18.setText("শুভ রাত্রি।");
            }
        });




//Kaiwa 8 end






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

    //Kaiwa 6 start


    private void speak6() {
        String text = mDisplaytext6.getText().toString();
        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


//Kaiwa 6 end



    //Kaiwa 7 start


    private void speak7() {
        String text = mDisplaytext7.getText().toString();
        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


//Kaiwa 7 end


    //Kaiwa 8 start


    private void speak8() {
        String text = mDisplaytext8.getText().toString();
        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


//Kaiwa 9 end


    private void speak9() {
        String text = mDisplaytext9.getText().toString();
        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


//Kaiwa 9 end



    //Kaiwa 10 start


    private void speak10() {
        String text = mDisplaytext10.getText().toString();
        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


//Kaiwa 10 end

//------------------------------------------------------------


//Kaiwa 11 start


    private void speak11() {
        String text = mDisplaytext11.getText().toString();
        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


//Kaiwa 11 end


    //Kaiwa 12 start


    private void speak12() {
        String text = mDisplaytext12.getText().toString();
        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


//Kaiwa 12 end


    //Kaiwa 13 start


    private void speak13() {
        String text = mDisplaytext13.getText().toString();
        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


//Kaiwa 13 end


    //Kaiwa 14 start


    private void speak14() {
        String text = mDisplaytext14.getText().toString();
        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


//Kaiwa 14 end




    //Kaiwa 15 start


    private void speak15() {
        String text = mDisplaytext15.getText().toString();
        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


//Kaiwa 15 end

    //Kaiwa 16 start


    private void speak16() {
        String text = mDisplaytext16.getText().toString();
        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


//Kaiwa 16 end



    //Kaiwa 17 start


    private void speak17() {
        String text = mDisplaytext17.getText().toString();
        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }


//Kaiwa 17 end


    //Kaiwa 18 start


    private void speak18() {
        String text = mDisplaytext18.getText().toString();
        mTTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);

    }

    //Kaiwa 18 End

    @Override
    protected void onDestroy() {
        if (mTTS != null) {
            mTTS.stop();
            mTTS.shutdown();
        }

        super.onDestroy();
    }
}