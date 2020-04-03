package com.tanzi.random;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random r =new Random();
        int randomNum =r.nextInt(100)+1;
        Scanner scanner =new Scanner(System.in);
        int max =1;

        while(true){
            System.out.println("请输入你猜的数字：");
            int guessNum =scanner.nextInt();
            if (max >3){
                System.out.println("猜的次数已经用完了");
                break;
            }else  if (guessNum>randomNum){
                System.out.println("猜大了");
                max++;
            }else if (guessNum<randomNum){
                System.out.println("猜小了");
                max++;
            }else if (guessNum==randomNum){
                System.out.println("congratulation， you are right");
                break;
            }
        }
    }
}
