package com.tanzi.random;

import java.util.Random;

public class RandomOneToN {
    public static void main(String[] args) {
        int n =5;
        Random rm =new Random();
        for (int i = 0; i < 10; i++) {
            int num= rm.nextInt(n) +1;
            System.out.println("随机数字是："+num);
        }
    }
}
