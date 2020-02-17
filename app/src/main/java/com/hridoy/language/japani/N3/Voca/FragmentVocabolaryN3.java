package com.hridoy.language.japani.N3.Voca;

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

public class FragmentVocabolaryN3 extends Fragment {

    View v;

    private RecyclerView myrecyclerview;
    private List<VocabularyN3> lstVocabularyN3;



    public FragmentVocabolaryN3() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        v=inflater.inflate(R.layout.vocabolary_fragment_n3,container,false);


    myrecyclerview=(RecyclerView) v.findViewById(R.id.vocabulary_recyclerview_n3);

    RecyclerVewAdapterN3 recyclerVewAdapterN3 =new RecyclerVewAdapterN3(getContext(), lstVocabularyN3);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerVewAdapterN3);
        return v;
}



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstVocabularyN3 =new ArrayList<>();

        lstVocabularyN3.add(new VocabularyN3("Lesson 01",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 02",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 03",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 04",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 05",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 06",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 07",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 08",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 09",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 10",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 11",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 12",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 13",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 14",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 15",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 16",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 17",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 18",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 19",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 20",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 21",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 22",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 23",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 24",R.drawable.read));
        lstVocabularyN3.add(new VocabularyN3("Lesson 25",R.drawable.read));
    }
}
