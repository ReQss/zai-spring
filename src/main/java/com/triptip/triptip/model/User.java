package com.triptip.triptip.model;

import jakarta.persistence.*;
import org.hibernate.mapping.Join;

@Entity
@Table (name = "Users")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String login;
    private String password;
    private String fname;
    private String lname;
    private String email;
    private int roleId; //join
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
    private Integer phone=0;
    public User(){

    }
    public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public User(int id, String login, String password, String fname, String lname, String email, int roleId, Address address, Integer phone) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.roleId = roleId;
        this.address = address;
        this.phone = phone;
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

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email='" + email + '\'' +
                ", roleId=" + roleId +
                ", address=" + address +
                ", phone=" + phone +
                '}';
    }
}
