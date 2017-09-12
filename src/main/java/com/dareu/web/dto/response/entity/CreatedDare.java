package com.dareu.web.dto.response.entity;

public class CreatedDare {
    private String id;
    private String name; 
    private String description; 
    private boolean accepted; 
    private boolean answered; 
    private boolean declined; 
    private UserDescription desc; 
    private String creationDate;
    private String category; 

    public CreatedDare(String id, String name, String description, boolean accepted, boolean answered, boolean declined, UserDescription desc, String creationDate, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.accepted = accepted;
        this.answered = answered;
        this.declined = declined;
        this.desc = desc;
        this.creationDate = creationDate;
        this.category = category;
    }

    public CreatedDare() {
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

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public boolean isAnswered() {
        return answered;
    }

    public void setAnswered(boolean answered) {
        this.answered = answered;
    }

    public boolean isDeclined() {
        return declined;
    }

    public void setDeclined(boolean declined) {
        this.declined = declined;
    }

    public UserDescription getDesc() {
        return desc;
    }

    public void setDesc(UserDescription desc) {
        this.desc = desc;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
    
    
}
