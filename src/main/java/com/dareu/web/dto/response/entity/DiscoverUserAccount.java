package com.dareu.web.dto.response.entity;

public class DiscoverUserAccount {
    private String id; 
    private String name; 
    private int coins; 
    private int uscore; 
    private int dares; 
    private int responses; 
    private boolean requestSent; 
    private boolean requestReceived; 
    private String imageUrl;

    public DiscoverUserAccount() {
    }

    public DiscoverUserAccount(String id, String name, int coins, int uscore) {
        this.id = id;
        this.name = name;
        this.coins = coins;
        this.uscore = uscore;
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

    public int getDares() {
        return dares;
    }

    public void setDares(int dares) {
        this.dares = dares;
    }

    public int getResponses() {
        return responses;
    }

    public void setResponses(int responses) {
        this.responses = responses;
    }

    public boolean isRequestSent() {
        return requestSent;
    }

    public void setRequestSent(boolean requestSent) {
        this.requestSent = requestSent;
    }

    public boolean isRequestReceived() {
        return requestReceived;
    }

    public void setRequestReceived(boolean requestReceived) {
        this.requestReceived = requestReceived;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    
}
