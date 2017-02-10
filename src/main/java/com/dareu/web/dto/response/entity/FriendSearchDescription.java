package com.dareu.web.dto.response.entity;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class FriendSearchDescription {
    private String id; 
    private String name; 
    private boolean profileImageAvailable; 

    public FriendSearchDescription() {
    }

    public FriendSearchDescription(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isProfileImageAvailable() {
        return profileImageAvailable;
    }

    public void setProfileImageAvailable(boolean profileImageAvailable) {
        this.profileImageAvailable = profileImageAvailable;
    }
}
