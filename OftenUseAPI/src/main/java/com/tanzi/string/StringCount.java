package com.tanzi.string;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class StringCount {
    public static void main(String[] args) {
        int countUpper =0;
        int countLower=0;
        int countNumber=0;
        int countOther=0;

        Scanner scanner =new Scanner(System.in);
        String str=scanner.next();
         char[] strarray =str.toCharArray();
        for (int i = 0; i < strarray.length; i++) {
            char chi=strarray[i];
            if ('A'<= chi && chi <= 'Z'){
                countUpper++;
            }else if('a'<= chi && chi <= 'z'){
                countLower++;
            }else if ('0'<= chi && chi <= '9'){
                countNumber++;
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
