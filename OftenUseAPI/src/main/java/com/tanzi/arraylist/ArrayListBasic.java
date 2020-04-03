package com.tanzi.arraylist;

import java.util.ArrayList;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listStr=new ArrayList<String>();
        ArrayList<Integer> listNum =new ArrayList<Integer>();
        listNum.add(100);
        listNum.add(100);
        int i=listNum.get(1);
        System.out.println(listNum);
        System.out.println(i);
        System.out.println(listStr);
    }


}
