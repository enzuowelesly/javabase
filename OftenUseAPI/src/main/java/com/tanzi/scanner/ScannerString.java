package com.tanzi.scanner;

import java.util.Scanner;

public class ScannerString {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请键盘输入字符串");
        String str =scanner.next();
        System.out.println("输入的字符串是："+str);
    }
}
