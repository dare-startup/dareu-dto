package com.dareu.web.dto.response.message;

public class UploadedResponseMessage extends AbstractMessage{

    private String dareResponseId; 
    private String message;

    public UploadedResponseMessage(MessageType messageType, String dareResponseId, String message) {
        super(messageType);
        this.dareResponseId = dareResponseId;
        this.message = message;
    }

    public UploadedResponseMessage() {
        super(MessageType.DARE_RESPONSE_UPLOADED);
    }

    public String getDareResponseId() {
        return dareResponseId;
    }

    public void setDareResponseId(String dareResponseId) {
        this.dareResponseId = dareResponseId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
