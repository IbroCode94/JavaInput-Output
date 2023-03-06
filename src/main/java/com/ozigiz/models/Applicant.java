package com.ozigiz.models;

public class Applicant extends Person {
    private boolean isHired = false;
    private int age;

    public Applicant(String name, String role) {
        super(name, role);
    }

    public Applicant(String name, String role, boolean isHired, int age) {
        super(name, role);
        this.isHired = isHired;
        this.age = age;

    }

    public Applicant() {
        super();
    }

    public boolean isHired() {
        return isHired;
    }

    public void setHired(boolean hired) {
        isHired = hired;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "isHired=" + isHired +
                ", age=" + age +
                "} " + super.toString();
    }
}