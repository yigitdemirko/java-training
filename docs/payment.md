# Payment Service — SOLID Principles

Developed as a bootcamp assignment. A payment system designed
to allow new payment methods to be added without modifying
existing code.

## How It Works

A `PaymentMethod` interface was defined.
Credit card and Apple Pay implement this interface.
`PaymentProcessor` only knows this interface —
it doesn't know which payment method is being used,
and it doesn't need to.

To add a new payment method, `PaymentProcessor` is never touched.
Only a new class implementing the `PaymentMethod` interface
needs to be written.

## SOLID Principles Applied

- **SRP:** Each class has a single responsibility. `CreditCardPayment`
  only handles credit card logic, `PaymentProcessor` only manages
  the payment flow.

- **OCP:** 2 different payment methods were added without ever
  modifying `PaymentProcessor`.

- **DIP:** `PaymentProcessor` depends on the `PaymentMethod`
  interface, not on concrete classes.