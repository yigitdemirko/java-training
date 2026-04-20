package com.yigit.payment;

public class ApplePayPayment implements PaymentMethod {

    private String userId;

    public ApplePayPayment (String userId) {
        this.userId = userId;
    }

    @Override
    public String processPayment(double amount) {
        return String.format("✔ Apple Pay payment of $%.2f processed. User: %s", amount, userId);
    }

    @Override
    public String getPaymentType() {
        return "Apple_Pay";
    }
}
