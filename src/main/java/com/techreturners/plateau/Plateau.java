package com.techreturners.plateau;

public class Plateau {

    private int width;
    private int height;

    public Plateau() {
        this(10, 10);
    }

    public Plateau(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getPlateauWidth() {
        return width;
    }

    public int getPlateauHeight() {
        return height;
    }

    }