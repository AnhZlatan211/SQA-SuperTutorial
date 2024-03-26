package com.thread.login.dto;

public class UserDto {
    private String fullName;
    private String username;
    private String dob;
    private String address;
    private String avatar;
    private String password;

    public UserDto(String fullName, String username, String dob, String address, String avatar, String password) {
        super();
        this.fullName = fullName;
        this.username = username;
        this.dob = dob;
        this.address = address;
        this.avatar = avatar;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
