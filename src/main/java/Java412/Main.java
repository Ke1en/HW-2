package Java412;

public class Main {
    public static void main(String[] args) {
        String cardNumber = "1234 5678 test 5435 test 3244";

        if (CreditCardValidator.isValid(cardNumber)) {
            System.out.println("Valid Card Number");
        } else {
            System.out.println("Invalid Card Number");
        }
    }
}
