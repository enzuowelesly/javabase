package com.tanzi.calendar;

import java.util.Calendar;
import java.util.Date;

/*
java.util.Calendar



 */
public class MyCalendar {
        public static void main(String[] args) {

            getField();
            setField();
            System.out.println("========");
            addfield();
            getDate();
    }

        public static void getDate(){
            Calendar calendar=Calendar.getInstance();
            Date date=calendar.getTime();
            System.out.println(date);
        }
        public static void addfield(){
            Calendar calendar =Calendar.getInstance();
            calendar.add(Calendar.YEAR,100);
            int year =calendar.get(Calendar.YEAR);
            System.out.println(year);
            calendar.add(Calendar.MONTH,-2);
            int month =calendar.get(Calendar.MONTH)+1;
            System.out.println(month);

        }


        public static void getField(){
            Calendar calendar=Calendar.getInstance();
            System.out.println(calendar);
            int year=calendar.get(Calendar.YEAR);
            System.out.println(year);
            int month =calendar.get(Calendar.MONTH)+1;
            System.out.println(month);
            int dateofmonth= calendar.get(Calendar.DAY_OF_MONTH);
            System.out.println(dateofmonth);
        }
        public static void setField(){
            Calendar calendar=Calendar.getInstance();
            calendar.set(Calendar.YEAR,9999);
            calendar.set(Calendar.MONTH,1);
            System.out.println(calendar);
            calendar.set(1999,11,11);
            int year=calendar.get(Calendar.YEAR);
            System.out.println(year);
            int month =calendar.get(Calendar.MONTH)+1;
            System.out.println(month);
            int dateofmonth= calendar.get(Calendar.DAY_OF_MONTH);
            System.out.println(dateofmonth);
        }
}
