package com.hridoy.language.japani;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseAccess {

    private static Cursor c=null;
    private static SQLiteDatabase db;
    private SQLiteOpenHelper openHelper;
    private static DatabaseAccess instance;


    //private constractor

    private DatabaseAccess(Context context){


        this.openHelper= new DatabaseOpenHelper(context);

    }

    public static DatabaseAccess getInstance(Context context){

        if(instance==null){

            instance=new DatabaseAccess(context);
        }return instance;
    }

    //open the database

    public void open(){

        this.db=openHelper.getWritableDatabase();
    }

    //close

    public void close(){

        if(db!=null){

            this.db.close();
        }

    }


    //start for listview

    //--------------------N5 Vocabulay---------------------------------------

    public static Cursor showLesson1(){

        c= db.rawQuery("SELECT * FROM N5lesson1 ",null);

        return c;
    }
    public static Cursor showLesson2(){

        c= db.rawQuery("SELECT * FROM N5lesson2 ",null);

        return c;
    }
    public static Cursor showLesson3(){

        c= db.rawQuery("SELECT * FROM N5lesson3 ",null);

        return c;
    }
    public static Cursor showLesson4(){

        c= db.rawQuery("SELECT * FROM N5lesson4 ",null);

        return c;
    }
    public static Cursor showLesson5(){

        c= db.rawQuery("SELECT * FROM N5lesson5 ",null);

        return c;
    }
    public static Cursor showLesson6(){

        c= db.rawQuery("SELECT * FROM N5lesson6 ",null);

        return c;
    }
    public static Cursor showLesson7(){

        c= db.rawQuery("SELECT * FROM N5lesson7 ",null);

        return c;
    }
    public static Cursor showLesson8(){

        c= db.rawQuery("SELECT * FROM N5lesson8 ",null);

        return c;
    }
    public static Cursor showLesson9(){

        c= db.rawQuery("SELECT * FROM N5lesson9 ",null);

        return c;
    }
    public static Cursor showLesson10(){

        c= db.rawQuery("SELECT * FROM N5lesson10 ",null);

        return c;
    }
    public static Cursor showLesson11(){

        c= db.rawQuery("SELECT * FROM N5lesson11 ",null);

        return c;
    }
    public static Cursor showLesson12(){

        c= db.rawQuery("SELECT * FROM N5lesson12 ",null);

        return c;
    }
    public static Cursor showLesson13(){

        c= db.rawQuery("SELECT * FROM N5lesson13 ",null);

        return c;
    }
    public static Cursor showLesson14(){

        c= db.rawQuery("SELECT * FROM N5lesson14 ",null);

        return c;
    }
    public static Cursor showLesson15(){

        c= db.rawQuery("SELECT * FROM N5lesson15 ",null);

        return c;
    }
    public static Cursor showLesson16(){

        c= db.rawQuery("SELECT * FROM N5lesson16 ",null);

        return c;
    }
    public static Cursor showLesson17(){

        c= db.rawQuery("SELECT * FROM N5lesson17 ",null);

        return c;
    }
    public static Cursor showLesson18(){

        c= db.rawQuery("SELECT * FROM N5lesson18 ",null);

        return c;
    }
    public static Cursor showLesson19(){

        c= db.rawQuery("SELECT * FROM N5lesson19 ",null);

        return c;
    }
    public static Cursor showLesson20(){

        c= db.rawQuery("SELECT * FROM N5lesson20 ",null);

        return c;
    }
    public static Cursor showLesson21(){

        c= db.rawQuery("SELECT * FROM N5lesson21 ",null);

        return c;
    }
    public static Cursor showLesson22(){

        c= db.rawQuery("SELECT * FROM N5lesson22 ",null);

        return c;
    }
    public static Cursor showLesson23(){

        c= db.rawQuery("SELECT * FROM N5lesson23 ",null);

        return c;
    }
    public static Cursor showLesson24(){

        c= db.rawQuery("SELECT * FROM N5lesson24 ",null);

        return c;
    }
    public static Cursor showLesson25(){

        c= db.rawQuery("SELECT * FROM N5lesson25 ",null);

        return c;
    }


//--------------------N5 Vocabulay---------------------------------------


//--------------------N5 Grammer---------------------------------------




    public static Cursor showN5GramaLesson1(){

        c= db.rawQuery("SELECT * FROM N5glesson1 ",null);

        return c;
    }
//--------------------N5 Grammer---------------------------------------



}
