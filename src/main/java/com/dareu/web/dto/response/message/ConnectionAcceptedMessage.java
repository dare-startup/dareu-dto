package com.dareu.web.dto.response.message;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class ConnectionAcceptedMessage extends AbstractMessage{
    
    private String friendshipId;

    public ConnectionAcceptedMessage(String friendshipId) {
        super(MessageType.CONNECT_CONFIRMATION_MESSAGE);
        this.friendshipId = friendshipId;
    }

    public ConnectionAcceptedMessage(){
        super(MessageType.CONNECT_CONFIRMATION_MESSAGE); 
    }

    public String getFriendshipId() {
        return friendshipId;
    }

    public void setFriendshipId(String friendshipId) {
        this.friendshipId = friendshipId;
    }
    
    
    
}
