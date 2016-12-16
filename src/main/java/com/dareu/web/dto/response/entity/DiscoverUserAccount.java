package com.dareu.web.dto.response.entity;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class DiscoverUserAccount {
    private String id; 
    private String name; 
    private int coins; 
    private int uscore; 
    private String imageUrl;
    private String userSinceDate; 

    public DiscoverUserAccount() {
    }

    public DiscoverUserAccount(String id, String name, int coins, int uscore, String imageUrl, String userSinceDate) {
        this.id = id;
        this.name = name;
        this.coins = coins;
        this.uscore = uscore;
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

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getUscore() {
        return uscore;
    }

    public void setUscore(int uscore) {
        this.uscore = uscore;
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
