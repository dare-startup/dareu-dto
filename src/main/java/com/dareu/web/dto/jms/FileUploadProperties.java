package com.dareu.web.dto.jms;

public class FileUploadProperties {
    private String currentFilePath;
    private DareuFileType fileType;

    public String getCurrentFilePath() {
        return currentFilePath;
    }

    public void setCurrentFilePath(String currentFilePath) {
        this.currentFilePath = currentFilePath;
    }

    public DareuFileType getFileType() {
        return fileType;
    }

    public void setFileType(DareuFileType fileType) {
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
