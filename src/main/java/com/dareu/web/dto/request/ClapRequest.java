package com.dareu.web.dto.request;

public class ClapRequest {
    private String responseId; 
    private boolean clapped; 

    public ClapRequest() {
    }

    public ClapRequest(String responseId, boolean clapped) {
        this.responseId = responseId;
        this.clapped = clapped;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public boolean isClapped() {
        return clapped;
    }

    public void setClapped(boolean clapped) {
        this.clapped = clapped;
    }
    
    
}
