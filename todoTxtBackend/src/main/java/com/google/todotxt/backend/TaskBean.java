package com.google.todotxt.backend;

/** The object model for the data we are sending through endpoints */
public class TaskBean {

    private String myData;
    Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}