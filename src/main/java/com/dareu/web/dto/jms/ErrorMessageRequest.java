package com.dareu.web.dto.jms;

public class ErrorMessageRequest {
    private String body;
    private String date;
    private String applicationId;

    public ErrorMessageRequest(String body, String date, String applicationId) {
        this.body = body;
        this.date = date;
        this.applicationId = applicationId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

}
