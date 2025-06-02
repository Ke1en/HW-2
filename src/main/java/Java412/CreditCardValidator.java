package Java412;

public class CreditCardValidator {
    public static boolean isValid(String cardNumber) {
        String cleanCardNumber = cleanInput(cardNumber);

        if (!checkCardNumberOnlyDigits(cleanCardNumber))
            return false;

        if (checkCardNumberLengthFits(cleanCardNumber))
            return false;

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
