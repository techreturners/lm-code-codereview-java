package com.techreturners.exercise002;

public class Exercise002 {

    public static void main(String[] args) {
        System.out.println("Exercise Two started");

        String drummer = new String("ringo");

        Beatles beatles = new Beatles();
        beatles.checkForDrummer(drummer);

        beatles.averageNumberOnes();

        System.out.println("Exercise Two ended");
    }
}
