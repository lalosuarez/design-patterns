package com.example.design_patterns.flyweight;

/**
 * Created by esuarezv on 21/04/2017.
 */
public class Client {
    public static void main(String[] args) {
        WordProcessor wp = new WordProcessor();
        LetterFactory lf = new LetterFactory();
        String text = "Hellooo woooorld";
        for (int i = 0; i < text.length(); i++) {
            String val = text.substring(i, i+1);
            wp.addLetter(lf.create(val));
        }
        wp.printLetters();
    }
}
