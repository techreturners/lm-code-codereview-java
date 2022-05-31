package com.techreturners.app;

public class Main {
    public static void main(String[] args) {

    }

    public class Plateau {

        public int width;
        public int height;

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

        public class Rover {
            public Plateau plateau;
            public RoverPosition currentPosition;

            public void Rover(Plateau plateau) {
                this.plateau = plateau;
            }

            public void dropRover(int x, int y, String direction) {
                if (x >= 0 && x < plateau.getPlateauWidth() &&
                        y >= 0 && y <plateau.getPlateauHeight()) {
                    this.currentPosition = new RoverPosition();
                }
            }

            public Plateau getPlateau() {
                return plateau;
            }

            public RoverPosition getCurrentPosition() {
                return currentPosition;
            }
        }

    public class RoverPosition {
        public int xPosition;
        public int yPosition;

        // Imutable object
        public void RoverPosition(int x, int y) {
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

}
