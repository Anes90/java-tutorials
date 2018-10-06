package com.example.java;

public class Main {

    public static void main(String[] args) {
	Myclass anes = new Myclass();

       anes.setId(10);
       anes.setName("Anes");
       anes.setAge(28);
       anes.setBio("He's an object.");

        System.out.println(anes.getId() + "\n" + anes.getName() + "\n" + anes.getAge() + "\n" + anes.getBio());
    }
}
