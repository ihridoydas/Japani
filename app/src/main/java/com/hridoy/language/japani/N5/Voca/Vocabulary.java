package com.hridoy.language.japani.N5.Voca;

public class Vocabulary {

    private String Name;

    private int Photo;


    public Vocabulary() {


    }

    public Vocabulary(String name, int photo) {
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
