package com.example.java;

/**
 * Created by Anes on 07.07.2017..
 */
public class Tuna {
        private String girlName;

        public Tuna(String name){
            girlName = name;
        }

        public void setGirlName(String name){
            girlName = name;
        }
    public String getGirlName(){
            return girlName;
    }
    public void saying(){
        System.out.printf("Your first gf was %s", getGirlName());
    }
}
