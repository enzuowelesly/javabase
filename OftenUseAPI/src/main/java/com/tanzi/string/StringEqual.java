package com.tanzi.string;

public class StringEqual {
    public static void main(String[] args) {
        String str1="JAva";
        String str2="java";
        String str3=null;
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.charAt(1));
        System.out.println(str1.getClass());
        System.out.println(str1.getBytes());
        System.out.println(str1.equals("JAVA"));
        System.out.println("==================");
        System.out.println(str1.equals(str3));
        System.out.println(str3.equals(str1));


    }
}
