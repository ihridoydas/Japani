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
        moreapps.setData(Uri.parse("https://play.google.com/store/apps/dev?id="+"8165279381829342925"));
        context.startActivity(moreapps);

    }

    public void rate(){

        Intent rate = new Intent(Intent.ACTION_VIEW);
        rate.setData(Uri.parse("market://details?id="+"com.hridoy.info.japanembassyinterviewquestion"));
        context.startActivity(rate);

    }


    public void share(){

        Intent share = new Intent(Intent.ACTION_SEND);
        share.setType("text.plain");
        context.startActivity(share);
        share.putExtra(Intent.EXTRA_TEXT,"http://play.google.com/store/apps/details?id="+"com.hridoy.info.japanembassyinterviewquestion");
        Intent.createChooser(share,"Share App");
        context.startActivity(Intent.createChooser(share,"Share Using"));

    }


}
