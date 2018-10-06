package com.example.java;

/**
 * Created by Anes on 15.07.2017..
 */
public class Potpie {
    private int month;
    private int day;
    private int year;

    public Potpie(int m, int d, int y){
        month = m;
        day = d;
        year = y;

        System.out.printf("The constructor fot this is %s\n", this);
    }

    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }
}
