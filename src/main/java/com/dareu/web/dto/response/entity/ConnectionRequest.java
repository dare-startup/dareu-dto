package com.dareu.web.dto.response.entity;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class ConnectionRequest {
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
    
    
}