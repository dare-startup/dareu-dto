package com.dareu.web.dto.jms;

public class QueueMessage {
    private String token;
    private PayloadMessage payloadMessage;

    public QueueMessage(String token, PayloadMessage payloadMessage) {
        this.token = token;
        this.payloadMessage = payloadMessage;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public PayloadMessage getPayloadMessage() {
        return payloadMessage;
    }

    public void setPayloadMessage(PayloadMessage payloadMessage) {
        this.payloadMessage = payloadMessage;
    }
}
