package Java412;

/**
 * Credit card number validator via luhn algorithm
 */
public class CreditCardValidator {

    /**
     * Checks if credit card number is valid
     * <p>
     *     Do a three-step card number verification
     *     <ol>
     *         <li>Clears of all non-numeric characters</li>
     *         <li>Checks the card number is in range 13-19</li>
     *         <li>Applies luhn algorithm</li>
     *     </ol>
     * </p>
     *
     * @param cardNumber card number (may contain any characters)
     * @return {@code true} if card number is valid or {@code false} if not
     */
    public static boolean isValid(String cardNumber) {

        String cleanCardNumber = cleanInput(cardNumber);

        if (!checkCardNumberOnlyDigits(cleanCardNumber))
            return false;

        if (checkCardNumberLengthFits(cleanCardNumber))
            return false;

        return luhnAlgorithm(cleanCardNumber);

    }

    private static boolean luhnAlgorithm(String cleanCardNumber) {

        int sum = 0;
        boolean isEvenDigit = false;

        for (int i = cleanCardNumber.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(cleanCardNumber.charAt(i));

            if (isEvenDigit) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }

            sum += digit;

            isEvenDigit = !isEvenDigit;
        }

        return sum % 10 == 0;

    }

    private static boolean checkCardNumberLengthFits(String cleanCardNumber) {
        return cleanCardNumber.length() < 13 || cleanCardNumber.length() > 19;
    }

    private static boolean checkCardNumberOnlyDigits(String cleanCardNumber) {
        return cleanCardNumber.matches("\\d+");
    }

    private static String cleanInput(String cardNumber) {
        return cardNumber.replaceAll("\\D", "");
    }

}
