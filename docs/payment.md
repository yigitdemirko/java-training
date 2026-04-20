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

The user is presented with a list of available payment methods
at runtime and selects one interactively. `PaymentFactory` uses
Java Reflection to instantiate the selected payment class dynamically,
without a switch-case or if-else chain.

To add a new payment method, only two things are needed:
1. A new class implementing `PaymentMethod`
2. Its name added to `PaymentOptions`

`PaymentProcessor`, `PaymentFactory`, and `Main` are never touched.

## Classes

| Class | Responsibility |
|---|---|
| `PaymentMethod` | Interface defining the contract for all payment methods |
| `CreditCardPayment` | Credit card logic, 16-digit validation, card masking |
| `ApplePayPayment` | Apple Pay logic |
| `PaymentProcessor` | Manages checkout flow and output |
| `PaymentFactory` | Instantiates payment classes dynamically via Reflection |
| `PaymentOptions` | Holds the list of available payment methods |

## SOLID Principles Applied

- **SRP:** Each class has a single responsibility. `CreditCardPayment`
  handles credit card logic and its own validation, `PaymentProcessor`
  manages the checkout flow, `PaymentOptions` owns the list of
  available methods, `Main` only handles user interaction.

- **OCP:** New payment methods can be added without modifying
  `PaymentProcessor`, `PaymentFactory`, or `Main`.

- **LSP:** `CreditCardPayment` and `ApplePayPayment` are fully
  substitutable for `PaymentMethod`.

- **DIP:** `PaymentProcessor` depends on the `PaymentMethod`
  interface, not on concrete classes. The dependency is injected
  via constructor.

## Reflection

`PaymentFactory` uses `Class.forName()`, `getDeclaredConstructor()`,
and `newInstance()` to instantiate payment classes from their string names.
This keeps the factory closed for modification — adding a new payment
method requires no changes to `PaymentFactory`.