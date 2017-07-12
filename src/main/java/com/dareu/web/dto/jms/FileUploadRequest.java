package com.dareu.web.dto.jms;

public class FileUploadRequest {

    private String fileName;
    private String fileType;

    public FileUploadRequest() {
    }

    public FileUploadRequest(String currentFilePath, String fileType) {
        this.fileName = currentFilePath;
        this.fileType = fileType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String currentFilePath) {
        this.fileName = currentFilePath;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public static enum DareuFileType{
        PROFILE("profile_image"), RESPONSE("response_video"), RESPONSE_THUMB("response_thumb_image");

        String type;
        DareuFileType(String type){
            this.type = type;
        }

        @Override
        public String toString() {
            return type;
        }

        public static DareuFileType fromString(String value){
            if(value.equalsIgnoreCase(PROFILE.toString()))
                return PROFILE;
            else if(value.equalsIgnoreCase(RESPONSE.toString()))
                return RESPONSE;
            else if(value.equalsIgnoreCase(RESPONSE_THUMB.toString()))
                return RESPONSE_THUMB;
            return null;
        }
    }

}
