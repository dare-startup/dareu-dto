package com.dareu.web.dto.response.entity;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class ConnectionDetails {
    private String requestedUserId;
    private String requestedUserName; 
    private String requestedUserImageUrl; 
    
    private String userId;
    private String userName; 
    private String userImageUrl; 
    
    private String creationDate; 
    private boolean accepted; 

    public ConnectionDetails() {
    }

    public String getRequestedUserId() {
        return requestedUserId;
    }

    public void setRequestedUserId(String requestedUserId) {
        this.requestedUserId = requestedUserId;
    }

    public String getRequestedUserName() {
        return requestedUserName;
    }

    public void setRequestedUserName(String requestedUserName) {
        this.requestedUserName = requestedUserName;
    }

    public String getRequestedUserImageUrl() {
        return requestedUserImageUrl;
    }

    public void setRequestedUserImageUrl(String requestedUserImageUrl) {
        this.requestedUserImageUrl = requestedUserImageUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImageUrl() {
        return userImageUrl;
    }

    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
    
    
    
}
