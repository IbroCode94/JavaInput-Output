package com.ozigiz.models;

public class Person {
    private String name;
    private String role;


    public Person(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}