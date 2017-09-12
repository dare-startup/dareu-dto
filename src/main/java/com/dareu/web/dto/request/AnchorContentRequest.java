package com.dareu.web.dto.request;


public class AnchorContentRequest {
    private String responseId;
    private boolean anchored;

    public AnchorContentRequest() {
    }

    public AnchorContentRequest(String responseId, boolean anchored) {
        this.responseId = responseId;
        this.anchored = anchored;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public boolean isAnchored() {
        return anchored;
    }

    public void setAnchored(boolean anchored) {
        this.anchored = anchored;
    }
    
    
}
