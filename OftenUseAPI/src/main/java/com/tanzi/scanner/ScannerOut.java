package com.tanzi.scanner;


import java.util.Scanner;

public class ScannerOut {

    public static void main(String[] args) {
        System.out.println("请输入数字字符：");
        Scanner scanner =new Scanner(System.in);
        int num =scanner.nextInt();
        int numInt=scanner.nextInt();
            System.out.println("输入字符为："+num);

    }
}
