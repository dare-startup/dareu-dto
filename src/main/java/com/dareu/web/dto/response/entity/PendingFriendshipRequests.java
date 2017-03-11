package com.dareu.web.dto.response.entity;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class PendingFriendshipRequests {
    
    private Page<ConnectionRequest> sentRequests; 
    private Page<ConnectionRequest> receivedRequests; 
    
    public PendingFriendshipRequests(){
        
    }

    public Page<ConnectionRequest> getSentRequests() {
        return sentRequests;
    }

    public void setSentRequests(Page<ConnectionRequest> sentRequests) {
        this.sentRequests = sentRequests;
    }

    public Page<ConnectionRequest> getReceivedRequests() {
        return receivedRequests;
    }

    public void setReceivedRequests(Page<ConnectionRequest> receivedRequests) {
        this.receivedRequests = receivedRequests;
    }
    
    
}
