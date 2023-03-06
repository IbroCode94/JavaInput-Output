package com.ozigiz.Interface;

import com.ozigiz.models.Applicant;
import com.ozigiz.models.Cashier;
import com.ozigiz.models.Mall;

public interface managerService {
    String hireCashier(Applicant applicant);

    boolean fireCashier(Mall mall, Cashier cashier1);
}
