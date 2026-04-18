package com.yigit.notification;

public class SmsNotification implements NotificationService{

    private String phoneNumber;

    public SmsNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getNotificationType() {
        return "SMS";
    }

    @Override
    public void sendNotification(String content) {
        System.out.println("SMS Notification Sending for phone number: " + phoneNumber);
        System.out.println("Message is: " + content);
    }
}
