package com.techreturners.rover;



public class RoverPosition {

    private int xPosition;
    private int yPosition;

    // Imutable object
    public RoverPosition(int x, int y) {
        this.xPosition = x;
        this.yPosition = y;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }
}
