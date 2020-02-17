package com.hridoy.language.japani.N2.Voca;

public class VocabularyN2 {

    private String Name;

    private int Photo;


    public VocabularyN2() {


    }

    public VocabularyN2(String name, int photo) {
        Name = name;
        Photo = photo;
    }

    //geter

    public String getName() {
        return Name;
    }

    public int getPhoto() {
        return Photo;
    }


    //setter


    public void setName(String name) {
        Name = name;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
