package com.example.java;

public class Main {

    public static void main(String[] args) {
	    Tuna tunaObj = new Tuna();
        System.out.println(tunaObj.toMilitary());
        tunaObj.setTime(13, 27, 6);
        System.out.println(tunaObj.toMilitary());
    }
}
