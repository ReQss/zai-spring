package com.triptip.triptip.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Users")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String login;
    private String password;

    public User(){

    }
    public User(String login, String password){
        this.login = login;
        this.password = password;
    }
    public User(int id, String login, String password, String pictureUrl) {
        this.id = id;
        this.login = login;
        this.password = password;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
