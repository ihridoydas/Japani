package com.hridoy.language.japani.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.hridoy.language.japani.N1.N1Activity;
import com.hridoy.language.japani.N2.N2Activity;
import com.hridoy.language.japani.N3.N3Activity;
import com.hridoy.language.japani.N4.N4Activity;
import com.hridoy.language.japani.N5.N5Activity;
import com.hridoy.language.japani.R;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private HomeViewModel homeViewModel;
    private CardView N5,N4,N3,N2,N1,Help;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        N5 =root.findViewById(R.id.n5);
        N4 =root.findViewById(R.id.n4);
        N3 =root.findViewById(R.id.n3);
        N2 =root.findViewById(R.id.n2);
        N1 =root.findViewById(R.id.n1);
        Help =root.findViewById(R.id.help);

        N5.setOnClickListener(this);
        N4.setOnClickListener(this);
        N3.setOnClickListener(this);
        N2.setOnClickListener(this);
        N1.setOnClickListener(this);
        Help.setOnClickListener(this);

        return root;


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.n1){

            Toast.makeText(getActivity(), "Available on Next Update",
                    Toast.LENGTH_LONG).show();
           // startActivity(new Intent(getActivity(), N1Activity.class));


        }



        else if(v.getId()==R.id.n2){

            Toast.makeText(getActivity(), "Available on Next Update",
                    Toast.LENGTH_LONG).show();

            //startActivity(new Intent(getActivity(), N2Activity.class));
        }



        else if(v.getId()==R.id.n3){


            startActivity(new Intent(getActivity(), N3Activity.class));
        }


        else if(v.getId()==R.id.n4){

            startActivity(new Intent(getActivity(), N4Activity.class));

        }



        else if(v.getId()==R.id.n5){

            startActivity(new Intent(getActivity(),N5Activity.class));
        }


        else if(v.getId()==R.id.help){


        }

    }
}