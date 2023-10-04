package org.mletkin.java17.rec;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.mletkin.java17.rec.Complex;

class ComplexTest {

    @Test
    void twoComplexNumbersAreAdded() {
        var a = new Complex(5, 6);
        var b = new Complex(3, 4);

        Complex result = a.plus(b);

        assertThat(result.real()).isEqualTo(8.0);
        assertThat(result.img()).isEqualTo(10.0);
    }

    @Test
    void toStringHasBeenOverridden() {
        var a = new Complex(5, 6);

        assertThat(a).hasToString("5.0 + 6.0i");
    }

}
