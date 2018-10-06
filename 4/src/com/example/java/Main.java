package com.example.java;
import java.util.EnumSet;

public class Main {

    public static void main(String[] args) {
        Clock member1 = new Clock("Megan", "Fox");
        Clock member2 = new Clock("Natalie", "Portman");
        Clock member3 = new Clock("Taylor", "Swift");

        System.out.println();
        System.out.println(member2.getFirst());
        System.out.println(member2.getLast());
        System.out.println(member2.getMembers());
    }
}
