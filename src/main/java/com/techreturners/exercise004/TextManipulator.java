package com.techreturners.exercise004;

import java.util.Arrays;

public class TextManipulator {

    private String text;

    public TextManipulator(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void appendText(String newText) {
        text = text.concat(newText);
    }

    public String findWordAndReplace(String word, String replacementWord) {
        if (text.contains(word)) {
            text = text.replace(word, replacementWord);
        }
        return text;
    }

    public String findWordAndDelete(String word) {
        if (text.contains(word)) {
            text = text.replace(word, "");
        }
        return text;
    }

    public void printText() {
        System.out.println(getText());
    }
    public void printOutEachWordOfText() {
        System.out.println(Arrays.toString(getText().split(" ")));
    }

    public void printRangeOfCharacters(int startingIndex, int endIndex) {
        System.out.println(getText().substring(startingIndex, endIndex));
    }
}


