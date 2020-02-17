package com.hridoy.language.japani.N5.kanji;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hridoy.language.japani.N5.Grama.Grammar;
import com.hridoy.language.japani.N5.kanji.RecyclerVewAdapter;
import com.hridoy.language.japani.N5.kanji.Kanji;
import com.hridoy.language.japani.R;

import java.util.ArrayList;
import java.util.List;

public class FragmentKanji extends Fragment {


    View v;

    private RecyclerView myrecyclerview;

    private List<Kanji> lstKanji;

    public FragmentKanji() {

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v=inflater.inflate(R.layout.kanji_fragment,container,false);


        myrecyclerview=(RecyclerView) v.findViewById(R.id.kanji_recyclerview);

        RecyclerVewAdapter recyclerVewAdapter =new RecyclerVewAdapter(getContext(),lstKanji);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerVewAdapter);
        return v;
    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstKanji=new ArrayList<>();

        lstKanji.add(new Kanji("Lesson 01",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 02",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 03",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 04",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 05",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 06",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 07",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 08",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 09",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 10",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 11",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 12",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 13",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 14",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 15",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 16",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 17",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 18",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 19",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 20",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 21",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 22",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 23",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 24",R.drawable.read));
        lstKanji.add(new Kanji("Lesson 25",R.drawable.read));
    }
}
