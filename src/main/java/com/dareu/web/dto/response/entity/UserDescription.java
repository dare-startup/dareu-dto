package com.dareu.web.dto.response.entity;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class UserDescription {
    private String id; 
    private String name; 
    private String imageUrl; 
    private String userSinceDate; 

    public UserDescription() {
    }

    public UserDescription(String id, String name, String imageUrl, String userSinceDate) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUserSinceDate() {
        return userSinceDate;
    }

    public void setUserSinceDate(String userSinceDate) {
        this.userSinceDate = userSinceDate;
    }
    
    
}
