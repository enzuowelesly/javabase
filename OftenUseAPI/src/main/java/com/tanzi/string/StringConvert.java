package com.tanzi.string;

public class StringConvert {
    public static void main(String[] args) {
        String str ="javabasejavajavajava";
        System.out.println(str);
        System.out.println(str.toCharArray());
        for (int i = 0; i < str.toCharArray().length; i++) {
            System.out.print(str.toCharArray()[i]);
        }
        System.out.println(str.getBytes());
        for (int i = 0; i < str.getBytes().length; i++) {
            System.out.print(str.getBytes()[i]);
        }
        System.out.println(str.contains("java"));

    }
}
