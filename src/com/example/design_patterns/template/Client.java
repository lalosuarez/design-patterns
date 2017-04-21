package com.example.design_patterns.template;

/**
 * Created by esuarezv on 21/04/2017.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(calculateLoan(new CheapLoanCalculation()));
        System.out.println(calculateLoan(new ExpensiveLoanCalculation()));
    }

    private static int calculateLoan(LoanCalculationProcess lcp) {
        return lcp.calculateLoan();
    }
}
