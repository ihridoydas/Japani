package com.hridoy.language.japani.N5.Grama;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hridoy.language.japani.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentGrammer extends Fragment {

    View v;

    private RecyclerView myrecyclerview;

    private List<Grammar>lstGrammer;
    public FragmentGrammer() {


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        v=inflater.inflate(R.layout.grammer_fragment,container,false);


        myrecyclerview=(RecyclerView) v.findViewById(R.id.grammar_recyclerview);

        RecyclerVewAdapter recyclerVewAdapter =new RecyclerVewAdapter(getContext(),lstGrammer);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerVewAdapter);
        return v;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstGrammer=new ArrayList<>();

        lstGrammer.add(new Grammar("Lesson 01",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 02",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 03",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 04",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 05",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 06",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 07",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 08",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 09",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 10",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 11",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 12",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 13",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 14",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 15",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 16",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 17",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 18",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 19",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 20",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 21",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 22",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 23",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 24",R.drawable.grama));
        lstGrammer.add(new Grammar("Lesson 25",R.drawable.grama));
    }
}
