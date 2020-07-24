package com.hridoy.language.japani.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.hridoy.language.japani.N3.N3Activity;
import com.hridoy.language.japani.N4.N4Activity;
import com.hridoy.language.japani.N5.N5Activity;
import com.hridoy.language.japani.R;

public class GalleryFragment extends Fragment implements View.OnClickListener{

    private GalleryViewModel galleryViewModel;

    private CardView Hiragana,Katakana;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);


        Hiragana =root.findViewById(R.id.hiragana);
        Katakana =root.findViewById(R.id.katakana);


        Hiragana.setOnClickListener(this);
        Katakana.setOnClickListener(this);


        return root;
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.hiragana) {

            startActivity(new Intent(getActivity(), Hiragana.class));
            // startActivity(new Intent(getActivity(), N1Activity.class));


        } else if (v.getId() == R.id.katakana) {

            startActivity(new Intent(getActivity(), Katakana.class));

            //startActivity(new Intent(getActivity(), N2Activity.class));
        }
    }



}