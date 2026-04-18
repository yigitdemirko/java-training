# Shipment Service — Strategy Pattern

Developed as a personal study. A shipment system designed
to allow new shipping strategies to be added without modifying
existing code.

## How It Works

A `ShippingStrategy` interface was defined.
`FreeShipping`, `StandardShipping`, and `ExpressShipping` implement this interface.
`OrderService` only knows this interface —
it doesn't know which shipping strategy is being used,
and it doesn't need to.

To add a new shipping strategy, `OrderService` is never touched.
Only a new class implementing the `ShippingStrategy` interface
needs to be written.

## Strategy Pattern Applied

- **Strategy Pattern:** Shipping behavior is encapsulated in separate classes.
  `OrderService` delegates the shipping logic to whichever strategy is injected.

- **OCP:** New shipping types (`FreeShipping`, `StandardShipping`, `ExpressShipping`)
  were added without ever modifying `OrderService`.

- **DIP:** `OrderService` depends on the `ShippingStrategy` interface,
  not on concrete classes.