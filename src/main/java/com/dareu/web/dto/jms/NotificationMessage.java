package com.dareu.web.dto.jms;

import java.util.Map;

public class NotificationMessage {
    private String messageType;
    private Map<String, String> properties;

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }
}
