package com.yigit.payment;

public class PaymentProcessor {
    private PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount) {
        System.out.println("Starting checkout...");
        paymentMethod.processPayment(amount);
        System.out.println("Payment completed.");
    }
}