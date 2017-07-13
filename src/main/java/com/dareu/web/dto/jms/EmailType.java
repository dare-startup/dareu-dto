package com.dareu.web.dto.jms;

public enum EmailType{
    ERROR("error_email"),
    USER_REGISTRATION("user_registration_email"),;

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
        else if(value.equals(USER_REGISTRATION.type))
            return USER_REGISTRATION;
        else return null;
    }
}