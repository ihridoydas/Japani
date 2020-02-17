package com.hridoy.language.japani.N3.kanji;

public class KanjiN3 {

    private String Name;

    private int Photo;

    public KanjiN3() {

    }

    public KanjiN3(String name, int photo) {
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
