package map;

import java.util.HashMap;
import java.util.Scanner;

public class SumString {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("enter String");
        String string =scanner.next();

        char[] chars = string.toCharArray();
        System.out.println(chars);
        HashMap<String,Integer> hashMap=new HashMap<>();
        for (char aChar : chars) {
            if (hashMap.containsKey(String.valueOf(aChar))){
                Integer value= hashMap.get(String.valueOf(aChar));
                value++;
                hashMap.put(String.valueOf(aChar),value);
            }else {
                hashMap.put(String.valueOf(aChar),1);
            }
        }
        for (String s : hashMap.keySet()) {
            System.out.println(s+"="+hashMap.get(s));
        }
    }
}
