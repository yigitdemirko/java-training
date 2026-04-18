# Notification Service — SOLID Principles

Developed as a personal study. A notification system designed
to allow new notification types to be added without modifying
existing code.

## How It Works

A `NotificationService` interface was defined.
`SmsNotification` and `EmailNotification` implement this interface.
`NotificationSender` only knows this interface —
it doesn't know which notification type is being used,
and it doesn't need to.

To add a new notification type, `NotificationSender` is never touched.
Only a new class implementing the `NotificationService` interface
needs to be written.

## SOLID Principles Applied

- **SRP:** Each class has a single responsibility. `EmailNotification`
  only handles email logic, `NotificationSender` only manages
  the notification flow.

- **OCP:** 2 different notification types were added without ever
  modifying `NotificationSender`.

- **DIP:** `NotificationSender` depends on the `NotificationService`
  interface, not on concrete classes.