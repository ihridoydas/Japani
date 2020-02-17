package com.hridoy.language.japani.N4.kanji;

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

public class FragmentKanjiN4 extends Fragment {


    View v;

    private RecyclerView myrecyclerview;

    private List<KanjiN4> lstKanjiN4;

    public FragmentKanjiN4() {

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.kanji_fragment_n4,container,false);


        myrecyclerview=(RecyclerView) v.findViewById(R.id.kanji_recyclerview_n4);

        RecyclerVewAdapterN4 recyclerVewAdapterN4 =new RecyclerVewAdapterN4(getContext(), lstKanjiN4);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerVewAdapterN4);
        return v;
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstKanjiN4 =new ArrayList<>();

        lstKanjiN4.add(new KanjiN4("Lesson 01",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 02",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 03",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 04",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 05",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 06",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 07",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 08",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 09",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 10",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 11",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 12",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 13",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 14",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 15",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 16",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 17",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 18",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 19",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 20",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 21",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 22",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 23",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 24",R.drawable.read));
        lstKanjiN4.add(new KanjiN4("Lesson 25",R.drawable.read));
    }
}
