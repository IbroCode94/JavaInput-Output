package com.ozigiz;

import com.ozigiz.models.Customer;
import com.ozigiz.models.Mall;
import com.ozigiz.models.Products;
import com.ozigiz.models.mySheetReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Products products;
    Customer customer1;
    Customer customer2;
    Mall mall1;
    mySheetReader sheetReader;

    @BeforeEach
    void setUp() {
        mall1 = new Mall("Target");
        sheetReader = new mySheetReader(mall1);
        sheetReader.productList("src/main/resources/resources/Utilities/Book.xlsx");
        customer1 = new Customer("mary",12.0,mall1);
         customer2 = new Customer("mary",12.0,mall1);
    }
    @Test
     void cartGoods() {
        customer1.addGoods(mall1.getProducts().get(2), 50);
        customer1.addGoods(mall1.getProducts().get(1), 10);
        assertEquals(2,customer1.getGoods().size());



    }


}
