package com.dareu.web.dto.request;

public class ContactReplyRequest {
    private String contactMessageId;
    private String body;

    public String getContactMessageId() {
        return contactMessageId;
    }

    public void setContactMessageId(String contactMessageId) {
        this.contactMessageId = contactMessageId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
