package com.hridoy.language.japani.N5.Grama;

public class Grammar {

    private String Name;

    private int Photo;

    public Grammar() {

    }

    public Grammar(String name, int photo) {
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
