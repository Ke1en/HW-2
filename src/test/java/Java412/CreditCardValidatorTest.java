package Java412;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidatorTest {

    @Test
    void isValidReturnTrue() {
        String cardNumber = "1234 5678 test 5435 test 3244";
        assertTrue(CreditCardValidator.isValid(cardNumber));
    }

    @Test
    void isValidReturnFalse() {
        String cardNumber = "1234 5678 5435 3243";
        assertFalse(CreditCardValidator.isValid(cardNumber));
    }

    @Test
    void isValidReturnEnoughCharacters() {
        String cardNumber = "1234 5678 5435";
        assertFalse(CreditCardValidator.isValid(cardNumber));
    }

    @Test
    void isValidReturnNotEnoughCharacters() {
        String cardNumber = "1234 5678 5435 5435 5435 5435";
        assertFalse(CreditCardValidator.isValid(cardNumber));
    }

    @Test
    void isValidOnlySymbols() {
        String cardNumber = "abcd efff jjjj ffff";
        assertFalse(CreditCardValidator.isValid(cardNumber));
    }
}