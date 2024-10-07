package org.example.models;

public class User {
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    private int id;
    private String name;
    private String job;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString(){
        return "User{id=" + id + ", name='" + name + "', job='" + job + "'}";
    }

}
