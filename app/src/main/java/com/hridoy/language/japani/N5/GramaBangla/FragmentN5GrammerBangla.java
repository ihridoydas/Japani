package com.hridoy.language.japani.N5.GramaBangla;

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

public class FragmentN5GrammerBangla extends Fragment {

    View v;

    private RecyclerView myrecyclerview;

    private List<GrammarN5Bangla>lstGrammer;
    public FragmentN5GrammerBangla() {


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        v=inflater.inflate(R.layout.grammer_fragment_bangla_n5,container,false);


        myrecyclerview=(RecyclerView) v.findViewById(R.id.grammar_recyclerview_n5_bangla);

        RecyclerVewAdapterBangla recyclerVewAdapterBangla =new RecyclerVewAdapterBangla(getContext(),lstGrammer);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerVewAdapterBangla);
        return v;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstGrammer=new ArrayList<>();

        lstGrammer.add(new GrammarN5Bangla("Lesson 01",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 02",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 03",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 04",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 05",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 06",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 07",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 08",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 09",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 10",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 11",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 12",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 13",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 14",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 15",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 16",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 17",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 18",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 19",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 20",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 21",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 22",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 23",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 24",R.drawable.grama));
        lstGrammer.add(new GrammarN5Bangla("Lesson 25",R.drawable.grama));
    }
}
