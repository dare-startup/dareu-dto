package com.dareu.web.dto.response.entity;

/**
 *
 * @author jose.rubalcaba
 */
public class DareDescription {
    private String id; 
    private String name; 
    private String description; 
    private String category; 
    private String estimatedDareTime; 
    private String creationDate; 
    private UserDescription challenger; 

    public DareDescription() {
    }

    public DareDescription(String id, String name, String description, String category, String estimatedDareTime, String creationDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.estimatedDareTime = estimatedDareTime;
        this.creationDate = creationDate;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEstimatedDareTime() {
        return estimatedDareTime;
    }

    public void setEstimatedDareTime(String estimatedDareTime) {
        this.estimatedDareTime = estimatedDareTime;
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
}
