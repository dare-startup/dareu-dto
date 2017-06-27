package com.dareu.web.dto.jms;

public class PushNotificationMessage {
    private String token;
    private NotificationMessage notificationMessage;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public NotificationMessage getNotificationMessage() {
        return notificationMessage;
    }

    public void setNotificationMessage(NotificationMessage notificationMessage) {
        this.notificationMessage = notificationMessage;
    }
}
