package com.tanzi.system;


import java.util.Arrays;

public class MySystem {
    public static void main(String[] args) {
//        getTime();
        arrayCopy();
    }
    public static void arrayCopy(){
        int[] src={1,2,3,4,45,3};
        int[] dest ={21,43,12,11,55,33};
        System.out.println(Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));

    }



    public static void getTime(){
        Long currenttime=System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        Long currenttimefor =System.currentTimeMillis();
        Long current =currenttimefor-currenttime;
        int ss= (int) (current/1000);
        System.out.println(current);
        System.out.println(ss);
    }

}
