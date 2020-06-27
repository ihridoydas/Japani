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


    public static Cursor showN5GramaLesson2(){

        c= db.rawQuery("SELECT * FROM N5glesson2 ",null);

        return c;
    }

    public static Cursor showN5GramaLesson3(){

        c= db.rawQuery("SELECT * FROM N5glesson3 ",null);

        return c;
    }


    public static Cursor showN5GramaLesson4(){

        c= db.rawQuery("SELECT * FROM N5glesson4 ",null);

        return c;
    }

    public static Cursor showN5GramaLesson5(){

        c= db.rawQuery("SELECT * FROM N5glesson5 ",null);

        return c;
    }

    public static Cursor showN5GramaLesson6(){

        c= db.rawQuery("SELECT * FROM N5glesson6 ",null);

        return c;
    }

    public static Cursor showN5GramaLesson7(){

        c= db.rawQuery("SELECT * FROM N5glesson7 ",null);

        return c;
    }
    public static Cursor showN5GramaLesson8(){

        c= db.rawQuery("SELECT * FROM N5glesson8 ",null);

        return c;
    }
    public static Cursor showN5GramaLesson9(){

        c= db.rawQuery("SELECT * FROM N5glesson9 ",null);

        return c;
    }


    public static Cursor showN5GramaLesson10(){

        c= db.rawQuery("SELECT * FROM N5glesson10 ",null);

        return c;
    }


    public static Cursor showN5GramaLesson11(){

        c= db.rawQuery("SELECT * FROM N5glesson11 ",null);

        return c;
    }

    public static Cursor showN5GramaLesson12(){

        c= db.rawQuery("SELECT * FROM N5glesson12 ",null);

        return c;
    }

    public static Cursor showN5GramaLesson13(){

        c= db.rawQuery("SELECT * FROM N5glesson13 ",null);

        return c;
    }

    public static Cursor showN5GramaLesson14(){

        c= db.rawQuery("SELECT * FROM N5glesson14 ",null);

        return c;
    }

    public static Cursor showN5GramaLesson15(){

        c= db.rawQuery("SELECT * FROM N5glesson15 ",null);

        return c;
    }

    public static Cursor showN5GramaLesson16(){

        c= db.rawQuery("SELECT * FROM N5glesson16 ",null);

        return c;
    }
    public static Cursor showN5GramaLesson17(){

        c= db.rawQuery("SELECT * FROM N5glesson17 ",null);

        return c;
    }

    public static Cursor showN5GramaLesson18(){

        c= db.rawQuery("SELECT * FROM N5glesson18 ",null);

        return c;
    }

    public static Cursor showN5GramaLesson19(){

        c= db.rawQuery("SELECT * FROM N5glesson19 ",null);

        return c;
    }
    public static Cursor showN5GramaLesson20(){

        c= db.rawQuery("SELECT * FROM N5glesson20 ",null);

        return c;
    }
    public static Cursor showN5GramaLesson21(){

        c= db.rawQuery("SELECT * FROM N5glesson21 ",null);

        return c;
    }
    public static Cursor showN5GramaLesson22(){

        c= db.rawQuery("SELECT * FROM N5glesson22 ",null);

        return c;
    }
    public static Cursor showN5GramaLesson23(){

        c= db.rawQuery("SELECT * FROM N5glesson23 ",null);

        return c;
    }

    public static Cursor showN5GramaLesson24(){

        c= db.rawQuery("SELECT * FROM N5glesson24 ",null);

        return c;
    }

    public static Cursor showN5GramaLesson25(){

        c= db.rawQuery("SELECT * FROM N5glesson25 ",null);

        return c;
    }








//--------------------N5 Grammer---------------------------------------
//--------------------N5 Kanji---------------------------------------



    public static Cursor showN5KanjiLesson1(){

        c= db.rawQuery("SELECT * FROM N5klesson1 ",null);

        return c;
    }


    public static Cursor showN5KanjiLesson2(){

        c= db.rawQuery("SELECT * FROM N5klesson2 ",null);

        return c;
    }

    public static Cursor showN5KanjiLesson3(){

        c= db.rawQuery("SELECT * FROM N5klesson3 ",null);

        return c;
    }


    public static Cursor showN5KanjiLesson4(){

        c= db.rawQuery("SELECT * FROM N5klesson4 ",null);

        return c;
    }

    public static Cursor showN5KanjiLesson5(){

        c= db.rawQuery("SELECT * FROM N5klesson5 ",null);

        return c;
    }

    public static Cursor showN5KanjiLesson6(){

        c= db.rawQuery("SELECT * FROM N5klesson6 ",null);

        return c;
    }

    public static Cursor showN5KanjiLesson7(){

        c= db.rawQuery("SELECT * FROM N5klesson7 ",null);

        return c;
    }
    public static Cursor showN5KanjiLesson8(){

        c= db.rawQuery("SELECT * FROM N5klesson8 ",null);

        return c;
    }
    public static Cursor showN5KanjiLesson9(){

        c= db.rawQuery("SELECT * FROM N5klesson9 ",null);

        return c;
    }


    public static Cursor showN5KanjiLesson10(){

        c= db.rawQuery("SELECT * FROM N5klesson10 ",null);

        return c;
    }

