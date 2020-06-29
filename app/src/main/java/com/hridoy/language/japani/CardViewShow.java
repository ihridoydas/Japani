package com.hridoy.language.japani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class CardViewShow extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_show);

        textView= findViewById(R.id.txtItem);

        String SelectValue=getIntent().getStringExtra("showValue");
        String SelectValue1=getIntent().getStringExtra("showValue1");



        if(SelectValue==SelectValue){

            textView.setText("hihiojij");
        }



        else{

            Toast.makeText(getApplicationContext(),"Error ",Toast.LENGTH_LONG).show();

        }




    }
}
