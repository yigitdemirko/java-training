package com.yigit.payment;

import java.util.Scanner;

public class Main {

    private static final String[] PAYMENT_OPTIONS = {"CreditCardPayment", "ApplePayPayment"};

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Payment Service ===");
        System.out.println("Select payment method:");
        for (int i = 0; i < PAYMENT_OPTIONS.length; i++) {
            System.out.printf("  %d. %s%n", i + 1, PAYMENT_OPTIONS[i]);
        }

        System.out.print("Choice: ");
        int choice = Integer.parseInt(scanner.nextLine().trim()) - 1;

        if (choice < 0 || choice >= PAYMENT_OPTIONS.length) {
            System.out.println("Invalid choice.");
            return;
        }

        String selectedClass = PAYMENT_OPTIONS[choice];

        System.out.print("Enter credential (card number / user ID): ");
        String credential = scanner.nextLine().trim();

        System.out.print("Enter amount: $");
        double amount = Double.parseDouble(scanner.nextLine().trim());

        PaymentMethod paymentMethod = PaymentFactory.create(selectedClass, credential);
        PaymentProcessor processor = new PaymentProcessor(paymentMethod);
        processor.checkout(amount);

        scanner.close();
    }
}
