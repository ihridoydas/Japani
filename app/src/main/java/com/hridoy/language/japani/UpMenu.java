package com.hridoy.language.japani;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class UpMenu {

     public Context context;

    UpMenu(Context context){
        this.context=context;
    }

    public void moreapps(){

        Intent moreapps = new Intent(Intent.ACTION_VIEW);
        moreapps.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Hridoy+Chandra+Das"));
        context.startActivity(moreapps);

    }

    public void rate(){

        Intent rate = new Intent(Intent.ACTION_VIEW);
        rate.setData(Uri.parse("market://details?id="+"com.hridoy.language.japani"));
        context.startActivity(rate);

    }


    public void share(){


        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        String shareBody="http://play.google.com/store/apps/details?id="+"com.hridoy.language.japani";
        String shareSub="Honya APP || N5 to N1 all Book in here!";

        myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
        myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
        context.startActivity(Intent.createChooser(myIntent,"Share your friend!"));




    }


}
