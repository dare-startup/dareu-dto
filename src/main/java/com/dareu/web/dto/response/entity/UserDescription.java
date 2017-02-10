package com.dareu.web.dto.response.entity;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class UserDescription {
    private String id; 
    private String name; 
    private String userSinceDate; 
    private boolean profileImageAvailable; 

    public UserDescription() {
    }

    public UserDescription(String id, String name, String userSinceDate) {
        this.id = id;
        this.name = name;
        this.userSinceDate = userSinceDate;
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

    public String getUserSinceDate() {
        return userSinceDate;
    }

    public void setUserSinceDate(String userSinceDate) {
        this.userSinceDate = userSinceDate;
    }

    public boolean isProfileImageAvailable() {
        return profileImageAvailable;
    }

    public void setProfileImageAvailable(boolean profileImageAvailable) {
        this.profileImageAvailable = profileImageAvailable;
    }

   
    
    
}
