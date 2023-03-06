package com.ozigiz.models;

public class Cashier extends Person {

    private String workID;
    private Mall mall;
    private boolean employed;

    private int noDaysAbsent = 0;



    public Cashier(String name, String role) {
        super(name, role);
    }

    public Cashier(String name, String role, String workID, Mall mall) {
        super(name, role);
        this.workID = workID;
        this.mall = mall;
        this.employed = false;
    }

    public String getWorkID() {
        return workID;
    }

    public void setWorkID(String workID) {
        this.workID = workID;
    }

    public Mall getMall() {
        return mall;
    }

    public void setMall(Mall mall) {
        this.mall = mall;
    }

    public boolean isEmployed() {
        return employed; }
    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    public int getNoDaysAbsent() {
        return noDaysAbsent;
    }

    public void setNoDaysAbsent(int noDaysAbsent) {
        this.noDaysAbsent += noDaysAbsent;
    }

    public void checkOut(Customer customer) {
        double totalPrice = 0.0;
//        System.out.println();
        for(Products items : customer.getGoods()) {
            System.out.println("item: " + items.getName() + " volume: " + items.getQuantity());
            totalPrice += items.getPrice() * items.getQuantity();

        }
        if(customer.getFunds() >= totalPrice) {
            customer.payForGoods(totalPrice);
            issueReceipt(customer, totalPrice);
        }else {
            System.out.println("Insufficient Balance.");
        }
        System.out.println("Goods Total: " + totalPrice);


    }

    public void issueReceipt(Customer customer, double totalPrice) {
        System.out.println();
        System.out.println("Receipt");
        System.out.println("Name " + customer.getName());
        System.out.println("Total " + totalPrice);
        //System.out.println("Balance " + );
        System.out.println("sold by " + getName() + " " + workID);
        System.out.println("Thanks for Your Patronage");
        System.out.println("****************");
        System.out.println("Items Purchased");

        customer.getGoods().clear();
    }

    public void remove(Cashier cashier) {
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "workID='" + workID + '\'' +
                ", mall=" + mall +
                ", employed=" + employed +
                ", noDaysAbsent=" + noDaysAbsent +
                "} " + super.toString();
    }
}
