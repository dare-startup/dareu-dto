package com.dareu.web.dto.response.entity;

public class ConnectionRequest {
    private ConnectioRequestType type; 
    private String connectionId; 
    private UserDescription user; 

    public ConnectionRequest() {
    }

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public UserDescription getUser() {
        return user;
    }

    public void setUser(UserDescription user) {
        this.user = user;
    }

    public ConnectioRequestType getType() {
        return type;
    }

    public void setType(ConnectioRequestType type) {
        this.type = type;
    }
    
    
    
    public static enum ConnectioRequestType{
        SENT, RECEIVED
    }
}
