package com.dareu.web.dto.jms;

public class PushNotificationRequest {
    private String token;
    private PushNotificationPayload pushNotificationPayload;

    public PushNotificationRequest(String token, PushNotificationPayload pushNotificationPayload) {
        this.token = token;
        this.pushNotificationPayload = pushNotificationPayload;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public PushNotificationPayload getPushNotificationPayload() {
        return pushNotificationPayload;
    }

    public void setPushNotificationPayload(PushNotificationPayload pushNotificationPayload) {
        this.pushNotificationPayload = pushNotificationPayload;
    }
}
