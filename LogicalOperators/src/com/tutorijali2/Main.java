package com.tutorijali2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your mark: ");
	int marks = scan.nextInt();

	if ((marks >= 80) && (marks <= 100) && (marks == 85)){
        System.out.println("Well done! Keep it up!");
    }
    else if ((marks >= 60) && (marks <= 79)){
        System.out.println("Need some improvement.");
    }else {
        System.out.println("Yout need to get out of the house!");
    }
    }
}
