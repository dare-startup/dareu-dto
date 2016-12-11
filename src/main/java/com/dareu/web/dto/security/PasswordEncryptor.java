package com.dareu.web.dto.security;

/**
 *
 * @author jose.rubalcaba
 */
public interface PasswordEncryptor {
    public String encryptPassword(String plainTextPassword); 
}
