package com.techreturners.exercise004;

public class Exercise004 {

    public static void main(String[] args) {

        String text = "Eleanor Rigby picks up the rice at the church where a wedding has been";
        System.out.println("Exercise four started");

        TextManipulator textManipulator = new TextManipulator(text);
        textManipulator.getText();
        textManipulator.findWordAndReplace("rice", "confetti");
        textManipulator.printText();

        System.out.println("Exercise four ended");

    }
}
