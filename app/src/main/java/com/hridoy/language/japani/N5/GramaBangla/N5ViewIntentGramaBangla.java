package com.hridoy.language.japani.N5.GramaBangla;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.hridoy.language.japani.DatabaseAccess;
import com.hridoy.language.japani.R;

import java.util.ArrayList;
import java.util.Objects;

public class N5ViewIntentGramaBangla extends AppCompatActivity {

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
        setContentView(R.layout.activity_n5_view_intent_grama_bangla);

        toolbar = findViewById(R.id.mytoolbar);

        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);



        listView= findViewById(R.id.listViewId);







//----------------------N5---------------------------------------------------------



        if(getIntent().hasExtra("LessonN5BGrama1")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama1");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama1();
        }



        else if(getIntent().hasExtra("LessonN5BGrama2")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama2");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama2();
        }

        else if(getIntent().hasExtra("LessonN5BGrama3")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama3");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama3();
        }

        else if(getIntent().hasExtra("LessonN5BGrama4")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama4");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama4();
        }

        else if(getIntent().hasExtra("LessonN5BGrama5")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama5");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama5();
        }

        else if(getIntent().hasExtra("LessonN5BGrama6")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama6");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama6();
        }

        else if(getIntent().hasExtra("LessonN5BGrama7")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama7");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama7();
        }


        else if(getIntent().hasExtra("LessonN5BGrama8")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama8");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama8();
        }


        else if(getIntent().hasExtra("LessonN5BGrama9")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama9");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama9();
        }


        else if(getIntent().hasExtra("LessonN5BGrama10")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama10");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama10();
        }


        else if(getIntent().hasExtra("LessonN5BGrama11")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama11");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama11();
        }


        else if(getIntent().hasExtra("LessonN5BGrama12")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama12");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama12();
        }


        else if(getIntent().hasExtra("LessonN5BGrama13")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama13");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama13();
        }


        else if(getIntent().hasExtra("LessonN5BGrama14")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama14");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama14();
        }


        else if(getIntent().hasExtra("LessonN5BGrama15")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama15");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama15();
        }


        else if(getIntent().hasExtra("LessonN5BGrama16")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama16");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama16();
        }


        else if(getIntent().hasExtra("LessonN5BGrama17")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama17");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama17();
        }


        else if(getIntent().hasExtra("LessonN5BGrama18")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama18");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama18();
        }


        else if(getIntent().hasExtra("LessonN5BGrama19")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama19");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama19();
        }


        else if(getIntent().hasExtra("LessonN5BGrama20")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama20");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama20();
        }



        else if(getIntent().hasExtra("LessonN5BGrama21")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama21");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama21();
        }



        else if(getIntent().hasExtra("LessonN5BGrama22")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama22");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama22();
        }



        else if(getIntent().hasExtra("LessonN5BGrama23")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama23");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama23();
        }



        else if(getIntent().hasExtra("LessonN5BGrama24")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama24");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama24();
        }



        else if(getIntent().hasExtra("LessonN5BGrama25")){

            String lesson = getIntent().getStringExtra("LessonN5BGrama25");

            TextView name = findViewById(R.id.lesson_num_n5_grammer);
            name.setText(lesson);

            LessonN5BGrama25();
        }




        //Bangla Start




        // //Bangla End








    }






    //Bangla






    private void LessonN5BGrama1() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson1();


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



    private void LessonN5BGrama2() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson2();


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

    private void LessonN5BGrama3() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson3();


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
    private void LessonN5BGrama4() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson4();


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
    private void LessonN5BGrama5() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson5();


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
    private void LessonN5BGrama6() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson6();


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
    private void LessonN5BGrama7() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson7();


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
    private void LessonN5BGrama8() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson8();


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

    private void LessonN5BGrama9() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson9();


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
    private void LessonN5BGrama10() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson10();


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
    private void LessonN5BGrama11() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson11();


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
    private void LessonN5BGrama12() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson12();


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
    private void LessonN5BGrama13() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson13();


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
    private void LessonN5BGrama14() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson14();


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
    private void LessonN5BGrama15() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson15();


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
    private void LessonN5BGrama16() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson16();


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
    private void LessonN5BGrama17() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson17();


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
    private void LessonN5BGrama18() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson18();


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
    private void LessonN5BGrama19() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson19();


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
    private void LessonN5BGrama20() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson20();


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
    private void LessonN5BGrama21() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson21();


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
    private void LessonN5BGrama22() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson22();


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
    private void LessonN5BGrama23() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson23();


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
    private void LessonN5BGrama24() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson24();


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
    private void LessonN5BGrama25() {


        final ArrayList<String> listData = new ArrayList<>();


        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN5BGramaLesson25();


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





    //End Bangla


}
