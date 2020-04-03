package com.tanzi.anonymous;

import java.util.Scanner;

public class AnonymousOne {
    public static void main(String[] args) {
        System.out.println("输入的数字是："+ new Scanner(System.in).nextInt());
        methodParam(new Scanner(System.in));

        int num2=getScanner().nextInt();
        System.out.println("调用生成Scanner对象的方法："+num2);
    }
    public  static void  methodParam(Scanner sc){
        int num =sc.nextInt();
        System.out.println("输入的值是："+num);
    }
    public  static Scanner getScanner(){
        return new Scanner(System.in);
    }
}
