package org.mletkin.java17.switsch;

import org.junit.jupiter.api.Test;
import org.mletkin.java17.switsch.Switsch.Animal;

class SwitschTest {

    private Switsch target = new Switsch();

    @Test
    void oldBreaklessAnt() {
        target.oldStyleWithoutBreak(Animal.ANT);
    }

    @Test
    void oldBearAnt() {
        target.oldStyleWithBreak(Animal.ANT);
    }

    @Test
    void newAnt() {
        target.newStyle(Animal.ANT);
    }

    @Test
    void newAntWithYield() {
        target.newStyleWithYield(Animal.CENTIPEDE);
    }
}
