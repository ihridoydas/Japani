package com.hridoy.language.japani.N2.Grama;

public class GrammarN2 {

    private String Name;

    private int Photo;

    public GrammarN2() {

    }

    public GrammarN2(String name, int photo) {
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
