package com.techreturners.rover;


import com.techreturners.plateau.Plateau;

public class Rover {

    private Plateau plateau;
    private RoverPosition currentPosition;

    public Rover(Plateau plateau) {
        this.plateau = plateau;
    }

    public void dropRover(int x, int y, String direction) {
        if (x >= 0 && x < plateau.getPlateauWidth() &&
                y >= 0 && y <plateau.getPlateauHeight()) {
            this.currentPosition = new RoverPosition(x, y);
        }
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public RoverPosition getCurrentPosition() {
        return currentPosition;
    }
}
