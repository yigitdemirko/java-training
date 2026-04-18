package com.yigit.notification;

public interface NotificationService {
    String getNotificationType();
    void sendNotification(String content);
}
