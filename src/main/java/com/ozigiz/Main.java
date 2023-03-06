package com.ozigiz;

import com.ozigiz.Interface.implementation.managerServiceImpl;
import com.ozigiz.models.*;

public class Main {
    public static void main(String[] args) {
        Mall mall1 = new Mall("Ozigis");
        mySheetReader myfile = new mySheetReader(mall1);
        String filePath = "src/main/resources/resources/Utilities/Book.xlsx";
        myfile.productList(filePath);

        Manager manager = new Manager("John","Manager",mall1);

        Cashier cashier1 = new Cashier("Mary","Cashier1","09321", mall1);

        Cashier cashier2 = new Cashier("Sanusi", "Cashier2","097B", mall1);

        mall1.setCashiersList(cashier1);
        mall1.setCashiersList(cashier2);

        Customer customer1 = new Customer("Bright",30, mall1);
        Customer customer2 = new Customer("Malik",20, mall1);
        Customer customer3 = new Customer("Emmy",10000, mall1);

        customer1.addGoods(mall1.getProducts().get(0),1);
        customer2.addGoods(mall1.getProducts().get(1),1);
        customer3.addGoods(mall1.getProducts().get(3), 4);
        cashier1.checkOut(customer1);
        cashier2.checkOut(customer2);
        cashier2.checkOut(customer3);

        managerServiceImpl managerService = new managerServiceImpl();
        manager.setDaysAbsent(cashier1, 4);
        managerService.fireCashier(mall1, cashier2);
        managerService.fireCashier(mall1, cashier1);
        System.out.println(mall1.getProducts().get(2).getQuantity());
       


//        ManagerServiceImpl managerService = new ManagerServiceImpl();
//        System.out.println(managerService.hireCashier(applicant1));
//        System.out.println(managerService.fireCashier(mall1, cashier2));
//


    }

}
