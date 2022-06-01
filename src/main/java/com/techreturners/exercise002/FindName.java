package com.techreturners.exercise002;

public class FindName {
    String [] names = {"JOHN", "PAUL", "GEORGE", "RINGO"};

    public void checkForDrummer(String name) {
        for (int i = 0; i < names.length; i ++){
            if(names[i] == name){
                System.out.println("Drummer found: " + name);
            }
        }
    }
}
