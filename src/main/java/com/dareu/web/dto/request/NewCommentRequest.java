package com.dareu.web.dto.request;

public class NewCommentRequest {
    private String responseId; 
    private String comment;

    public NewCommentRequest() {
    }

    public NewCommentRequest(String responseId, String comment) {
        this.responseId = responseId;
        this.comment = comment;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
}
