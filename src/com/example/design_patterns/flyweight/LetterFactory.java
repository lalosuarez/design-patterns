package com.example.design_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by esuarezv on 21/04/2017.
 */
public class LetterFactory {
    private Map<String, Letter> letterMap = new HashMap<>();

    public Letter create(String key) {
        Letter letter = this.letterMap.get(key);
        if (letter == null) {
            letter = new Letter(key);
            this.letterMap.put(key, letter);
        }
        return this.letterMap.get(key);
    }
}
