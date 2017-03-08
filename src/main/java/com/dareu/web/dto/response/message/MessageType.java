package com.dareu.web.dto.response.message;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public enum MessageType {
    NEW_DARE("newDareNotificationMessage"),
    CONNECTION_REQUEST("newConnectionRequestMessage"), 
    CONNECT_CONFIRMATION_MESSAGE("connectConfirmationMessage"), 
    DARE_RESPONSE_UPLOADED("dareResponseUploadedMessage"), 
    QUEUED_DARE_MESSAGE("queuedDareMessage");
    
    String value; 
    MessageType(String value){
        this.value = value; 
    }
    
    @Override 
    public String toString(){
        return this.value; 
    }
}
