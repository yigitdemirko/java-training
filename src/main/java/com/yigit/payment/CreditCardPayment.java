package com.yigit.payment;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        if (cardNumber == null || !cardNumber.matches("\\d{16}")) {
            throw new IllegalArgumentException("Card number must be exactly 16 digits.");
        }
        this.cardNumber = cardNumber;
    }

    @Override
    public String processPayment(double amount) {
        return String.format("✔ Credit Card payment of $%.2f processed. Card: %s", amount, maskCardNumber());
    }

    @Override
    public String getPaymentType() {
        return "Credit_Card";
    }

    private String maskCardNumber() {
        return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
    }
}
