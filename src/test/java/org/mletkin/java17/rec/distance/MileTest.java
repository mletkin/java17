package org.mletkin.java17.rec.distance;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MileTest {

    @Test
    void milesToKilometer() {
        assertThat(new Miles(1).toKilometer()).isEqualTo(new Kilometer(1.60934));
    }

    @Test
    void kilometerToMiles() {
        assertThat(new Kilometer(1.60934).toMiles()).isEqualTo(new Miles(1.0));
    }

}
