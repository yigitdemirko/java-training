package com.yigit.payment;

public class ApplePayPayment implements PaymentMethod {

    private String userId;

    public ApplePayPayment (String userId) {
        this.userId = userId;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Apple Pay payment for amount: $" + amount);
        System.out.println("Apple Pay User: " + userId);
    }

    @Override
    public String getPaymentType() {
        return "Apple_Pay";
    }
}