//--------------------N5 Kanji---------------------------------------



//End N5



    //--------------------N4 Vocabulay---------------------------------------

    public static Cursor showN4Lesson1(){

        c= db.rawQuery("SELECT * FROM N4lesson1 ",null);

        return c;
    }
    public static Cursor showN4Lesson2(){

        c= db.rawQuery("SELECT * FROM N4lesson2 ",null);

        return c;
    }
    public static Cursor showN4Lesson3(){

        c= db.rawQuery("SELECT * FROM N4lesson3 ",null);

        return c;
    }
    public static Cursor showN4Lesson4(){

        c= db.rawQuery("SELECT * FROM N4lesson4 ",null);

        return c;
    }
    public static Cursor showN4Lesson5(){

        c= db.rawQuery("SELECT * FROM N4lesson5 ",null);

        return c;
    }
    public static Cursor showN4Lesson6(){

        c= db.rawQuery("SELECT * FROM N4lesson6 ",null);

        return c;
    }
    public static Cursor showN4Lesson7(){

        c= db.rawQuery("SELECT * FROM N4lesson7 ",null);

        return c;
    }
    public static Cursor showN4Lesson8(){

        c= db.rawQuery("SELECT * FROM N4lesson8 ",null);

        return c;
    }
    public static Cursor showN4Lesson9(){

        c= db.rawQuery("SELECT * FROM N4lesson9 ",null);

        return c;
    }
    public static Cursor showN4Lesson10(){

        c= db.rawQuery("SELECT * FROM N4lesson10 ",null);

        return c;
    }
    public static Cursor showN4Lesson11(){

        c= db.rawQuery("SELECT * FROM N4lesson11 ",null);

        return c;
    }
    public static Cursor showN4Lesson12(){

        c= db.rawQuery("SELECT * FROM N4lesson12 ",null);

        return c;
    }
    public static Cursor showN4Lesson13(){

        c= db.rawQuery("SELECT * FROM N4lesson13 ",null);

        return c;
    }
    public static Cursor showN4Lesson14(){

        c= db.rawQuery("SELECT * FROM N4lesson14 ",null);

        return c;
    }
    public static Cursor showN4Lesson15(){

        c= db.rawQuery("SELECT * FROM N4lesson15 ",null);

        return c;
    }
    public static Cursor showN4Lesson16(){

        c= db.rawQuery("SELECT * FROM N4lesson16 ",null);

        return c;
    }
    public static Cursor showN4Lesson17(){

        c= db.rawQuery("SELECT * FROM N4lesson17 ",null);

        return c;
    }
    public static Cursor showN4Lesson18(){

        c= db.rawQuery("SELECT * FROM N4lesson18 ",null);

        return c;
    }
    public static Cursor showN4Lesson19(){

        c= db.rawQuery("SELECT * FROM N4lesson19 ",null);

        return c;
    }
    public static Cursor showN4Lesson20(){

        c= db.rawQuery("SELECT * FROM N4lesson20 ",null);

        return c;
    }
    public static Cursor showN4Lesson21(){

        c= db.rawQuery("SELECT * FROM N4lesson21 ",null);

        return c;
    }
    public static Cursor showN4Lesson22(){

        c= db.rawQuery("SELECT * FROM N4lesson22 ",null);

        return c;
    }
    public static Cursor showN4Lesson23(){

        c= db.rawQuery("SELECT * FROM N4lesson23 ",null);

        return c;
    }
    public static Cursor showN4Lesson24(){

        c= db.rawQuery("SELECT * FROM N4lesson24 ",null);

        return c;
    }
    public static Cursor showN4Lesson25(){

        c= db.rawQuery("SELECT * FROM N4lesson25 ",null);

        return c;
    }


//--------------------N4 Vocabulay---------------------------------------






