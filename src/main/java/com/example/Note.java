package com.example;

public class Note implements Compose {

    private final char value;

    public Note(char value) {
        this.value = value;
    }

    @Override
    public void play() {
        System.out.println(value);
    }

}
