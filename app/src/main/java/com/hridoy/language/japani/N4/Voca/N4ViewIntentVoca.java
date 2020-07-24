package com.hridoy.language.japani.N4.Voca;

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

public class N4ViewIntentVoca extends AppCompatActivity {


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
        setContentView(R.layout.activity_n4_view_intent_voca);


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


//----------------------N4---------------------------------------------------------



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
        else if(getIntent().hasExtra("Lesson11")){

            String lesson = getIntent().getStringExtra("Lesson11");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson11();
        }
        else if(getIntent().hasExtra("Lesson12")){

            String lesson = getIntent().getStringExtra("Lesson12");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson12();
        }
        else if(getIntent().hasExtra("Lesson13")){

            String lesson = getIntent().getStringExtra("Lesson13");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson13();
        }
        else if(getIntent().hasExtra("Lesson14")){

            String lesson = getIntent().getStringExtra("Lesson14");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson14();
        }
        else if(getIntent().hasExtra("Lesson15")){

            String lesson = getIntent().getStringExtra("Lesson15");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson15();
        }
        else if(getIntent().hasExtra("Lesson16")){

            String lesson = getIntent().getStringExtra("Lesson16");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson16();
        }
        else if(getIntent().hasExtra("Lesson17")){

            String lesson = getIntent().getStringExtra("Lesson17");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson17();
        }
        else if(getIntent().hasExtra("Lesson18")){

            String lesson = getIntent().getStringExtra("Lesson18");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson18();
        }
        else if(getIntent().hasExtra("Lesson19")){

            String lesson = getIntent().getStringExtra("Lesson19");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson19();
        }
        else if(getIntent().hasExtra("Lesson20")){

            String lesson = getIntent().getStringExtra("Lesson20");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson20();
        }
        else if(getIntent().hasExtra("Lesson21")){

            String lesson = getIntent().getStringExtra("Lesson21");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson21();
        }
        else if(getIntent().hasExtra("Lesson22")){

            String lesson = getIntent().getStringExtra("Lesson22");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson22();
        }
        else if(getIntent().hasExtra("Lesson23")){

            String lesson = getIntent().getStringExtra("Lesson23");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson23();
        }
        else if(getIntent().hasExtra("Lesson24")){

            String lesson = getIntent().getStringExtra("Lesson24");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson24();
        }
        else if(getIntent().hasExtra("Lesson25")){

            String lesson = getIntent().getStringExtra("Lesson25");

            TextView name = findViewById(R.id.lesson_num);
            name.setText(lesson);

            Lesson25();
        }










    }



    private void Lesson1() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson1();

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

        c = DatabaseAccess.showN4Lesson2();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }

    private void Lesson3() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson3();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson4() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson4();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson5() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson5();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson6() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson6();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson7() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson7();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson8() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson8();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson9() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson9();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson10() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson10();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson11() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson11();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson12() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson12();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson13() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson13();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson14() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson14();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson15() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson15();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson16() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson16();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson17() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson17();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson18() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson18();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson19() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson19();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson20() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson20();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson21() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson21();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson22() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson22();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson23() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson23();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson24() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson24();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
    private void Lesson25() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4Lesson25();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1) + " \t "+c.getString(2)+ " \t "+c.getString(3)+ " \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

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
