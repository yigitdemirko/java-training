package com.yigit.notification;

public class NotificationSender {
    private NotificationService notification;

    public NotificationSender(NotificationService notification) {
        this.notification = notification;
    }

    public void processNotification(String content) {
        System.out.println("Notification message creating...");
        notification.sendNotification(content);
        System.out.println("Notification message sent");
    }
}
