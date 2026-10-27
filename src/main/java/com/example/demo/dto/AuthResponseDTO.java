package com.example.demo.dto;

public class AuthResponseDTO {
    private final String accessToken;
    private final String tokenType = "Bearer";

    public AuthResponseDTO(String accessToken) {
        this.accessToken = accessToken;
    }
    public String getAccessToken() { return accessToken; }
    public String getTokenType() { return tokenType; }
}