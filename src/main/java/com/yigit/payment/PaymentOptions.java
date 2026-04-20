package com.yigit.payment;

public class PaymentOptions {
    private static final String[] OPTIONS = {
        "CreditCardPayment",
        "ApplePayPayment"
    };

    public static String[] getOptions() {
        return OPTIONS;
    }
}
