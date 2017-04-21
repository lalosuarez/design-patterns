package com.example.design_patterns.template;

/**
 * Created by esuarezv on 21/04/2017.
 */
public class ExpensiveLoanCalculation extends LoanCalculationProcess {
    @Override
    int getBaseAmount() {
        return 100000;
    }

    @Override
    double getInterest() {
        return 20;
    }

    @Override
    int calculateDiscount() {
        return 1000;
    }
}
