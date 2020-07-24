package com.hridoy.language.japani.N4.kanji;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.hridoy.language.japani.DatabaseAccess;
import com.hridoy.language.japani.R;

import java.util.ArrayList;

public class N4ViewIntentKanji extends AppCompatActivity {

    private Toolbar toolbar;
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
        setContentView(R.layout.activity_n4_view_intent_kanji);

        toolbar = findViewById(R.id.mytoolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        listView= findViewById(R.id.listViewId);


//----------------------N5---------------------------------------------------------



        if(getIntent().hasExtra("LessonN4Kanji1")){

            String lesson = getIntent().getStringExtra("LessonN4Kanji1");

            TextView name = findViewById(R.id.lesson_num_n4_kanji);
            name.setText(lesson);

            LessonN4Kanji1();
        }


        else if(getIntent().hasExtra("LessonN4Kanji2")){

            String lesson = getIntent().getStringExtra("LessonN4Kanji2");

            TextView name = findViewById(R.id.lesson_num_n4_kanji);
            name.setText(lesson);

            LessonN4Kanji2();
        }

        else if(getIntent().hasExtra("LessonN4Kanji3")){

            String lesson = getIntent().getStringExtra("LessonN4Kanji3");

            TextView name = findViewById(R.id.lesson_num_n4_kanji);
            name.setText(lesson);

            LessonN4Kanji3();
        }

        else if(getIntent().hasExtra("LessonN4Kanji4")){

            String lesson = getIntent().getStringExtra("LessonN4Kanji4");

            TextView name = findViewById(R.id.lesson_num_n4_kanji);
            name.setText(lesson);

            LessonN4Kanji4();
        }

        else if(getIntent().hasExtra("LessonN4Kanji5")){

            String lesson = getIntent().getStringExtra("LessonN4Kanji5");

            TextView name = findViewById(R.id.lesson_num_n4_kanji);
            name.setText(lesson);

            LessonN4Kanji5();
        }

        else if(getIntent().hasExtra("LessonN4Kanji6")){

            String lesson = getIntent().getStringExtra("LessonN4Kanji6");

            TextView name = findViewById(R.id.lesson_num_n4_kanji);
            name.setText(lesson);

            LessonN4Kanji6();
        }

        else if(getIntent().hasExtra("LessonN4Kanji7")){

            String lesson = getIntent().getStringExtra("LessonN4Kanji7");

            TextView name = findViewById(R.id.lesson_num_n4_kanji);
            name.setText(lesson);

            LessonN4Kanji7();
        }


        else if(getIntent().hasExtra("LessonN4Kanji8")){

            String lesson = getIntent().getStringExtra("LessonN4Kanji8");

            TextView name = findViewById(R.id.lesson_num_n4_kanji);
            name.setText(lesson);

            LessonN4Kanji8();
        }



        else if(getIntent().hasExtra("LessonN4Kanji9")){

            String lesson = getIntent().getStringExtra("LessonN4Kanji9");

            TextView name = findViewById(R.id.lesson_num_n4_kanji);
            name.setText(lesson);

            LessonN4Kanji9();
        }


        else if(getIntent().hasExtra("LessonN4Kanji10")){

            String lesson = getIntent().getStringExtra("LessonN4Kanji10");

            TextView name = findViewById(R.id.lesson_num_n4_kanji);
            name.setText(lesson);

            LessonN4Kanji10();
        }


    }


    private void LessonN4Kanji1() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4KanjiLesson1();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1)+" \t "+c.getString(2)+" \t "+c.getString(3)+" \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_kanji,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();



                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }

    private void LessonN4Kanji2() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4KanjiLesson2();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1)+" \t "+c.getString(2)+" \t "+c.getString(3)+" \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_kanji,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();



                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }

    private void LessonN4Kanji3() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4KanjiLesson3();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1)+" \t "+c.getString(2)+" \t "+c.getString(3)+" \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_kanji,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();



                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }

    private void LessonN4Kanji4() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4KanjiLesson4();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1)+" \t "+c.getString(2)+" \t "+c.getString(3)+" \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_kanji,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();



                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }

    private void LessonN4Kanji5() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4KanjiLesson5();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1)+" \t "+c.getString(2)+" \t "+c.getString(3)+" \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_kanji,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();



                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }

    private void LessonN4Kanji6() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4KanjiLesson6();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1)+" \t "+c.getString(2)+" \t "+c.getString(3)+" \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_kanji,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();



                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }

    private void LessonN4Kanji7() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4KanjiLesson7();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1)+" \t "+c.getString(2)+" \t "+c.getString(3)+" \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_kanji,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();



                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }

    private void LessonN4Kanji8() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4KanjiLesson8();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1)+" \t "+c.getString(2)+" \t "+c.getString(3)+" \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_kanji,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();



                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }


    private void LessonN4Kanji9() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4KanjiLesson9();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1)+" \t "+c.getString(2)+" \t "+c.getString(3)+" \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_kanji,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();



                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }

    private void LessonN4Kanji10() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4KanjiLesson10();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1)+" \t "+c.getString(2)+" \t "+c.getString(3)+" \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_kanji,R.id.textViewId,listData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();



                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }
}
