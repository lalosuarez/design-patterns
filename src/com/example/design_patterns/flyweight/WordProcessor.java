package com.example.design_patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by esuarezv on 21/04/2017.
 */
public class WordProcessor {

    private List<Letter> letters = new ArrayList<>();

    public void addLetter(Letter letter) {
        this.letters.add(letter);
    }

    public void printLetters() {
        for (Letter letter : this.letters) {
            System.out.print(letter.getValue());
        }
    }
}
