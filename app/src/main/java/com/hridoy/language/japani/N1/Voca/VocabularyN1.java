package com.hridoy.language.japani.N1.Voca;

public class VocabularyN1 {

    private String Name;

    private int Photo;


    public VocabularyN1() {


    }

    public VocabularyN1(String name, int photo) {
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
