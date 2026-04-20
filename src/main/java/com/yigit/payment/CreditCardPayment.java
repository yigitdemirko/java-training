package com.yigit.payment;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
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
