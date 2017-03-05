package com.dareu.web.dto.response.entity;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class DareResponseDescription {
    private String id; 
    private DareDescription dare; 
    private boolean thumbAvailable; 
    private int views; 
    private int claps; 
    private UserDescription user; 
    private String lastUpdate; 
    private String uploadDate; 

    public DareResponseDescription() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DareDescription getDare() {
        return dare;
    }

    public void setDare(DareDescription dare) {
        this.dare = dare;
    }

    public boolean isThumbAvailable() {
        return thumbAvailable;
    }

    public void setThumbAvailable(boolean thumbAvailable) {
        this.thumbAvailable = thumbAvailable;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getClaps() {
        return claps;
    }

    public void setClaps(int claps) {
        this.claps = claps;
    }

    public UserDescription getUser() {
        return user;
    }

    public void setUser(UserDescription user) {
        this.user = user;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }
    
    
}
