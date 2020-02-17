package com.hridoy.language.japani.N3.Grama;

public class GrammarN3 {

    private String Name;

    private int Photo;

    public GrammarN3() {

    }

    public GrammarN3(String name, int photo) {
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
