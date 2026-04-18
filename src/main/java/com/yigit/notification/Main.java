package com.yigit.notification;

public class Main {
    public static void main(String[] args) {
        NotificationService sms = new SmsNotification("+905555555555");
        NotificationSender smsNotificationSender = new NotificationSender(sms);
        smsNotificationSender.processNotification("Congratulations for your reward");

        System.out.println("-------");

        NotificationService email = new EmailNotification("example@example.com");
        NotificationSender emailNotificationSender = new NotificationSender(email);
        emailNotificationSender.processNotification("Congratulations for your reward");
    }
}
