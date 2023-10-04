package org.mletkin.java17.rec;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatException;

import org.junit.jupiter.api.Test;
import org.mletkin.java17.rec.EmailAdress;

class EmailAdressTest {

    private static final String INVALID = "y.org";
    private static final String VALID = "x@y.org";

    @Test
    void constructorWithValidAddressReturnsObject() {
        assertThat(new EmailAdress(VALID).adr()).isEqualTo(VALID);
    }

    @Test
    void constructorWithInvalidAddressThrowsException() {
        assertThatException().isThrownBy(() -> new EmailAdress(INVALID));
    }

    @Test
    void factoryWithValidAddressReturnsObject() {
        assertThat(EmailAdress.of(VALID).adr()).isEqualTo(VALID);
    }

    @Test
    void factoryWithInvalidAddressReturnsNull() {
        assertThat(EmailAdress.of(INVALID)).isNull();
    }

    @Test
    void optFactoryWithValidAddressReturnsOptionalWithAddress() {
        assertThat(EmailAdress.opt(VALID)).contains(new EmailAdress(VALID));
    }

    @Test
    void optFactoryWithInvalidAddressReturnsEmptyOpttional() {
        assertThat(EmailAdress.opt(INVALID)).isEmpty();
    }

}
