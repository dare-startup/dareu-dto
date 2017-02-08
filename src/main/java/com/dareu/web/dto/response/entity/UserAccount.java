package com.dareu.web.dto.response.entity;

/**
 *
 * @author jose.rubalcaba
 */
public class UserAccount {
    private String id; 
    private String name; 
    private String email; 
    private String token; 
    private boolean verified; 
    private String password; 
    private String role; 
    private int uscore; 
    private int coins; 
    private String userSinceDate; 

    public UserAccount() {
    }

    public UserAccount(String id, String name, String email, String token, boolean verified, String password, String role, int uscore, int coins, String userSinceDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.token = token;
        this.verified = verified;
        this.password = password;
        this.role = role;
        this.uscore = uscore;
        this.coins = coins;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public String getUserSinceDate() {
        return userSinceDate;
    }

    public void setUserSinceDate(String userSinceDate) {
        this.userSinceDate = userSinceDate;
    }
    
    
}
