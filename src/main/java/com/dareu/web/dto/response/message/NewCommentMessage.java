package com.dareu.web.dto.response.message;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class NewCommentMessage extends AbstractMessage{
    private String commentId; 
    private String responseId; 
    private String comment; 

    public NewCommentMessage() {
        super(MessageType.NEW_COMMENT);
    }

    public NewCommentMessage(String commentId, String responseId, String comment) {
        super(MessageType.NEW_COMMENT);
        this.commentId = commentId;
        this.responseId = responseId;
        this.comment = comment;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getResponseId() {
        return responseId;
    }

    public void setResponseId(String responseId) {
        this.responseId = responseId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
}
