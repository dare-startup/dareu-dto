package com.dareu.web.dto.response.entity;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class CommentDescription {
    private String id;
    private String comment; 
    private String commentDate; 
    private int likes;
    private UserDescription user;
    private DareResponseDescription response; 

    public CommentDescription() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public DareResponseDescription getResponse() {
        return response;
    }

    public void setResponse(DareResponseDescription response) {
        this.response = response;
    }

    public UserDescription getUser() {
        return user;
    }

    public void setUser(UserDescription user) {
        this.user = user;
    }
    
    
}
