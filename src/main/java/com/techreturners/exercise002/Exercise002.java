package com.techreturners.exercise002;

public class Exercise002 {

    public static void main(String[] args) {
        System.out.println("Exercise Two started");

        String drummer = new String("ringo");

        FindName beatle = new FindName();
        beatle.checkForDrummer(drummer);

        System.out.println("Exercise Two ended");
    }
}
