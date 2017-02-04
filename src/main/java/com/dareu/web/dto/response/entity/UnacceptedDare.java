package com.dareu.web.dto.response.entity;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class UnacceptedDare {
    private String id; 
    private String name; 
    private String description; 
    private String creationDate; 
    private int timer;
    private UserDescription challenger; 

    public UnacceptedDare() {
    }

    public UnacceptedDare(String id, String name, String description, String creationDate, UserDescription challenger) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
        this.challenger = challenger;
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

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public UserDescription getChallenger() {
        return challenger;
    }

    public void setChallenger(UserDescription challenger) {
        this.challenger = challenger;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }
    
    
}
