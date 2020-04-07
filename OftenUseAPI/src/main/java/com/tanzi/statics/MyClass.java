package com.tanzi.statics;

public class MyClass {
    int num=12;
    static String name="zhangsan";
    public void method(){
        System.out.println("no static");
        System.out.println(num);
        System.out.println(name);
        System.out.println("===================");
    }
    public  static void methodStatic(){
        System.out.println("is static");
        System.out.println(name);
    }
}
