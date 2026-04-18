package com.yigit.notification;

public class EmailNotification implements NotificationService{
    private String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public String getNotificationType() {
        return "Email";
    }

    @Override
    public void sendNotification(String content) {
        System.out.println("Email Notification Sending for email: " +email);
        System.out.println("Message is: " + content);
    }
}
