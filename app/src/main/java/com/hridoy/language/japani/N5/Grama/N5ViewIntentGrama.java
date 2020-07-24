package com.hridoy.language.japani.N5.Grama;

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
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.hridoy.language.japani.DatabaseAccess;
import com.hridoy.language.japani.R;

import java.util.ArrayList;

public class N5ViewIntentGrama extends AppCompatActivity {

    private Toolbar toolbar;

    private ListView listView;

    public String name;

    public Button query_button;
    public TextView result_address;


    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private static DatabaseAccess instance;
    Cursor c=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n5_view_intent_grama);

        toolbar = findViewById(R.id.mytoolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        listView= findViewById(R.id.listViewId);







//----------------------N5---------------------------------------------------------



        if(getIntent().hasExtra("LessonN5Grama1")){

            String lesson = getIntent().getStringExtra("LessonN5Grama1");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama1();
        }


       else if(getIntent().hasExtra("LessonN5Grama2")){

            String lesson = getIntent().getStringExtra("LessonN5Grama2");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama2();
        }

        else if(getIntent().hasExtra("LessonN5Grama3")){

            String lesson = getIntent().getStringExtra("LessonN5Grama3");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama3();
        }

        else if(getIntent().hasExtra("LessonN5Grama4")){

            String lesson = getIntent().getStringExtra("LessonN5Grama4");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama4();
        }

        else if(getIntent().hasExtra("LessonN5Grama5")){

            String lesson = getIntent().getStringExtra("LessonN5Grama5");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama5();
        }

        else if(getIntent().hasExtra("LessonN5Grama6")){

            String lesson = getIntent().getStringExtra("LessonN5Grama6");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama6();
        }

        else if(getIntent().hasExtra("LessonN5Grama7")){

            String lesson = getIntent().getStringExtra("LessonN5Grama7");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama7();
        }


        else if(getIntent().hasExtra("LessonN5Grama8")){

            String lesson = getIntent().getStringExtra("LessonN5Grama8");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama8();
        }


        else if(getIntent().hasExtra("LessonN5Grama9")){

            String lesson = getIntent().getStringExtra("LessonN5Grama9");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama9();
        }


        else if(getIntent().hasExtra("LessonN5Grama10")){

            String lesson = getIntent().getStringExtra("LessonN5Grama10");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama10();
        }


        else if(getIntent().hasExtra("LessonN5Grama11")){

            String lesson = getIntent().getStringExtra("LessonN5Grama11");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama11();
        }


        else if(getIntent().hasExtra("LessonN5Grama12")){

            String lesson = getIntent().getStringExtra("LessonN5Grama12");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama12();
        }


        else if(getIntent().hasExtra("LessonN5Grama13")){

            String lesson = getIntent().getStringExtra("LessonN5Grama13");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama13();
        }


        else if(getIntent().hasExtra("LessonN5Grama14")){

            String lesson = getIntent().getStringExtra("LessonN5Grama14");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama14();
        }


        else if(getIntent().hasExtra("LessonN5Grama15")){

            String lesson = getIntent().getStringExtra("LessonN5Grama15");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama15();
        }


        else if(getIntent().hasExtra("LessonN5Grama16")){

            String lesson = getIntent().getStringExtra("LessonN5Grama16");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama16();
        }


        else if(getIntent().hasExtra("LessonN5Grama17")){

            String lesson = getIntent().getStringExtra("LessonN5Grama17");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama17();
        }


        else if(getIntent().hasExtra("LessonN5Grama18")){

            String lesson = getIntent().getStringExtra("LessonN5Grama18");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama18();
        }


        else if(getIntent().hasExtra("LessonN5Grama19")){

            String lesson = getIntent().getStringExtra("LessonN5Grama19");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama19();
        }


        else if(getIntent().hasExtra("LessonN5Grama20")){

            String lesson = getIntent().getStringExtra("LessonN5Grama20");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama20();
        }



        else if(getIntent().hasExtra("LessonN5Grama21")){

            String lesson = getIntent().getStringExtra("LessonN5Grama21");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama21();
        }



        else if(getIntent().hasExtra("LessonN5Grama22")){

            String lesson = getIntent().getStringExtra("LessonN5Grama22");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama22();
        }



        else if(getIntent().hasExtra("LessonN5Grama23")){

            String lesson = getIntent().getStringExtra("LessonN5Grama23");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama23();
        }



        else if(getIntent().hasExtra("LessonN5Grama24")){

            String lesson = getIntent().getStringExtra("LessonN5Grama24");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama24();
        }



        else if(getIntent().hasExtra("LessonN5Grama25")){

            String lesson = getIntent().getStringExtra("LessonN5Grama25");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5Grama25();
        }


        //Bangla Start




        // //Bangla End








    }






    //Bangla




    //End Bangla


    private void LessonN5Grama1() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson1();


        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));



            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);


        listView.setAdapter(adapter);


    }




    private void LessonN5Grama2() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson2();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN5Grama3() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson3();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);


    }

    private void LessonN5Grama4() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson4();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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

    private void LessonN5Grama5() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson5();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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

    private void LessonN5Grama6() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson6();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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

    private void LessonN5Grama7() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson7();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
            }
        }

        final ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.list_item,R.id.textViewId,listData);

        listView.setAdapter(adapter);


        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String selectedValue =parent.getItemAtPosition(position).toString();



                Toast.makeText(getApplicationContext(),"Selected Value " + selectedValue,Toast.LENGTH_LONG).show();

            }
        });
    }

    private void LessonN5Grama8() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson8();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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

    private void LessonN5Grama9() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson9();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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

    private void LessonN5Grama10() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson10();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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



    private void LessonN5Grama11() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson11();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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

    private void LessonN5Grama12() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson12();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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

    private void LessonN5Grama13() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson13();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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

    private void LessonN5Grama14() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson14();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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

    private void LessonN5Grama15() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson15();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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

    private void LessonN5Grama16() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson16();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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

    private void LessonN5Grama17() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson17();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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

    private void LessonN5Grama18() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson18();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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

    private void LessonN5Grama19() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson19();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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

    private void LessonN5Grama20() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson20();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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



    private void LessonN5Grama21() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson21();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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

    private void LessonN5Grama22() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson22();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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

    private void LessonN5Grama23() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson23();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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

    private void LessonN5Grama24() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson24();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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

    private void LessonN5Grama25() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5GramaLesson25();

        if(c.getCount()==0){

            Toast.makeText(getApplicationContext(),"NO Data Available in Database ",Toast.LENGTH_LONG).show();
        }else{

            while (c.moveToNext()){

                listData.add(c.getString(0)+" \t "+c.getString(1));
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




}
