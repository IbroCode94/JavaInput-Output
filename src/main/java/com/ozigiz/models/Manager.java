package com.ozigiz.models;

public class Manager extends Person {

    private Mall mall;
    Cashier cashier;


    public Manager(String name, String role, Mall mall) {
        super(name, role);
        this.mall = mall;

    }

    public Mall getMall() {
        return mall;
    }

    public void setMall(Mall mall) {
        this.mall = mall;
    }


    public void setDaysAbsent(Cashier cashier, int daysAbsent){
        cashier.setNoDaysAbsent(daysAbsent);
    }

}