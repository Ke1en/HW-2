package Java412;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidatorTest {

    @Test
    void isValidReturnTrue() {

        String cardNumber = "1234 5678 test 5435 test 3244";

        boolean result = CreditCardValidator.isValid(cardNumber);

        assertTrue(result);

    }

    @Test
    void isValidReturnFalse() {

        String cardNumber = "1234 5678 5435 3243";

        boolean result = CreditCardValidator.isValid(cardNumber);

        assertFalse(result);

    }

    @Test
    void isValidReturnEnoughCharacters() {

        String cardNumber = "1234 5678 5435";

        boolean result = CreditCardValidator.isValid(cardNumber);

        assertFalse(result);

    }

    @Test
    void isValidReturnNotEnoughCharacters() {

        String cardNumber = "1234 5678 5435 5435 5435 5435";

        boolean result = CreditCardValidator.isValid(cardNumber);

        assertFalse(result);

    }

    @Test
    void isValidOnlySymbols() {

        String cardNumber = "abcd efff jjjj ffff";

        boolean result = CreditCardValidator.isValid(cardNumber);

        assertFalse(result);

    }

}
