package com.techreturners.exercise002;

public class Beatles {
    String [] names = {"JOHN", "PAUL", "GEORGE", "RINGO"};

    public void checkForDrummer(String name) {
        for (int i = 0; i < names.length; i ++){
            if(names[i] == name){
                System.out.println("Drummer found: " + name);
            }
        }
    }

    public void averageNumberOnes(){
        double yearsActive = 8;
        double average = 20 / yearsActive;
        System.out.println("The beatles had an average of " + average + " No.1 records per year during their time together");
    }
}
