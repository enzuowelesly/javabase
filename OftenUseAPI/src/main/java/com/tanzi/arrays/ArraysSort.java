package com.tanzi.arrays;

import java.util.Arrays;

public class ArraysSort {


    public static void main(String[] args) {
        String str="abc";
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }

    }
}
