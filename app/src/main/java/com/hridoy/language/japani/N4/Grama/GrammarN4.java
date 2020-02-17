package com.hridoy.language.japani.N4.Grama;

public class GrammarN4 {

    private String Name;

    private int Photo;

    public GrammarN4() {

    }

    public GrammarN4(String name, int photo) {
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
