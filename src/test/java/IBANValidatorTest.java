import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Iban validator test.
 */
class IBANValidatorTest {

    /**
     * Valid iban.
     */
    @Test
    @DisplayName("Valid IBAN")
    void validIban() {
         assertTrue(IBANValidator.validate("DE22790200760027913168"));
    }

    /**
     * Invalid iban.
     */
    @Test
    @DisplayName("Invalid IBAN")
    void invalidIban() {
        assertFalse(IBANValidator.validate("DE21790200760027913173"));
    }

    /**
     * Invalid length.
     */
    @Test
    @DisplayName("Invalid Length")
    void invalidLength() {
        assertFalse(IBANValidator.validate("DE227902007600279131"));
    }

    /**
     * Invalid country code.
     */
    @Test
    @DisplayName("Invalid Country Code")
    void invalidCountryCode() {
        assertFalse(IBANValidator.validate("XX22790200760027913168"));
    }
}
