package com.techreturners.rover;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.techreturners.plateau.Plateau;
import com.techreturners.rover.Rover;
import org.junit.jupiter.api.Test;

public class RoverTest {

    @Test
    public void testPlateauPopulated() {
        Plateau p = new Plateau(5, 5);
        Rover rover = new Rover(p);
        assertNotNull(rover.getPlateau());
    }

    @Test
    public void testValidDropRover() {
        Plateau p = new Plateau(5, 5);
        Rover rover = new Rover(p);
        rover.dropRover(0, 0, "S");
        RoverPosition rp = rover.getCurrentPosition();
        assertEquals(0, rp.getXPosition());
    }
}
