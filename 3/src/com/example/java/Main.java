package com.example.java;

public class Main {

    public static void main(String[] args) {
	    Clock clockObj = new Clock();
        System.out.println(clockObj.toMilitary());
        System.out.println(clockObj.toString());

        clockObj.setTime(13, 27, 6);

        System.out.println(clockObj.toMilitary());
        System.out.println(clockObj.toString());
    }
}
