package com.hridoy.language.japani.N5.Voca;

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

public class FragmentVocabolary extends Fragment {

    View v;

    private RecyclerView myrecyclerview;
    private List<Vocabulary>lstVocabulary;



    public FragmentVocabolary() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        v=inflater.inflate(R.layout.vocabolary_fragment,container,false);


    myrecyclerview=(RecyclerView) v.findViewById(R.id.vocabulary_recyclerview);

    RecyclerVewAdapter recyclerVewAdapter =new RecyclerVewAdapter(getContext(),lstVocabulary);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerVewAdapter);
        return v;
}



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstVocabulary=new ArrayList<>();

        lstVocabulary.add(new Vocabulary("Lesson 01",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 02",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 03",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 04",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 05",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 06",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 07",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 08",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 09",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 10",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 11",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 12",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 13",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 14",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 15",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 16",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 17",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 18",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 19",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 20",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 21",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 22",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 23",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 24",R.drawable.read));
        lstVocabulary.add(new Vocabulary("Lesson 25",R.drawable.read));
    }
}
