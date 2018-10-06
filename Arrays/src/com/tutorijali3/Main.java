package com.tutorijali3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] prices = new double[5];

        System.out.println("Unesite 5 cijena: ");
        for(int i = 0; i < 5; i++){
            prices[i] = in.nextDouble();
        }
//        System.out.println("Cijene su: ");
//        for(int i = 0; i < 5; i++){
//            System.out.println(prices[i]);
//        }
        double total = prices[0] + prices[1] + prices[2] + prices[3] + prices[4];
        System.out.printf("Ukupna cijena svih 5 artikala iznosi $%5.2f ", total);
    }
}
