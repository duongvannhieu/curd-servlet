package com.models;

public class UserModel {
    private String username;
    private String password;

    public UserModel(){

    }

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /*
    Setter
     */

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*
    Getter
     */

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
