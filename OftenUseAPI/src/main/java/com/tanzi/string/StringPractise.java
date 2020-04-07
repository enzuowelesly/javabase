package com.tanzi.string;

public class StringPractise {
    public static void main(String[] args) {
        int[] ints= {1,2,3};
        String fromStr=fromArrayToString(ints);
        System.out.println(fromStr);
    }
    public static String fromArrayToString(int[] array){
        String str= "[";
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1){
                str+="word"+array[i]+"]";
            }else {
                str +="word"+array[i]+"$";
            }
        }
        return str;

    }


}
