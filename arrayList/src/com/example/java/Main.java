package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Australia");
        list.add("Victoria");
        list.add("Melbourne");

        System.out.println(list);

        list.add("Sydney");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        String city = list.get(1);
        System.out.println("The second city is " + city);

        int pos = list.indexOf("Sydney");
        System.out.println("Sydney is at position " + pos);
    }
}
