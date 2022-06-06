package com.techreturners.exercise005;

public class Guitar {

    private String make;
    private String model;
    private int volumeControl;

    public Guitar(String make, String model, int volumeControl) {
        this.make = make;
        this.model = model;
        this.volumeControl = volumeControl;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }


    public int getVolumeControl() {
        return volumeControl;
    }
}
