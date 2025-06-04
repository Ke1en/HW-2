package Java412;

/**
 * Main class for CreditCardValidator tests.
 * <p>
 *     Exists of entry point into program and demonstrates an example of {@link CreditCardValidator} class.
 * </p>
 */
public class Main {
    /**
     * Entry point into program
     * Outputs the result into console
     *
     * @param args command line argument (never used)
     */
    public static void main(String[] args) {

        String cardNumber = "1234 5678 test 5435 test 3244";

        if (CreditCardValidator.isValid(cardNumber)) {
            System.out.println("Valid Card Number");
        } else {
            System.out.println("Invalid Card Number");
        }
    }

}
