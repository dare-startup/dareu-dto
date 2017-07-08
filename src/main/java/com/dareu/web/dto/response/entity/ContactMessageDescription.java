package com.dareu.web.dto.response.entity;

public class ContactMessageDescription {
    private String id;
    private String name;
    private String email;
    private String comment;
    private String status;
    private String date;

    public ContactMessageDescription(String id, String name, String email, String comment, String status, String date) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.comment = comment;
        this.status = status;
        this.date = date;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
