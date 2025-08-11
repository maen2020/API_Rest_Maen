package com.maen.api_rest.encrypted.services;

public class ResponseService {

    private String encryptedText;

    public ResponseService(String encryptedText) {
        this.encryptedText = encryptedText;
    }

    public String getEncryptedText() {
        return encryptedText;
    }

    public void setEncryptedText(String encryptedText) {
        this.encryptedText = encryptedText;
    }
}