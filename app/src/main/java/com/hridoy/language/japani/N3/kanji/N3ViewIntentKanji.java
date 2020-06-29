package com.hridoy.language.japani.N3.kanji;

import androidx.appcompat.app.AppCompatActivity;

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

public class N3ViewIntentKanji extends AppCompatActivity {


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
        setContentView(R.layout.activity_n3_view_intent_kanji);




        listView= findViewById(R.id.listViewId);


//----------------------N5---------------------------------------------------------



        if(getIntent().hasExtra("LessonN3Kanji1")){

            String lesson = getIntent().getStringExtra("LessonN3Kanji1");

            TextView name = findViewById(R.id.lesson_num_n3_kanji);
            name.setText(lesson);

            LessonN3Kanji1();
        }


        else if(getIntent().hasExtra("LessonN3Kanji2")){

            String lesson = getIntent().getStringExtra("LessonN3Kanji2");

            TextView name = findViewById(R.id.lesson_num_n3_kanji);
            name.setText(lesson);

            LessonN3Kanji2();
        }

        else if(getIntent().hasExtra("LessonN3Kanji3")){

            String lesson = getIntent().getStringExtra("LessonN3Kanji3");

            TextView name = findViewById(R.id.lesson_num_n3_kanji);
            name.setText(lesson);

            LessonN3Kanji3();
        }

        else if(getIntent().hasExtra("LessonN3Kanji4")){

            String lesson = getIntent().getStringExtra("LessonN3Kanji4");

            TextView name = findViewById(R.id.lesson_num_n3_kanji);
            name.setText(lesson);

            LessonN3Kanji4();
        }

        else if(getIntent().hasExtra("LessonN3Kanji5")){

            String lesson = getIntent().getStringExtra("LessonN3Kanji5");

            TextView name = findViewById(R.id.lesson_num_n3_kanji);
            name.setText(lesson);

            LessonN3Kanji5();
        }

        else if(getIntent().hasExtra("LessonN3Kanji6")){

            String lesson = getIntent().getStringExtra("LessonN3Kanji6");

            TextView name = findViewById(R.id.lesson_num_n3_kanji);
            name.setText(lesson);

            LessonN3Kanji6();
        }

        else if(getIntent().hasExtra("LessonN3Kanji7")){

            String lesson = getIntent().getStringExtra("LessonN3Kanji7");

            TextView name = findViewById(R.id.lesson_num_n3_kanji);
            name.setText(lesson);

            LessonN3Kanji7();
        }


        else if(getIntent().hasExtra("LessonN3Kanji8")){

            String lesson = getIntent().getStringExtra("LessonN3Kanji8");

            TextView name = findViewById(R.id.lesson_num_n3_kanji);
            name.setText(lesson);

            LessonN3Kanji8();
        }

        else if(getIntent().hasExtra("LessonN3Kanji9")){

            String lesson = getIntent().getStringExtra("LessonN3Kanji9");

            TextView name = findViewById(R.id.lesson_num_n3_kanji);
            name.setText(lesson);

            LessonN3Kanji9();
        }


        else if(getIntent().hasExtra("LessonN3Kanji10")){

            String lesson = getIntent().getStringExtra("LessonN3Kanji10");

            TextView name = findViewById(R.id.lesson_num_n3_kanji);
            name.setText(lesson);

            LessonN3Kanji10();
        }

        else if(getIntent().hasExtra("LessonN3Kanji11")){

            String lesson = getIntent().getStringExtra("LessonN3Kanji11");

            TextView name = findViewById(R.id.lesson_num_n3_kanji);
            name.setText(lesson);

            LessonN3Kanji11();
        }

        else if(getIntent().hasExtra("LessonN3Kanji12")){

            String lesson = getIntent().getStringExtra("LessonN3Kanji12");

            TextView name = findViewById(R.id.lesson_num_n3_kanji);
            name.setText(lesson);

            LessonN3Kanji12();
        }

        else if(getIntent().hasExtra("LessonN3Kanji13")){

            String lesson = getIntent().getStringExtra("LessonN3Kanji13");

            TextView name = findViewById(R.id.lesson_num_n3_kanji);
            name.setText(lesson);

            LessonN3Kanji13();
        }

        else if(getIntent().hasExtra("LessonN3Kanji14")){

            String lesson = getIntent().getStringExtra("LessonN3Kanji14");

            TextView name = findViewById(R.id.lesson_num_n3_kanji);
            name.setText(lesson);

            LessonN3Kanji14();
        }


        else if(getIntent().hasExtra("LessonN3Kanji15")){

            String lesson = getIntent().getStringExtra("LessonN3Kanji15");

            TextView name = findViewById(R.id.lesson_num_n3_kanji);
            name.setText(lesson);

            LessonN3Kanji15();
        }

    }


    private void LessonN3Kanji1() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3KanjiLesson1();

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

    private void LessonN3Kanji2() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3KanjiLesson2();

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

    private void LessonN3Kanji3() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3KanjiLesson3();

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

    private void LessonN3Kanji4() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3KanjiLesson4();

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

    private void LessonN3Kanji5() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3KanjiLesson5();

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

    private void LessonN3Kanji6() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3KanjiLesson6();

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

    private void LessonN3Kanji7() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3KanjiLesson7();

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

    private void LessonN3Kanji8() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3KanjiLesson8();

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


    private void LessonN3Kanji9() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3KanjiLesson9();

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

    private void LessonN3Kanji10() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3KanjiLesson10();

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

    private void LessonN3Kanji11() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3KanjiLesson11();

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


    private void LessonN3Kanji12() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3KanjiLesson12();

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


    private void LessonN3Kanji13() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3KanjiLesson13();

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

    private void LessonN3Kanji14() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3KanjiLesson14();

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

    private void LessonN3Kanji15() {


        ArrayList<String> listData = new ArrayList<>();

        DatabaseAccess databaseAccess=DatabaseAccess.getInstance(getApplicationContext());
        databaseAccess.open();

        c = DatabaseAccess.showN3KanjiLesson15();

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
