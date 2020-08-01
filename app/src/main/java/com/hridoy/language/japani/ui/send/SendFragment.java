package com.hridoy.language.japani.ui.send;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.hridoy.language.japani.R;

public class SendFragment extends Fragment {

    private SendViewModel sendViewModel;
    private Button fb,msg;



    public View onCreateView(@NonNull final LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sendViewModel =
                ViewModelProviders.of(this).get(SendViewModel.class);
        View root = inflater.inflate(R.layout.fragment_send, container, false);



        msg = root.findViewById(R.id.msg);

        fb=root.findViewById(R.id.fb);


         fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFacebook();
            }


         });


        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent emailIntent=new Intent(Intent.ACTION_SEND);
                emailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{"hridoychandradas141@gmail.com"});


                emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Japani App Subject..");
                emailIntent.putExtra(Intent.EXTRA_TEXT,"");

                emailIntent.setType("message/rfc822");
                startActivity(Intent.createChooser(emailIntent,"Choose email Client..."));

            }
        });

        return root;

    }


    private void goToFacebook() {
        try {
            String facebookUrl = getFacebookPageURL(getActivity());
            Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
            facebookIntent.setData(Uri.parse(facebookUrl));
            startActivity(facebookIntent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getFacebookPageURL(Context context) {
        String FACEBOOK_URL = "https://www.facebook.com/ihridoydas";
        String facebookurl = null;

        try {
            PackageManager packageManager = getActivity().getPackageManager();

            if (packageManager != null) {
                Intent activated = packageManager.getLaunchIntentForPackage("com.facebook.katana");

                if (activated != null) {
                    int versionCode = packageManager.getPackageInfo("com.facebook.katana", 0).versionCode;

                    if (versionCode >= 3002850) {
                        facebookurl = "fb://page/realhridoydas";
                    }
                } else {
                    facebookurl = FACEBOOK_URL;
                }
            } else {
                facebookurl = FACEBOOK_URL;
            }
        } catch (Exception e) {
            facebookurl = FACEBOOK_URL;
        }
        return facebookurl;
    }




    }
