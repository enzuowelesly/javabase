package com.tanzi.scanner;

import java.util.Scanner;

public class ScannerSUM {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入numone:");
        int numone = scanner.nextInt();
        System.out.println("请输入numtwo:");
        int numtwo = scanner.nextInt();
        int sum =numone +numtwo;
        System.out.println("和是："+sum);
    }
}
