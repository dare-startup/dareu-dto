package com.dareu.web.dto.response.entity;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class ActiveDare {
    private String id; 
    private String name; 
    private String description; 
    private int timer; 
    private String acceptedDate; 
    private UserDescription challenger; 
    
    public ActiveDare() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public String getAcceptedDate() {
        return acceptedDate;
    }

    public void setAcceptedDate(String acceptedDate) {
        this.acceptedDate = acceptedDate;
    }

    public UserDescription getChallenger() {
        return challenger;
    }

    public void setChallenger(UserDescription challenger) {
        this.challenger = challenger;
    }
    
    
}
