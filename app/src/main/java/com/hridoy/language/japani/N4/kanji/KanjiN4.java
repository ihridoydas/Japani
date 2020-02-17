package com.hridoy.language.japani.N4.kanji;

public class KanjiN4 {

    private String Name;

    private int Photo;

    public KanjiN4() {

    }

    public KanjiN4(String name, int photo) {
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
