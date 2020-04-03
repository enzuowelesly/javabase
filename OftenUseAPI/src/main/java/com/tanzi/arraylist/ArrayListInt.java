package com.tanzi.arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListInt {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList =new ArrayList<Integer>();
        Random random =new Random();
        for (int i = 0; i < 6; i++) {
            int num =random.nextInt(33)+1;
            arrayList.add(num);

        }
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }
    }
}
