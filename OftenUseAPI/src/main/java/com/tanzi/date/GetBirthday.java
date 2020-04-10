package com.tanzi.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class GetBirthday {
    public static void main(String[] args) throws ParseException {
        getDate();
    }
    public static void getDate() throws ParseException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入出生日期，格式为 yyyy-MM-dd");
       String birthday= scanner.next();
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(birthday);
        System.out.println(date);
        Date today =new Date();
        Long todayLong = today.getTime();
        Long birthdayLong = date.getTime();
        Long muil =todayLong-birthdayLong;
        if (muil<0){
            System.out.println("你还没出生");
        }else{
            System.out.println(muil/1000/60/60/24);
        }
    }
}
