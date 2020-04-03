package com.tanzi.arraylist;

import java.util.ArrayList;

public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> arrayList =new ArrayList<String>();
            arrayList.add("徐天");
            arrayList.add("徐天三");
            arrayList.add("五三");
        System.out.println(arrayList);
        getPrint(arrayList);
    }
    public static void getPrint(ArrayList arrayList){
        System.out.print("{");
        for (int i = 0; i < arrayList.size(); i++) {
            if(i<arrayList.size()-1){
                System.out.print(arrayList.get(i)+"@");
            }else {
                System.out.print(arrayList.get(arrayList.size()-1)+"}");
            }

        }

    }

}
