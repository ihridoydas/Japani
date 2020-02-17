package com.hridoy.language.japani.N2.kanji;

public class KanjiN2 {

    private String Name;

    private int Photo;

    public KanjiN2() {

    }

    public KanjiN2(String name, int photo) {
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
