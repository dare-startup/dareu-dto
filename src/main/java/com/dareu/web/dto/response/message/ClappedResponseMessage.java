package com.dareu.web.dto.response.message;


public class ClappedResponseMessage extends AbstractMessage {

    private String responseId;

    public ClappedResponseMessage(String responseId) {
        super(MessageType.CLAPPED_RESPONSE_MESSAGE);
        this.responseId = responseId;
    }

    public ClappedResponseMessage() {
        super(MessageType.CLAPPED_RESPONSE_MESSAGE);
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }
    
    
}
