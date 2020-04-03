package com.tanzi.arraylist;

import java.util.ArrayList;

public class ArrayListPerson {
    public static void main(String[] args) {
        ArrayList<Person> arrayList =new ArrayList();

        Person one = new Person("dawang",12);
        Person two =new Person("erwang",23);
        Person three =new Person("sanwang",11);
        arrayList.add(one);
        arrayList.add(two);
        arrayList.add(three);
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.size());
        Person whoRemove= arrayList.remove(2);
        System.out.println("被删除的是："+whoRemove);
        System.out.println(arrayList);
        System.out.println(arrayList.getClass());
        for (Person person : arrayList) {
            System.out.println(person);
        }
        }

}

