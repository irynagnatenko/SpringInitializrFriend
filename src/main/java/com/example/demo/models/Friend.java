package com.example.demo.models;

/**
 * Created by Iryna Gnatenko
 * Date 2021-04-13
 * Time 7:47 PM
 * Project SpringInitializrFriend
 */
public class Friend {
    int id;
    protected String name;
    protected String address;
    protected String phone;

    public Friend() {}

    public Friend(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
