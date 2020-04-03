package com.tanzi.arraylist;

public class ArrayPerson {
    public static void main(String[] args) {
        Person[] array =new Person[3];
        Person one = new Person("dawang",12);
        Person two =new Person("erwang",23);
        Person three =new Person("sanwang",11);
        array[0]=one;
        array[1]=two;
        array[2]=three;
        System.out.println(array[1]);
        System.out.println(array[1].getAge());
        System.out.println(array[1].getName());
        System.out.println(array.toString());
    }
}
