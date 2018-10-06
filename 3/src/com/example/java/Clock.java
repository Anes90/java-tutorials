package com.example.java;

/**
 * Created by Anes on 09.07.2017..
 */
public class Clock {
   private int hour;
    private int miute;
    private int second;

    public Clock(){
        this (0,0,0);
    }
    public Clock(int h){
        this (h,0,0);
    }
    public Clock(int h, int m){
        this (h,m,0);
    }

    public Clock(int h, int m, int s){
        setTime(h,m,s);
    }

    public void setTime(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int h){
        hour = ((h>=0&&h<24)?h:0);
    }
    public void setMinute(int h){
        minute = ((m>=0&&m<60)?m:0);
    }
    public void setSecond(int h){
        second = ((s>=0&&s<60)?s:0);
    }

    public void getHour(){
        return hour;
    }
    public void getMinute(){
        return minute;
    }
    public void getSecond(){
        return second;
    }

    public String tiMilitary(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
}
