package com.models;

import com.dao.WelcomeDao;

import java.util.ArrayList;

public class ShowUserModel {
    private String name;
    private String phone;
    private String address;
    private String sex;
    private String birthday;
    private String email;
    private String password;

    public ShowUserModel(){}

    public ShowUserModel(String name, String phone, String address, String sex, String birthday, String email, String password) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.sex = sex;
        this.birthday = birthday;
        this.email = email;
        this.password = password;
    }

    /*
    Setter
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*
    Getter
     */

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getSex() {
        return sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
