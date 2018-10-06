package com.example.java;



public class Main {
    private static int index = 0;
    private static int stoppingPoint = 40;
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        System.out.println("n1 - " + n1);
        fibonacciSequence(n1, n2);
    }

    public static void fibonacciSequence(int n1, int n2){
        System.out.println("n2 - " + n2);
    }
}
