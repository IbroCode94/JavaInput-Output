package com.ozigiz.models;

import java.util.ArrayList;

    public class Customer extends Person {
        private String name;
        private double funds;
        private ArrayList<Products> Goods;
        Mall mall;

        public Customer(String name, double balance, Mall mall) {
            this.name = name;
            this.funds = balance;
            this.Goods = new ArrayList<>();
            this.mall = mall;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getFunds() {
            return funds;
        }


        public ArrayList<Products> getGoods() {
            return Goods;
        }

        public void payForGoods(double amount) {
            this.funds -= amount;
        }

        public void addGoods(Products products, int volume) {
            Products selected = new Products(products.getName(),products.getCategory(),products.getPrice(), volume);
            for (Products p: mall.getProducts()) {
                if(p.getName().equals(selected.getName())){
                    if(p.getQuantity() == 0){
                        System.out.println("OUT OF STOCK");
                    }else if (p.getQuantity() < selected.getQuantity()) {
                        System.out.println("SORRY NOT ENOUGH");
                    }else {
                        Goods.add(selected);
                        System.out.println(name + " Added " + selected.getName() + " to the cart");

                        int remainder = p.getQuantity() - volume;
                        p.setQuantity(remainder);
                    }
                }
            }

        }
//        public void setGoods(ArrayList<Products> goods) {
//            Goods = goods;
//        }
//    }
//    public void setGoods(ArrayList<Products> goods) {
//        Goods = goods;
//    }
//}
    }