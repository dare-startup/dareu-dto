package com.dareu.web.dto.response.message;

public enum MessageType {
    NEW_COMMENT("newDareResponseCommentMessage"),
    NEW_DARE("newDareNotificationMessage"),
    CONNECTION_REQUEST("newConnectionRequestMessage"), 
    CONNECT_CONFIRMATION_MESSAGE("connectConfirmationMessage"), 
    DARE_RESPONSE_UPLOADED("dareResponseUploadedMessage"), 
    QUEUED_DARE_MESSAGE("queuedDareMessage"), 
    CLAPPED_RESPONSE_MESSAGE("clappedResponseMessage");
    
    String value; 
    MessageType(String value){
        this.value = value; 
    }
    
    @Override 
    public String toString(){
        return this.value; 
    }
}
