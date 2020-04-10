package com.tanzi.packaging;

import java.util.ArrayList;

public class BasePackaging {
    public static void main(String[] args) {

        Integer integer =Integer.valueOf(1);
        System.out.println(integer);
        System.out.println(integer.getClass());
        int i = integer.intValue();
        System.out.println(i);
        Integer in =1;
        int int1=in+1;
        System.out.println(int1);
        ArrayList<Integer> arrayList =new ArrayList<Integer>();
        arrayList.add(1);
        int a=arrayList.get(0);
        System.out.println(a);
        System.out.println(arrayList);

        //基本类型  string字符串转换
        int in11=100;
        String str1=in11+"";
        System.out.println(str1);


        String string1=Integer.toString(100);
        System.out.println(string1);


        String string11=String.valueOf(23);
        System.out.println(string11);

        System.out.println("========");
        int in100=Integer.parseInt(str1);
        System.out.println(in100);
    }
}
