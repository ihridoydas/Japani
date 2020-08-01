package com.hridoy.language.japani.ui.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.Manifest;
import android.app.DownloadManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hridoy.language.japani.R;

import java.util.Objects;

public class Help extends AppCompatActivity {


    private static final int PERMISSION_STORAGE_CODE = 1000;
    private Toolbar toolbar;

    Button mDownloadBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);


        toolbar = findViewById(R.id.mytoolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mDownloadBtn = findViewById(R.id.downlodBtn);

        mDownloadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){

                    if(checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_DENIED){

                        //permision denied ,request it

                        String[] permission = {Manifest.permission.WRITE_EXTERNAL_STORAGE};

                        requestPermissions(permission,PERMISSION_STORAGE_CODE);
                    }
                    else{

                        startDownloading();
                    }
                }else{

                    startDownloading();

                }
            }
        });
    }

    private void startDownloading() {


        DownloadManager.Request request = new DownloadManager.Request(Uri.parse("https://drive.google.com/uc?id=1QTSCj1cH1GMgs2mHYfQuqKqJouOww58H&export=download"));


        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
        request.setTitle("Download");
        request.setDescription("Downloading file");

        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,""+ System.currentTimeMillis());



        DownloadManager manager =(DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);


    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        switch (requestCode){
            case PERMISSION_STORAGE_CODE:{

                if (grantResults.length>0 && grantResults[0] ==
                PackageManager.PERMISSION_GRANTED){

                    startDownloading();
                }else{

                    Toast.makeText(this,"Perission Denied..!!",Toast.LENGTH_LONG).show();
                }
            }
        }

    }
}