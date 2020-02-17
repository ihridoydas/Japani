package com.hridoy.language.japani.N1.Grama;

public class GrammarN1 {

    private String Name;

    private int Photo;

    public GrammarN1() {

    }

    public GrammarN1(String name, int photo) {
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
