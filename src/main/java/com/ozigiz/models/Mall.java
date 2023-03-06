package com.ozigiz.models;

import java.util.ArrayList;
import java.util.List;

public class Mall {
    private String name;
    private List<Products> products;
    private List<Cashier> cashiersList;


    public Mall(String name) {
        this.name = name;
        this.products = new ArrayList<>();
        this.cashiersList = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public List<Cashier> getCashiersList() {
        return cashiersList;
    }

    public void setCashiersList(Cashier cashier) {
        this.cashiersList.add(cashier);
    }

}