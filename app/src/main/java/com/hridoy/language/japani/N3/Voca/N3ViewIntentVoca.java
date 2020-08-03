package com.hridoy.language.japani.N3.Voca;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.hridoy.language.japani.DatabaseAccess;
import com.hridoy.language.japani.R;

import java.util.ArrayList;
import java.util.Locale;


public class N3ViewIntentVoca extends AppCompatActivity {


    private Toolbar toolbar;
    private TextToSpeech mTTS;

    private ListView listView;

    public EditText name;

    public Button query_button;
    public TextView result_address;


    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private static DatabaseAccess instance;
    Cursor c=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n3_view_intent_voca);



        toolbar = findViewById(R.id.mytoolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);





        mTTS = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS) {
                    int result = mTTS.setLanguage(Locale.JAPAN);
                    mTTS.setSpeechRate(0.6f);

                    if (result == TextToSpeech.LANG_MISSING_DATA
                            || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                        Log.e("TTS", "Language not supported");

                    }
                } else {
                    Log.e("TTS", "Initialization failed");
                }
            }
        });




        listView= findViewById(R.id.listViewId);


//----------------------N3---------------------------------------------------------



        if(getIntent().hasExtra("Lesson1")){

            String lesson = getIntent().getStringExtra("Lesson1");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson1();
        }

        else if(getIntent().hasExtra("Lesson2")){

            String lesson = getIntent().getStringExtra("Lesson2");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson2();
        }
        else if(getIntent().hasExtra("Lesson3")){

            String lesson = getIntent().getStringExtra("Lesson3");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson3();
        }
        else if(getIntent().hasExtra("Lesson4")){

            String lesson = getIntent().getStringExtra("Lesson4");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson4();
        }
        else if(getIntent().hasExtra("Lesson5")){

            String lesson = getIntent().getStringExtra("Lesson5");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson5();
        }
        else if(getIntent().hasExtra("Lesson6")){

            String lesson = getIntent().getStringExtra("Lesson6");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson6();
        }
        else if(getIntent().hasExtra("Lesson7")){

            String lesson = getIntent().getStringExtra("Lesson7");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson7();
        }
        else if(getIntent().hasExtra("Lesson8")){

            String lesson = getIntent().getStringExtra("Lesson8");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson8();
        }
        else if(getIntent().hasExtra("Lesson9")){

            String lesson = getIntent().getStringExtra("Lesson9");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson9();
        }
        else if(getIntent().hasExtra("Lesson10")){

            String lesson = getIntent().getStringExtra("Lesson10");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson10();
        }










    }



    private void Lesson1() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3Lesson1();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();
                mTTS.speak(selectedValue, TextToSpeech.QUEUE_FLUSH, null);
                return false;
            }
        });





    }

    private void Lesson2() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3Lesson2();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();
                mTTS.speak(selectedValue, TextToSpeech.QUEUE_FLUSH, null);
                return false;
            }
        });


    }

    private void Lesson3() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3Lesson3();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();
                mTTS.speak(selectedValue, TextToSpeech.QUEUE_FLUSH, null);
                return false;
            }
        });
    }
    private void Lesson4() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3Lesson4();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();
                mTTS.speak(selectedValue, TextToSpeech.QUEUE_FLUSH, null);
                return false;
            }
        });
    }
    private void Lesson5() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3Lesson5();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();
                mTTS.speak(selectedValue, TextToSpeech.QUEUE_FLUSH, null);
                return false;
            }
        });
    }
    private void Lesson6() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3Lesson6();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();
                mTTS.speak(selectedValue, TextToSpeech.QUEUE_FLUSH, null);
                return false;
            }
        });
    }
    private void Lesson7() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3Lesson7();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();
                mTTS.speak(selectedValue, TextToSpeech.QUEUE_FLUSH, null);
                return false;
            }
        });
    }
    private void Lesson8() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3Lesson8();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();
                mTTS.speak(selectedValue, TextToSpeech.QUEUE_FLUSH, null);
                return false;
            }
        });
    }
    private void Lesson9() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3Lesson9();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();
                mTTS.speak(selectedValue, TextToSpeech.QUEUE_FLUSH, null);
                return false;
            }
        });
    }
    private void Lesson10() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3Lesson10();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();
                mTTS.speak(selectedValue, TextToSpeech.QUEUE_FLUSH, null);
                return false;
            }
        });
    }



    //---------------------------------------------------N5-----------------------------------------------------------


    @Override
    protected void onDestroy() {
        if (mTTS != null) {
            mTTS.stop();
            mTTS.shutdown();
        }

        super.onDestroy();
    }
}
