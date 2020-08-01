package com.hridoy.language.japani.N4.Grama;

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

public class N4ViewIntentGrama extends AppCompatActivity {

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
        setContentView(R.layout.activity_n4_view_intent_grama);

        toolbar = findViewById(R.id.mytoolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        listView= findViewById(R.id.listViewId);


//----------------------N5---------------------------------------------------------



        if(getIntent().hasExtra("LessonN4Grama1")){

            String lesson1 = getIntent().getStringExtra("LessonN4Grama1");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson1);

            LessonN4Grama1();
        }


       else if(getIntent().hasExtra("LessonN4Grama2")){

            String lesson = getIntent().getStringExtra("LessonN4Grama2");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama2();
        }

        else if(getIntent().hasExtra("LessonN4Grama3")){

            String lesson = getIntent().getStringExtra("LessonN4Grama3");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama3();
        }

        else if(getIntent().hasExtra("LessonN4Grama4")){

            String lesson = getIntent().getStringExtra("LessonN4Grama4");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama4();
        }

        else if(getIntent().hasExtra("LessonN4Grama5")){

            String lesson = getIntent().getStringExtra("LessonN4Grama5");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama5();
        }

        else if(getIntent().hasExtra("LessonN4Grama6")){

            String lesson = getIntent().getStringExtra("LessonN4Grama6");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama6();
        }

        else if(getIntent().hasExtra("LessonN4Grama7")){

            String lesson = getIntent().getStringExtra("LessonN4Grama7");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama7();
        }


        else if(getIntent().hasExtra("LessonN4Grama8")){

            String lesson = getIntent().getStringExtra("LessonN4Grama8");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama8();
        }


        else if(getIntent().hasExtra("LessonN4Grama9")){

            String lesson = getIntent().getStringExtra("LessonN4Grama9");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama9();
        }


        else if(getIntent().hasExtra("LessonN4Grama10")){

            String lesson = getIntent().getStringExtra("LessonN4Grama10");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama10();
        }


        else if(getIntent().hasExtra("LessonN4Grama11")){

            String lesson = getIntent().getStringExtra("LessonN4Grama11");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama11();
        }


        else if(getIntent().hasExtra("LessonN4Grama12")){

            String lesson = getIntent().getStringExtra("LessonN4Grama12");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama12();
        }


        else if(getIntent().hasExtra("LessonN4Grama13")){

            String lesson = getIntent().getStringExtra("LessonN4Grama13");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama13();
        }


        else if(getIntent().hasExtra("LessonN4Grama14")){

            String lesson = getIntent().getStringExtra("LessonN4Grama14");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama14();
        }


        else if(getIntent().hasExtra("LessonN4Grama15")){

            String lesson = getIntent().getStringExtra("LessonN4Grama15");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama15();
        }


        else if(getIntent().hasExtra("LessonN4Grama16")){

            String lesson = getIntent().getStringExtra("LessonN4Grama16");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama16();
        }


        else if(getIntent().hasExtra("LessonN4Grama17")){

            String lesson = getIntent().getStringExtra("LessonN4Grama17");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama17();
        }


        else if(getIntent().hasExtra("LessonN4Grama18")){

            String lesson = getIntent().getStringExtra("LessonN4Grama18");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama18();
        }


        else if(getIntent().hasExtra("LessonN4Grama19")){

            String lesson = getIntent().getStringExtra("LessonN4Grama19");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama19();
        }


        else if(getIntent().hasExtra("LessonN4Grama20")){

            String lesson = getIntent().getStringExtra("LessonN4Grama20");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama20();
        }



        else if(getIntent().hasExtra("LessonN4Grama21")){

            String lesson = getIntent().getStringExtra("LessonN4Grama21");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama21();
        }



        else if(getIntent().hasExtra("LessonN4Grama22")){

            String lesson = getIntent().getStringExtra("LessonN4Grama22");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama22();
        }



        else if(getIntent().hasExtra("LessonN4Grama23")){

            String lesson = getIntent().getStringExtra("LessonN4Grama23");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama23();
        }



        else if(getIntent().hasExtra("LessonN4Grama24")){

            String lesson = getIntent().getStringExtra("LessonN4Grama24");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama24();
        }



        else if(getIntent().hasExtra("LessonN4Grama25")){

            String lesson = getIntent().getStringExtra("LessonN4Grama25");

            TextView name = findViewById(R.id.lesson_num_n4_grammer);
            name.setText(lesson);

            LessonN4Grama25();
        }










    }


    private void LessonN4Grama1() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson1();

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

    private void LessonN4Grama2() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson2();

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

    private void LessonN4Grama3() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson3();

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

    private void LessonN4Grama4() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson4();

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

    private void LessonN4Grama5() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson5();

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

    private void LessonN4Grama6() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson6();

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

    private void LessonN4Grama7() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson7();

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

    private void LessonN4Grama8() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson8();

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

    private void LessonN4Grama9() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson9();

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

    private void LessonN4Grama10() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson10();

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



    private void LessonN4Grama11() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson11();

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

    private void LessonN4Grama12() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson12();

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

    private void LessonN4Grama13() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson13();

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

    private void LessonN4Grama14() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson14();

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

    private void LessonN4Grama15() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson15();

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

    private void LessonN4Grama16() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson16();

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

    private void LessonN4Grama17() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson17();

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

    private void LessonN4Grama18() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson18();

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

    private void LessonN4Grama19() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson19();

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

    private void LessonN4Grama20() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson20();

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



    private void LessonN4Grama21() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson21();

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

    private void LessonN4Grama22() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson22();

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

    private void LessonN4Grama23() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson23();

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

    private void LessonN4Grama24() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson24();

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

    private void LessonN4Grama25() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN4GramaLesson25();

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




}
