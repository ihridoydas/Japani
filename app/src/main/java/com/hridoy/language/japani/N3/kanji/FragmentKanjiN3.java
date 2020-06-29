package com.hridoy.language.japani.N3.kanji;

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

public class FragmentKanjiN3 extends Fragment {


    View v;

    private RecyclerView myrecyclerview;

    private List<KanjiN3> lstKanjiN3;

    public FragmentKanjiN3() {

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.kanji_fragment_n3,container,false);


        myrecyclerview=(RecyclerView) v.findViewById(R.id.kanji_recyclerview_n3);

        RecyclerVewAdapterN3 recyclerVewAdapterN3 =new RecyclerVewAdapterN3(getContext(), lstKanjiN3);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerVewAdapterN3);
        return v;
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstKanjiN3 =new ArrayList<>();

        lstKanjiN3.add(new KanjiN3("Lesson 01",R.drawable.kanji));
        lstKanjiN3.add(new KanjiN3("Lesson 02",R.drawable.kanji));
        lstKanjiN3.add(new KanjiN3("Lesson 03",R.drawable.kanji));
        lstKanjiN3.add(new KanjiN3("Lesson 04",R.drawable.kanji));
        lstKanjiN3.add(new KanjiN3("Lesson 05",R.drawable.kanji));
        lstKanjiN3.add(new KanjiN3("Lesson 06",R.drawable.kanji));
        lstKanjiN3.add(new KanjiN3("Lesson 07",R.drawable.kanji));
        lstKanjiN3.add(new KanjiN3("Lesson 08",R.drawable.kanji));
        lstKanjiN3.add(new KanjiN3("Lesson 09",R.drawable.kanji));
        lstKanjiN3.add(new KanjiN3("Lesson 10",R.drawable.kanji));
        lstKanjiN3.add(new KanjiN3("Lesson 11",R.drawable.kanji));
        lstKanjiN3.add(new KanjiN3("Lesson 12",R.drawable.kanji));
        lstKanjiN3.add(new KanjiN3("Lesson 13",R.drawable.kanji));
        lstKanjiN3.add(new KanjiN3("Lesson 14",R.drawable.kanji));
        lstKanjiN3.add(new KanjiN3("Lesson 15",R.drawable.kanji));

    }
}
