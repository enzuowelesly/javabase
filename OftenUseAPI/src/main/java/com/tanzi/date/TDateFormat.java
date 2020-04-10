package com.tanzi.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* java.text.dataformat
* 格式化  解析
* format
* parse
*
* SimpleDateFormat
*  yyyy-MM-dd HH:mm:ss
*parse
*
* */
public class TDateFormat {
    public static void main(String[] args) throws ParseException {
        formatDate();
        parseDate();

    }
    public static void formatDate(){
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date =new Date();

        String str=simpleDateFormat.format(date);
        System.out.println(date);
        System.out.println(str);

    }
    public static void parseDate() throws ParseException {
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = simpleDateFormat.parse("2020-04-10 15:54:33");
        System.out.println(parse);


    }
}
