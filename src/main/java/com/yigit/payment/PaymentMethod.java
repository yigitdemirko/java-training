package com.yigit.payment;

public interface PaymentMethod {
    String processPayment(double amount);
    String getPaymentType();
}