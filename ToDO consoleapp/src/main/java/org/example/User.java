package org.example;

import java.util.ArrayList;

public class User {
    private String userName;
    private String password;
    private ArrayList<ToDo> list;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.list = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "list=" + list +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
