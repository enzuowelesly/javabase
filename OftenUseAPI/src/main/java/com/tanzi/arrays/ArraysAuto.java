package com.tanzi.arrays;

import java.util.Arrays;

public class ArraysAuto {
    public static void main(String[] args) {
        int[] intarray={1,2,3,6,9,4,5};
        Arrays.sort(intarray);
        System.out.println(Arrays.toString(intarray));

        System.out.println(intarray);
        String intstr = Arrays.toString(intarray);
        System.out.println(intstr);
    }
}
