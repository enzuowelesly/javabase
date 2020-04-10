package com.tanzi.stringbuilder;

/*
 * new Stringbuilder
 *
 * append
 * StringBuiler   String 的相互转化
 *
 * */
public class TStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder1 =new StringBuilder("abd");
        System.out.println(builder1);
        StringBuilder builder =new StringBuilder();
        builder.append("adb");
        builder.append(1);
        builder.append("22222").append("%%").append("PPP");
        System.out.println(builder);
        System.out.println("=========");
        String string=builder.toString();
        System.out.println(string);

    }
}
