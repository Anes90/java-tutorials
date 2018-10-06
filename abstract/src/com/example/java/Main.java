package com.example.java;

public class Main {

    public static void main(String[] args) {
        getPrintInfo obj = new getPrintInfo();
        obj.getInfo1();
    }
}

abstract class printInfo{
    abstract void getInfo1();
}

class getPrintInfo extends printInfo{
void getInfo1(){
    System.out.println("hello");
}
}
