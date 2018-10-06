package com.example.java;

/**
 * Created by Anes on 20.06.2017..
 */
public class Student {
  void m(){
      System.out.println("Method is invoked.");
  }
  void n(){
      this.m();
  }
  void p(){
      n();
  }
}
