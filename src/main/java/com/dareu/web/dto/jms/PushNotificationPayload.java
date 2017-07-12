package com.dareu.web.dto.jms;

public class PushNotificationPayload {
    private String messageType;
    private Object data;

    public PushNotificationPayload(String messageType, Object data) {
        this.messageType = messageType;
        this.data = data;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
