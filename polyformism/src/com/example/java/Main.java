package com.example.java;

public class Main {

    public static void main(String[] args) {
       Bank anz = new Anz();
       Bank commbank = new Commbank();
       Bank nab = new Nab();

        System.out.println("Anz interest rate is: " + anz.getInterestRate());
        System.out.println("Commbank interest rate is: " + commbank.getInterestRate());
        System.out.println("Nab interest rate is: " + nab.getInterestRate());
    }
}