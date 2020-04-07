package com.tanzi.string;

public class StringSplit {
    public static void main(String[] args) {
        String str="tanzi,tanzi,tanzi";
       String[] str1= str.split(",");
        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }
        System.out.println("============");
        String str2="tanzi.tanzi.tanzi";
        String[] str3= str2.split("\\.");
        for (int i = 0; i < str3.length; i++) {
            System.out.println(str3[i]);
        }
    }
}
