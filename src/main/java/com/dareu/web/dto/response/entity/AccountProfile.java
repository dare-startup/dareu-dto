package com.dareu.web.dto.response.entity;

import java.util.List;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class AccountProfile {
    private String id; 
    private String name; 
    private String userSinceDate; 
    private boolean profileImageAvailable; 
    private int uscore; 
    private int coins; 
    private Page<CreatedDare> createdDares; 
    private Page<DareResponseDescription> createdResponses; 

    public AccountProfile() {
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

    public int getUscore() {
        return uscore;
    }

    public void setUscore(int uscore) {
        this.uscore = uscore;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public Page<CreatedDare> getCreatedDares() {
        return createdDares;
    }

    public void setCreatedDares(Page<CreatedDare> createdDares) {
        this.createdDares = createdDares;
    }

    public Page<DareResponseDescription> getCreatedResponses() {
        return createdResponses;
    }

    public void setCreatedResponses(Page<DareResponseDescription> createdResponses) {
        this.createdResponses = createdResponses;
    }
    
    
    
}