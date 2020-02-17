package com.hridoy.language.japani.N1.Grama;

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

public class FragmentGrammerN1 extends Fragment {

    View v;

    private RecyclerView myrecyclerview;

    private List<GrammarN1>lstGrammer;
    public FragmentGrammerN1() {


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        v=inflater.inflate(R.layout.grammer_fragment_n1,container,false);


        myrecyclerview=(RecyclerView) v.findViewById(R.id.grammar_recyclerview_n1);

        RecyclerVewAdapterN1 recyclerVewAdapterN1 =new RecyclerVewAdapterN1(getContext(),lstGrammer);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerVewAdapterN1);
        return v;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstGrammer=new ArrayList<>();

        lstGrammer.add(new GrammarN1("Lesson 01",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 02",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 03",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 04",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 05",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 06",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 07",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 08",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 09",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 10",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 11",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 12",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 13",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 14",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 15",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 16",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 17",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 18",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 19",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 20",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 21",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 22",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 23",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 24",R.drawable.read));
        lstGrammer.add(new GrammarN1("Lesson 25",R.drawable.read));
    }
}
