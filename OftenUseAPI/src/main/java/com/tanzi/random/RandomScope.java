package com.tanzi.random;

import java.util.Random;

public class RandomScope {
    public static void main(String[] args) {
        Random rm = new Random();
        for (int i=0;i<10;i++){
            int num = rm.nextInt(10);
            System.out.println("随机数字："+num);


        }
        System.out.println();
    }
}
