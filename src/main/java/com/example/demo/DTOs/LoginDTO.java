package com.example.demo.DTOs;

public class LoginDTO {

    private boolean isUserExistent;
    private String error;

    public boolean isUserExistent() {
        return isUserExistent;
    }

    public void setUserExistent(boolean userExistent) {
        isUserExistent = userExistent;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
