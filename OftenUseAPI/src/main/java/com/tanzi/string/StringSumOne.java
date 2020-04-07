package com.tanzi.string;

public class StringSumOne {
    public static void main(String[] args) {
        String str ="javabasejavajavajava";
        String str1=str.replace("java","");
        System.out.println("出现java的次数是"+(str.length()-str1.length())/4);

    }
}
