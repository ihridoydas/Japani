package com.hridoy.language.japani.N3.Grama;

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

public class N3ViewIntentGrama extends AppCompatActivity {

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
        setContentView(R.layout.activity_n3_view_intent_grama);

        toolbar = findViewById(R.id.mytoolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        listView= findViewById(R.id.listViewId);


//----------------------N3---------------------------------------------------------



        if(getIntent().hasExtra("LessonN3Grama1")){

            String lesson = getIntent().getStringExtra("LessonN3Grama1");

            TextView name = findViewById(R.id.lesson_num_n3_grammer);
            name.setText(lesson);

            LessonN3Grama1();
        }


        else if(getIntent().hasExtra("LessonN3Grama2")){

            String lesson = getIntent().getStringExtra("LessonN3Grama2");

            TextView name = findViewById(R.id.lesson_num_n3_grammer);
            name.setText(lesson);

            LessonN3Grama2();
        }

        else if(getIntent().hasExtra("LessonN3Grama3")){

            String lesson = getIntent().getStringExtra("LessonN3Grama3");

            TextView name = findViewById(R.id.lesson_num_n3_grammer);
            name.setText(lesson);

            LessonN3Grama3();
        }

        else if(getIntent().hasExtra("LessonN3Grama4")){

            String lesson = getIntent().getStringExtra("LessonN3Grama4");

            TextView name = findViewById(R.id.lesson_num_n3_grammer);
            name.setText(lesson);

            LessonN3Grama4();
        }

        else if(getIntent().hasExtra("LessonN3Grama5")){

            String lesson = getIntent().getStringExtra("LessonN3Grama5");

            TextView name = findViewById(R.id.lesson_num_n3_grammer);
            name.setText(lesson);

            LessonN3Grama5();
        }

        else if(getIntent().hasExtra("LessonN3Grama6")){

            String lesson = getIntent().getStringExtra("LessonN3Grama6");

            TextView name = findViewById(R.id.lesson_num_n3_grammer);
            name.setText(lesson);

            LessonN3Grama6();
        }

        else if(getIntent().hasExtra("LessonN3Grama7")){

            String lesson = getIntent().getStringExtra("LessonN3Grama7");

            TextView name = findViewById(R.id.lesson_num_n3_grammer);
            name.setText(lesson);

            LessonN3Grama7();
        }


        else if(getIntent().hasExtra("LessonN3Grama8")){

            String lesson = getIntent().getStringExtra("LessonN3Grama8");

            TextView name = findViewById(R.id.lesson_num_n3_grammer);
            name.setText(lesson);

            LessonN3Grama8();
        }


        else if(getIntent().hasExtra("LessonN3Grama9")){

            String lesson = getIntent().getStringExtra("LessonN3Grama9");

            TextView name = findViewById(R.id.lesson_num_n3_grammer);
            name.setText(lesson);

            LessonN3Grama9();
        }


        else if(getIntent().hasExtra("LessonN3Grama10")){

            String lesson = getIntent().getStringExtra("LessonN3Grama10");

            TextView name = findViewById(R.id.lesson_num_n3_grammer);
            name.setText(lesson);

            LessonN3Grama10();
        }


        else if(getIntent().hasExtra("LessonN3Grama11")){

            String lesson = getIntent().getStringExtra("LessonN3Grama11");

            TextView name = findViewById(R.id.lesson_num_n3_grammer);
            name.setText(lesson);

            LessonN3Grama11();
        }


        else if(getIntent().hasExtra("LessonN3Grama12")){

            String lesson = getIntent().getStringExtra("LessonN3Grama12");

            TextView name = findViewById(R.id.lesson_num_n3_grammer);
            name.setText(lesson);

            LessonN3Grama12();
        }


        else if(getIntent().hasExtra("LessonN3Grama13")){

            String lesson = getIntent().getStringExtra("LessonN3Grama13");

            TextView name = findViewById(R.id.lesson_num_n3_grammer);
            name.setText(lesson);

            LessonN3Grama13();
        }


        else if(getIntent().hasExtra("LessonN3Grama14")){

            String lesson = getIntent().getStringExtra("LessonN3Grama14");

            TextView name = findViewById(R.id.lesson_num_n3_grammer);
            name.setText(lesson);

            LessonN3Grama14();
        }


        else if(getIntent().hasExtra("LessonN3Grama15")){

            String lesson = getIntent().getStringExtra("LessonN3Grama15");

            TextView name = findViewById(R.id.lesson_num_n3_grammer);
            name.setText(lesson);

            LessonN3Grama15();
        }



    }


    private void LessonN3Grama1() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3GramaLesson1();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(1));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN3Grama2() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3GramaLesson2();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(1));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN3Grama3() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3GramaLesson3();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(1));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN3Grama4() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3GramaLesson4();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(1));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN3Grama5() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3GramaLesson5();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(1));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN3Grama6() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3GramaLesson6();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(1));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN3Grama7() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3GramaLesson7();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(1));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);

    }

    private void LessonN3Grama8() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3GramaLesson8();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(1));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN3Grama9() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3GramaLesson9();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(1));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN3Grama10() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3GramaLesson10();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(1));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }



    private void LessonN3Grama11() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3GramaLesson11();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(1));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN3Grama12() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3GramaLesson12();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(1));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN3Grama13() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3GramaLesson13();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(1));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN3Grama14() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3GramaLesson14();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(1));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN3Grama15() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3GramaLesson15();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(1));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }




}
