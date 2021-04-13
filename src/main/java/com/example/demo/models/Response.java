package com.example.demo.models;

/**
 * Created by Iryna Gnatenko
 * Date 2021-04-13
 * Time 8:16 PM
 * Project SpringInitializrFriend
 */
public class Response {
    private String message;
    private Boolean status;

    public Response() {
    }

    public Response(String message, Boolean status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
