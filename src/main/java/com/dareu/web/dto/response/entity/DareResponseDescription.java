package com.dareu.web.dto.response.entity;

public class DareResponseDescription {
    private String id; 
    private DareDescription dare; 
    private String thumbUrl;
    private String videoUrl;
    private int views; 
    private int claps; 
    private int comments;
    private UserDescription user; 
    private String lastUpdate; 
    private String uploadDate;
    private boolean clapped;
    private boolean anchored;

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

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
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

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public boolean isClapped() {
        return clapped;
    }

    public void setClapped(boolean clapped) {
        this.clapped = clapped;
    }

    public boolean isAnchored() {
        return anchored;
    }

    public void setAnchored(boolean anchored) {
        this.anchored = anchored;
    }
}