//--------------------N4 Grammer---------------------------------------




    public static Cursor showN4GramaLesson1(){

        c= db.rawQuery("SELECT * FROM N4glesson1 ",null);

        return c;
    }


    public static Cursor showN4GramaLesson2(){

        c= db.rawQuery("SELECT * FROM N4glesson2 ",null);

        return c;
    }

    public static Cursor showN4GramaLesson3(){

        c= db.rawQuery("SELECT * FROM N4glesson3 ",null);

        return c;
    }


    public static Cursor showN4GramaLesson4(){

        c= db.rawQuery("SELECT * FROM N4glesson4 ",null);

        return c;
    }

    public static Cursor showN4GramaLesson5(){

        c= db.rawQuery("SELECT * FROM N4glesson5 ",null);

        return c;
    }

    public static Cursor showN4GramaLesson6(){

        c= db.rawQuery("SELECT * FROM N4glesson6 ",null);

        return c;
    }

    public static Cursor showN4GramaLesson7(){

        c= db.rawQuery("SELECT * FROM N4glesson7 ",null);

        return c;
    }
    public static Cursor showN4GramaLesson8(){

        c= db.rawQuery("SELECT * FROM N4glesson8 ",null);

        return c;
    }
    public static Cursor showN4GramaLesson9(){

        c= db.rawQuery("SELECT * FROM N4glesson9 ",null);

        return c;
    }


    public static Cursor showN4GramaLesson10(){

        c= db.rawQuery("SELECT * FROM N4glesson10 ",null);

        return c;
    }


    public static Cursor showN4GramaLesson11(){

        c= db.rawQuery("SELECT * FROM N4glesson11 ",null);

        return c;
    }

    public static Cursor showN4GramaLesson12(){

        c= db.rawQuery("SELECT * FROM N4glesson12 ",null);

        return c;
    }

    public static Cursor showN4GramaLesson13(){

        c= db.rawQuery("SELECT * FROM N4glesson13 ",null);

        return c;
    }

    public static Cursor showN4GramaLesson14(){

        c= db.rawQuery("SELECT * FROM N4glesson14 ",null);

        return c;
    }

    public static Cursor showN4GramaLesson15(){

        c= db.rawQuery("SELECT * FROM N4glesson15 ",null);

        return c;
    }

    public static Cursor showN4GramaLesson16(){

        c= db.rawQuery("SELECT * FROM N4glesson16 ",null);

        return c;
    }
    public static Cursor showN4GramaLesson17(){

        c= db.rawQuery("SELECT * FROM N4glesson17 ",null);

        return c;
    }

    public static Cursor showN4GramaLesson18(){

        c= db.rawQuery("SELECT * FROM N4glesson18 ",null);

        return c;
    }

    public static Cursor showN4GramaLesson19(){

        c= db.rawQuery("SELECT * FROM N4glesson19 ",null);

        return c;
    }
    public static Cursor showN4GramaLesson20(){

        c= db.rawQuery("SELECT * FROM N4glesson20 ",null);

        return c;
    }
    public static Cursor showN4GramaLesson21(){

        c= db.rawQuery("SELECT * FROM N4glesson21 ",null);

        return c;
    }
    public static Cursor showN4GramaLesson22(){

        c= db.rawQuery("SELECT * FROM N4glesson22 ",null);

        return c;
    }
    public static Cursor showN4GramaLesson23(){

        c= db.rawQuery("SELECT * FROM N4glesson23 ",null);

        return c;
    }

    public static Cursor showN4GramaLesson24(){

        c= db.rawQuery("SELECT * FROM N4glesson24 ",null);

        return c;
    }

    public static Cursor showN4GramaLesson25(){

        c= db.rawQuery("SELECT * FROM N4glesson25 ",null);

        return c;
    }



//--------------------N4 Grammer---------------------------------------


    //--------------------N4 Kanji---------------------------------------



    public static Cursor showN4KanjiLesson1(){

        c= db.rawQuery("SELECT * FROM N4klesson1 ",null);

        return c;
    }


    public static Cursor showN4KanjiLesson2(){

        c= db.rawQuery("SELECT * FROM N4klesson2 ",null);

        return c;
    }

    public static Cursor showN4KanjiLesson3(){

        c= db.rawQuery("SELECT * FROM N4klesson3 ",null);

        return c;
    }


    public static Cursor showN4KanjiLesson4(){

        c= db.rawQuery("SELECT * FROM N4klesson4 ",null);

        return c;
    }

    public static Cursor showN4KanjiLesson5(){

        c= db.rawQuery("SELECT * FROM N4klesson5 ",null);

        return c;
    }

    public static Cursor showN4KanjiLesson6(){

        c= db.rawQuery("SELECT * FROM N4klesson6 ",null);

        return c;
    }

    public static Cursor showN4KanjiLesson7(){

        c= db.rawQuery("SELECT * FROM N4klesson7 ",null);

        return c;
    }
    public static Cursor showN4KanjiLesson8(){

        c= db.rawQuery("SELECT * FROM N4klesson8 ",null);

        return c;
    }
    public static Cursor showN4KanjiLesson9(){

        c= db.rawQuery("SELECT * FROM N4klesson9 ",null);

        return c;
    }


    public static Cursor showN4KanjiLesson10(){

        c= db.rawQuery("SELECT * FROM N4klesson10 ",null);

        return c;
    }

