package com.hridoy.language.japani.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.hridoy.language.japani.R;
import com.hridoy.language.japani.ui.gallery.Hiragana;
import com.hridoy.language.japani.ui.gallery.Katakana;

public class SlideshowFragment extends Fragment implements View.OnClickListener {

    private SlideshowViewModel slideshowViewModel;

    private CardView ListenCon,ListenPrac;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);



        ListenCon =root.findViewById(R.id.listen_conversation);
        ListenPrac =root.findViewById(R.id.listen_practise);


        ListenCon.setOnClickListener(this);
        ListenPrac.setOnClickListener(this);






        return root;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.listen_conversation) {

            startActivity(new Intent(getActivity(), ListenConversation.class));
            // startActivity(new Intent(getActivity(), N1Activity.class));


        } else if (v.getId() == R.id.listen_practise) {

            startActivity(new Intent(getActivity(), ListenPractise.class));

            //startActivity(new Intent(getActivity(), N2Activity.class));
        }
    }

}