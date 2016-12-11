package com.dareu.web.dto.security.impl;

import com.dareu.web.dto.security.PasswordEncryptor;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author jose.rubalcaba
 */
public class PasswordEncryptorImpl implements PasswordEncryptor{

    public PasswordEncryptorImpl(){
        
    }
    
    @Override
    public String encryptPassword(String plainTextPassword) {
        String generatedPassword = null; 
        try{
            MessageDigest digest = MessageDigest.getInstance("MD5"); 
            digest.update(plainTextPassword.getBytes());
            
            byte[] bytes = digest.digest(); 
            StringBuilder sb = new StringBuilder(); 
            for (int i = 0; i < bytes.length; i++) 
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1)); 
            generatedPassword = sb.toString(); 
            return generatedPassword;
        }catch(NoSuchAlgorithmException ex){
            return null; 
        }
    }
    
}
