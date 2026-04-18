package com.yigit.payment;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment for amount: $" + amount);
        System.out.println("Card Number: " + cardNumber);
    }

    @Override
    public String getPaymentType() {
        return "Credit_Card";
    }

    private String maskCardNumber() {
        return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
    }
}
