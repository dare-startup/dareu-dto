package com.dareu.web.dto.security;

public enum SecurityRole {
	ADMIN("ADMIN"), USER("USER"), SPONSOR("SPONSOR"), ALL("ALL");
        
        String value; 
        SecurityRole(String value){
            this.value = value; 
        }
        
        public static SecurityRole fromString(String string){
            if(string.equals(SPONSOR.value))
                return SPONSOR; 
            else if(string.equals(ADMIN.value))
                return ADMIN; 
            else if(string.equals(USER.value))
                return USER; 
            else return null; 
        }
        
        public String getValue(){
            return this.value; 
        }
        
        @Override 
        public String toString(){
            return this.value; 
        }
}
