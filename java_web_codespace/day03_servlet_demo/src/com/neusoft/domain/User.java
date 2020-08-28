package com.neusoft.domain;

public class User {
    private int id;
    private String usename;
    private String password;
    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", usename='" + usename + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                '}';

    }

    public User() {
    }

    public User(int id, String usename, String password, String gender) {
        this.id = id;
        this.usename = usename;
        this.password = password;
        this.gender = gender;
    }
}
