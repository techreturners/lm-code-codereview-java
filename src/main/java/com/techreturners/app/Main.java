package com.techreturners.app;

import com.techreturners.plateau.Plateau;
import com.techreturners.rover.Rover;
import com.techreturners.rover.RoverPosition;

public class Main {
    public static void main(String[] args) {
        Plateau plateau = new Plateau(5, 5);
        Rover rover1 = new Rover(plateau);
        RoverPosition initPosition = new RoverPosition(2, 3);

    }
}
