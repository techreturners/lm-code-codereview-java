package com.techreturners.plateau;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PlateauTest {

    @Test
    public void testValidPlateauWidthConstruction() {
        Plateau plateau = new Plateau(10, 10);
        assertEquals(10, plateau.getPlateauWidth());
    }

    @Test
    public void testValidGridHeightConstruction() {
        Plateau plateau = new Plateau(10, 10);
        assertEquals(10, plateau.getPlateauWidth());
    }


}
