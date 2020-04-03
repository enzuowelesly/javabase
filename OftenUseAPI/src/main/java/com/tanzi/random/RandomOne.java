package com.tanzi.random;

import java.util.Random;

public class RandomOne {
    public static void main(String[] args) {
        Random rm =new Random();
        int  num= rm.nextInt();
        System.out.println("随机Int数是："+num);
    }
}
