package com.dareu.web.dto.response.message;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class ConnectionRequestMessage extends AbstractMessage{

    private String requestUserId;
    private String friendshipId; 
    private String userName; 
    
    public ConnectionRequestMessage() {
        super(MessageType.CONNECTION_REQUEST);
    }

    public ConnectionRequestMessage(String requestUserId, String friendshipId, String userName) {
        super(MessageType.CONNECTION_REQUEST);
        this.requestUserId = requestUserId;
        this.friendshipId = friendshipId;
        this.userName = userName;
    }

    public String getRequestUserId() {
        return requestUserId;
    }

    public void setRequestUserId(String requestUserId) {
        this.requestUserId = requestUserId;
    }

    public String getFriendshipId() {
        return friendshipId;
    }

    public void setFriendshipId(String friendshipId) {
        this.friendshipId = friendshipId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    
}
