package com.tutorijali;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x, y;
        System.out.println("Enter your first value ");
        x=scan.nextInt();
        System.out.println("Enter second value ");
        y = scan.nextInt();

        System.out.println("Enter the operator ");
        String operation = scan.next();

        if (operation.equals("+")){
            System.out.println("This is the addition result: " + (x + y));
        }
        else if (operation.equals("-")){
            System.out.println("This is the subtraction result: " + (x - y));
        }
        else if (operation.equals("*")){
            System.out.println("This is the multiplication result: " + (x * y));
        }
        else if (operation.equals("/")) {
            System.out.println("This is the division result: " + (x / y));
        }
        else {
            System.out.println("Enter the correct operator");
        }
    }
}
