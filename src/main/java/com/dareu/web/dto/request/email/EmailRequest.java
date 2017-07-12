package com.dareu.web.dto.request.email;

import java.util.List;

public final class EmailRequest {
    private String title;
    private String from;
    private List<String> recipients;
    private String applicationId;
    private String date;
    private Object body;
    private EmailType emailType;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public EmailType getEmailType() {
        return emailType;
    }

    public void setEmailType(EmailType emailType) {
        this.emailType = emailType;
    }

    public static enum EmailType{
        ERROR("error_email"), ANOTHER_USER_ACTION("user_email");

        String type;
        EmailType(String type){
            this.type = type;
        }

        @Override
        public String toString(){
            return type;
        }

        public static EmailType fromString(String value){
            if(value.equals(ERROR.type))
                return ERROR;
            else if(value.equals(ANOTHER_USER_ACTION.type))
                return ERROR;
            else return null;
        }
    }
}
