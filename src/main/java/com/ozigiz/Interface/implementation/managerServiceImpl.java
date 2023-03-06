package com.ozigiz.Interface.implementation;

import com.ozigiz.Interface.managerService;
import com.ozigiz.models.Applicant;
import com.ozigiz.models.Cashier;
import com.ozigiz.models.Mall;

public class managerServiceImpl implements managerService {



    @Override
    public String hireCashier(Applicant applicant) {
        if (applicant.getAge() >= 18 && applicant.getAge() < 30) {
            applicant.setHired(true);
            return "Applicant " + applicant.getName() + " is now hired as a cashier";
        } else {
            return "Sorry Role not Available for the age limit";
        }
    }

    public void ManagerServiceImpl() {

    }

    @Override
    public boolean fireCashier(Mall mall, Cashier cashier) {

      for (int i = 0; i < mall.getCashiersList().size(); i++) {
          if (mall.getCashiersList().get(i).getWorkID() == cashier.getWorkID()) {
              if(cashier.getNoDaysAbsent() > 2) {
                  mall.getCashiersList().remove(cashier);
                  System.out.println(cashier.getName() + "has been fired ");
                  return true;
              }else {
                  System.out.println(cashier.getName() + " is doing well");

              }
              break;
          }
      }
      return false;
    }
}
