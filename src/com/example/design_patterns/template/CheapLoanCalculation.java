package com.example.design_patterns.template;

/**
 * Created by esuarezv on 21/04/2017.
 */
public class CheapLoanCalculation extends LoanCalculationProcess {
    @Override
    int getBaseAmount() {
        return 1000;
    }

    @Override
    double getInterest() {
        return 10;
    }

    @Override
    int calculateDiscount() {
        return 100;
    }
}
