package com.example.design_patterns.template;

/**
 * Created by esuarezv on 21/04/2017.
 */
public abstract class LoanCalculationProcess {
    abstract int getBaseAmount();
    abstract double getInterest();
    abstract int calculateDiscount();
    public int calculateLoan() {
        return (int)(getBaseAmount() * getInterest() - calculateDiscount());
    }
}
