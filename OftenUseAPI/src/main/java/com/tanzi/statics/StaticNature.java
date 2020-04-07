package com.tanzi.statics;

public class StaticNature {
    public static void main(String[] args) {
        Student one =new Student("zhansan",19);
        one.room="101";
        System.out.println(one.getId());
        System.out.println(one.getName());
        System.out.println(one.getAge());
        System.out.println(one.getRoom());
        Student two =new Student("zhansan",19);
        System.out.println("==================");
        two.room="1011";
        System.out.println(two.getId());
        System.out.println(two.getName());
        System.out.println(two.getAge());
        System.out.println(two.getRoom());
        System.out.println("==================");

        System.out.println(one.getRoom());
    }
}
