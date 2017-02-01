package com.dareu.web.dto.response.message;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public abstract class AbstractMessage {
    
    public static final String MESSAGE_TYPE = "messageType";
    private String messageType;
    
    public AbstractMessage(MessageType messageType){
        this.messageType = messageType.toString(); 
    }
}
