package com.hridoy.language.japani.N5.GramaBangla;

public class GrammarN5Bangla {

    private String Name;

    private int Photo;

    public GrammarN5Bangla() {

    }

    public GrammarN5Bangla(String name, int photo) {
        Name = name;
        Photo = photo;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}