//--------------------N4 Kanji---------------------------------------

    //--------------------N3 Vocabulay---------------------------------------

    public static Cursor showN3Lesson1(){

         c= db.rawQuery("SELECT * FROM N3lesson1 ",null);

        return c;
    }
    public static Cursor showN3Lesson2(){

        c= db.rawQuery("SELECT * FROM N3lesson2 ",null);

        return c;
    }
    public static Cursor showN3Lesson3(){

        c= db.rawQuery("SELECT * FROM N3lesson3 ",null);

        return c;
    }
    public static Cursor showN3Lesson4(){

        c= db.rawQuery("SELECT * FROM N3lesson4 ",null);

        return c;
    }
    public static Cursor showN3Lesson5(){

        c= db.rawQuery("SELECT * FROM N3lesson5 ",null);

        return c;
    }
    public static Cursor showN3Lesson6(){

        c= db.rawQuery("SELECT * FROM N3lesson6 ",null);

        return c;
    }
    public static Cursor showN3Lesson7(){

        c= db.rawQuery("SELECT * FROM N3lesson7 ",null);

        return c;
    }
    public static Cursor showN3Lesson8(){

        c= db.rawQuery("SELECT * FROM N3lesson8 ",null);

        return c;
    }
    public static Cursor showN3Lesson9(){

        c= db.rawQuery("SELECT * FROM N3lesson9 ",null);

        return c;
    }
    public static Cursor showN3Lesson10(){

        c= db.rawQuery("SELECT * FROM N3lesson10 ",null);

        return c;
    }


//--------------------N3 Vocabulay---------------------------------------


//--------------------N3 Grammer---------------------------------------




    public static Cursor showN3GramaLesson1(){

        c= db.rawQuery("SELECT * FROM N3glesson1 ",null);

        return c;
    }


    public static Cursor showN3GramaLesson2(){

        c= db.rawQuery("SELECT * FROM N3glesson2 ",null);

        return c;
    }

    public static Cursor showN3GramaLesson3(){

        c= db.rawQuery("SELECT * FROM N3glesson3 ",null);

        return c;
    }


    public static Cursor showN3GramaLesson4(){

        c= db.rawQuery("SELECT * FROM N3glesson4 ",null);

        return c;
    }

    public static Cursor showN3GramaLesson5(){

        c= db.rawQuery("SELECT * FROM N3glesson5 ",null);

        return c;
    }

    public static Cursor showN3GramaLesson6(){

        c= db.rawQuery("SELECT * FROM N3glesson6 ",null);

        return c;
    }

    public static Cursor showN3GramaLesson7(){

        c= db.rawQuery("SELECT * FROM N3glesson7 ",null);

        return c;
    }
    public static Cursor showN3GramaLesson8(){

        c= db.rawQuery("SELECT * FROM N3glesson8 ",null);

        return c;
    }
    public static Cursor showN3GramaLesson9(){

        c= db.rawQuery("SELECT * FROM N3glesson9 ",null);

        return c;
    }


    public static Cursor showN3GramaLesson10(){

        c= db.rawQuery("SELECT * FROM N3glesson10 ",null);

        return c;
    }


    public static Cursor showN3GramaLesson11(){

        c= db.rawQuery("SELECT * FROM N3glesson11 ",null);

        return c;
    }

    public static Cursor showN3GramaLesson12(){

        c= db.rawQuery("SELECT * FROM N3glesson12 ",null);

        return c;
    }

    public static Cursor showN3GramaLesson13(){

        c= db.rawQuery("SELECT * FROM N3glesson13 ",null);

        return c;
    }

    public static Cursor showN3GramaLesson14(){

        c= db.rawQuery("SELECT * FROM N3glesson14 ",null);

        return c;
    }

    public static Cursor showN3GramaLesson15(){

        c= db.rawQuery("SELECT * FROM N3glesson15 ",null);

        return c;
    }

//--------------------N3 Grammer---------------------------------------


}
