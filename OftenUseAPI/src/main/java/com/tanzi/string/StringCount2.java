package com.tanzi.string;

import java.util.Scanner;

public class StringCount2 {
    public static void main(String[] args) {
        int countUpper =0;
        int countLower=0;
        int countNumber=0;
        int countOther=0;
        Scanner scanner=new Scanner(System.in);
        String string=scanner.next();
        char[] chars=string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch=chars[i];
            if (Character.isDigit(ch)){
                countNumber++;
            }else if (Character.isLowerCase(ch)){
                countLower++;
            }else if (Character.isUpperCase(ch)){
                countUpper++;

            }else {
                countOther++;
            }
        }
        System.out.println(countUpper);
        System.out.println(countLower);
        System.out.println(countNumber);
        System.out.println(countOther);
    }
}
