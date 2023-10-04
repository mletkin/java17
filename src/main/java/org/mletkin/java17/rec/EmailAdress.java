package org.mletkin.java17.rec;

import java.util.Optional;

/**
 * Demonstrates value validation on creation.
 * <p>
 * The demonstration check only checks for The @-symbol. For a discussion of
 * unseful email validating regexes see
 * https://www.baeldung.com/java-email-validation-regex
 */
public record EmailAdress(String adr) {

    /**
     * Create the object only for a valid address.
     * <p>
     * Throws an exception if the eMail address isn't valid.
     *
     * @param adr
     *                alleged eMail address
     */
    public EmailAdress(String adr) {
        check(adr);
        this.adr = adr;
    }

    /**
     * Create the object only for a valid address.
     * <p>
     * Theresult is {@code null} if the eMail address istn't valid.
     *
     * @param adr
     *                alleged eMail address
     * @return an {@code EmailAdress}-Object or {@code null}
     */
    public static EmailAdress of(String adr) {
        return isValid(adr) //
                ? new EmailAdress(adr) //
                : null;
    }

    /**
     * Create the object only for a valid address.
     * <p>
     * The {@code Optional} is empty if the eMail address istn't valid.
     *
     * @param adr
     *                alleged eMail address
     * @return an {@code EmailAdress}-Object wrapped in an {@code Optional}
     */
    public static Optional<EmailAdress> opt(String adr) {
        return Optional.ofNullable(of(adr));
    }

    private void check(String adr) {
        if (!isValid(adr)) {
            throw new RuntimeException("not an eMail address: " + adr);
        }
    }

    private static boolean isValid(String adr) {
        return (adr != null && adr.contains("@"));
    }
}
