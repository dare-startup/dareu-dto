package com.dareu.web.dto.response.message;

/**
 *
 * @author Alberto Rubalcaba <arubalcaba@24hourfit.com>
 */
public class UploadedResponseMessage extends AbstractMessage{

    private String dareResponseId; 
    private String message; 
    
    public UploadedResponseMessage() {
        super(MessageType.DARE_RESPONSE_UPLOADED);
    }

    public String getDareResponseId() {
        return dareResponseId;
    }

    public void setDareResponseId(String dareResponseId) {
        this.dareResponseId = dareResponseId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
