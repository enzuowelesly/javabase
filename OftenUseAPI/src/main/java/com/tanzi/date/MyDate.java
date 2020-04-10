package com.tanzi.date;
/*
* Date 类的使用
* 原点 1970.1.1 00：00:00
* CST 东八区 ＋8小时
*
*
*
* */
import java.util.Date;

public class MyDate {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println("======");
//        getDate();
        getDateS();

    }
    public static void getDate(){
        Date date =new Date();
        System.out.println("------");
        System.out.println(date);
    }
    public static void getDateS(){
        Date date =new Date();
        System.out.println(date.getTime());
        Long lang11 = System.currentTimeMillis()-date.getTime();
        Date date1=new Date(lang11);
        System.out.println(date1);


        Date date11=new Date(0L);
        System.out.println(date11);
    }
}
