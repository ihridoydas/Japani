package com.hridoy.language.japani.N5.kanji;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

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

import com.hridoy.language.japani.DatabaseAccess;
import com.hridoy.language.japani.R;

import java.util.ArrayList;

public class N5ViewIntentKanji extends AppCompatActivity {

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
        setContentView(R.layout.activity_n5_view_intent_kanji);


        toolbar = findViewById(R.id.mytoolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        listView= findViewById(R.id.listViewId);


//----------------------N5---------------------------------------------------------



        if(getIntent().hasExtra("LessonN5Kanji1")){

            String lesson = getIntent().getStringExtra("LessonN5Kanji1");

            TextView name = findViewById(R.id.lesson_num_n5_kanji);
            name.setText(lesson);

            LessonN5Kanji1();
        }


        else if(getIntent().hasExtra("LessonN5Kanji2")){

            String lesson = getIntent().getStringExtra("LessonN5Kanji2");

            TextView name = findViewById(R.id.lesson_num_n5_kanji);
            name.setText(lesson);

            LessonN5Kanji2();
        }

        else if(getIntent().hasExtra("LessonN5Kanji3")){

            String lesson = getIntent().getStringExtra("LessonN5Kanji3");

            TextView name = findViewById(R.id.lesson_num_n5_kanji);
            name.setText(lesson);

            LessonN5Kanji3();
        }

        else if(getIntent().hasExtra("LessonN5Kanji4")){

            String lesson = getIntent().getStringExtra("LessonN5Kanji4");

            TextView name = findViewById(R.id.lesson_num_n5_kanji);
            name.setText(lesson);

            LessonN5Kanji4();
        }

        else if(getIntent().hasExtra("LessonN5Kanji5")){

            String lesson = getIntent().getStringExtra("LessonN5Kanji5");

            TextView name = findViewById(R.id.lesson_num_n5_kanji);
            name.setText(lesson);

            LessonN5Kanji5();
        }

        else if(getIntent().hasExtra("LessonN5Kanji6")){

            String lesson = getIntent().getStringExtra("LessonN5Kanji6");

            TextView name = findViewById(R.id.lesson_num_n5_kanji);
            name.setText(lesson);

            LessonN5Kanji6();
        }

        else if(getIntent().hasExtra("LessonN5Kanji7")){

            String lesson = getIntent().getStringExtra("LessonN5Kanji7");

            TextView name = findViewById(R.id.lesson_num_n5_kanji);
            name.setText(lesson);

            LessonN5Kanji7();
        }


        else if(getIntent().hasExtra("LessonN5Kanji8")){

            String lesson = getIntent().getStringExtra("LessonN5Kanji8");

            TextView name = findViewById(R.id.lesson_num_n5_kanji);
            name.setText(lesson);

            LessonN5Kanji8();
        }



    }


    private void LessonN5Kanji1() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5KanjiLesson1();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1)+" \t "+c.getString(2)+" \t "+c.getString(3)+" \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_kanji,R.id.textViewId,listData);

        listView.setAdapter(adapter);

    }

    private void LessonN5Kanji2() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5KanjiLesson2();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1)+" \t "+c.getString(2)+" \t "+c.getString(3)+" \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_kanji,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN5Kanji3() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5KanjiLesson3();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1)+" \t "+c.getString(2)+" \t "+c.getString(3)+" \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_kanji,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN5Kanji4() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5KanjiLesson4();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1)+" \t "+c.getString(2)+" \t "+c.getString(3)+" \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_kanji,R.id.textViewId,listData);

        listView.setAdapter(adapter);

    }

    private void LessonN5Kanji5() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5KanjiLesson5();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1)+" \t "+c.getString(2)+" \t "+c.getString(3)+" \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_kanji,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN5Kanji6() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5KanjiLesson6();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1)+" \t "+c.getString(2)+" \t "+c.getString(3)+" \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_kanji,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN5Kanji7() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5KanjiLesson7();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1)+" \t "+c.getString(2)+" \t "+c.getString(3)+" \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_kanji,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN5Kanji8() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5KanjiLesson8();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1)+" \t "+c.getString(2)+" \t "+c.getString(3)+" \t "+c.getString(4));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item_kanji,R.id.textViewId,listData);

        listView.setAdapter(adapter);

    }


}
