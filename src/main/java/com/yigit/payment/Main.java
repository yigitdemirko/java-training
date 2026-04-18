package com.yigit.payment;

public class Main {
    public static void main(String[] args) {

        PaymentMethod creditCard = new CreditCardPayment("1234567890123456");
        PaymentProcessor processor = new PaymentProcessor(creditCard);
        processor.checkout(99.99);

        System.out.println("---");

        PaymentMethod applePay = new ApplePayPayment("perfect_user_123");
        PaymentProcessor processor2 = new PaymentProcessor(applePay);
        processor2.checkout(49.99);

        System.out.println("---");
    }
}
