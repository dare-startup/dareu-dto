package com.dareu.web.dto.response.message;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public enum MessageType {
    NEW_DARE("newDareNotificationMessage");
    
    String value; 
    MessageType(String value){
        this.value = value; 
    }
    
    @Override 
    public String toString(){
        return this.value; 
    }
}
