package com.example.java;

/**
 * Created by Anes on 04.06.2017..
 */
public class Myclass {
    int id;
    String name;
    int age;
    String bio;

    public Myclass(int id, String name, int age, String bio){
        this.id = id;
        this.name = name;
        this.age = age;
        this.bio = bio;
    }
    public String toString(){
        return "My id: " + id + "\nMy name is " + name + "\nThis is my age: " + age + "\nBio: " + bio;
    }
}
