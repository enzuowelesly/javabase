package com.tanzi.scanner;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ScannerMax {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int num1 =scanner.nextInt();
        System.out.println("请输入第二个数字:");
        int num2 =scanner.nextInt();
        System.out.println("请输入第三个数字:");
        int num3=scanner.nextInt();
        int temp =num1 >num2 ? num1 :num2;
        int max =temp > num3? temp:num3;
        System.out.println("最大值是："+max);
    }

}
