package com.ozigiz;

import com.ozigiz.Interface.implementation.managerServiceImpl;
import com.ozigiz.models.Applicant;
import com.ozigiz.models.Cashier;
import com.ozigiz.models.Mall;
import com.ozigiz.models.Manager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {


        managerServiceImpl implementManager;
        Manager manager;
        Applicant applicant1;
        Cashier cashier1;
        Mall mall1;
        @BeforeEach
        void setUp() {
            implementManager = new managerServiceImpl();
            manager  = new Manager("John","Manager", mall1);
            cashier1 = new Cashier("Mary","Cashier1","09321", mall1);
            applicant1 = new Applicant("Nazifi","Applicant",true, 19);

        }

        @org.junit.jupiter.api.Test
        @DisplayName("Manager can hire applicants if their age is between 18 and 30")
        void hireApplicant() {
            Applicant applicant = new Applicant("Nazifi","Applicant",true, 19);
            String expected = "Applicant " + applicant.getName() + " is now hired as a cashier";
            assertEquals(expected, implementManager.hireCashier(applicant1));
        }

        @org.junit.jupiter.api.Test
        void fireCashier() {
            Mall mall1 = new Mall("Target");
            cashier1 = new Cashier("Mary","Cashier1","09321", mall1);
            mall1.setCashiersList(cashier1);
            manager.setDaysAbsent(cashier1, 4);

            assertTrue(implementManager.fireCashier(mall1, cashier1));
        }
    }

