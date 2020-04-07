package com.tanzi.statics;

public class StaticMethod {

    public static void main(String[] args) {
        MyClass myClass =new MyClass();
        myClass.method();
        MyClass.methodStatic();
        method();
    }
    public static void method(){
        System.out.println("one static+++++++++++");
    }

}
