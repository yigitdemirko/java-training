package com.yigit.payment;

public class PaymentProcessor {
    private PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount) {
        System.out.println("\n--- Checkout ---");
        String result = paymentMethod.processPayment(amount);
        System.out.println(result);
        System.out.println("----------------\n");
    }
}