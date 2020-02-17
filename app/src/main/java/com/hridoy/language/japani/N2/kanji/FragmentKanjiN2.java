package com.hridoy.language.japani.N2.kanji;

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

public class FragmentKanjiN2 extends Fragment {


    View v;

    private RecyclerView myrecyclerview;

    private List<KanjiN2> lstKanjiN2;

    public FragmentKanjiN2() {

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.kanji_fragment_n2,container,false);


        myrecyclerview=(RecyclerView) v.findViewById(R.id.kanji_recyclerview_n2);

        RecyclerVewAdapterN2 recyclerVewAdapterN2 =new RecyclerVewAdapterN2(getContext(), lstKanjiN2);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerVewAdapterN2);
        return v;
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstKanjiN2 =new ArrayList<>();

        lstKanjiN2.add(new KanjiN2("Lesson 01",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 02",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 03",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 04",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 05",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 06",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 07",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 08",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 09",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 10",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 11",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 12",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 13",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 14",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 15",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 16",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 17",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 18",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 19",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 20",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 21",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 22",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 23",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 24",R.drawable.read));
        lstKanjiN2.add(new KanjiN2("Lesson 25",R.drawable.read));
    }
}
