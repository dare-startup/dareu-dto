package com.dareu.web.dto.response.message;


public class QueuedDareMessage extends AbstractMessage {
    
    public static final String ACTIVE = "active";
    public static final String PENDING = "pending"; 
    
    private String dareId; 
    private String creationDate; 
    private String currentDareStatus;

    public QueuedDareMessage(MessageType messageType, String dareId, String creationDate, String currentDareStatus) {
        super(messageType);
        this.dareId = dareId;
        this.creationDate = creationDate;
        this.currentDareStatus = currentDareStatus;
    }

    public QueuedDareMessage() {
        super(MessageType.QUEUED_DARE_MESSAGE);
    }

    public String getDareId() {
        return dareId;
    }

    public void setDareId(String dareId) {
        this.dareId = dareId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCurrentDareStatus() {
        return currentDareStatus;
    }

    public void setCurrentDareStatus(String currentDareStatus) {
        this.currentDareStatus = currentDareStatus;
    }
    
}
