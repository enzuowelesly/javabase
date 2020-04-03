package com.tanzi.arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListSelect {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList =new ArrayList<Integer>();
        Random random =new Random();
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(100)+1);
        }
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(getSmallList(arrayList));
    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> arrayList){
        ArrayList<Integer> arrayListSmall= new ArrayList<Integer>();
        int max=0;
        for (int i = 0; i < arrayList.size(); i++) {
            Integer num =  arrayList.get(i);
            if ( num % 2 == 0){
                arrayListSmall.add(arrayList.remove(i));
                max++;
            }
        }
        System.out.println(arrayListSmall);
        System.out.println(max);
        return arrayListSmall;
    }

}
