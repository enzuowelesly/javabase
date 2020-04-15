package tio.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
* inputstream 抽象类
*
*close
* read
* */
public class InPutStream {
    public static void main(String[] args) throws IOException {
//        readFile();
        readFileMore();
    }
    public static void readFile() throws IOException {
        FileInputStream fileInputStream =new FileInputStream("/Users/tanzi/Documents/uploads/2020/3/directoryoo/file/file.txt");
//        int read = fileInputStream.read();
//        System.out.println(read);
//        int read1 = fileInputStream.read();
//        System.out.println(read1);
        int read=0;
        while((read=fileInputStream.read())!=-1){
            System.out.println(read);
        }
        fileInputStream.close();
    }
    public static void readFileMore() throws IOException{
        FileInputStream fileInputStream =new FileInputStream("/Users/tanzi/Documents/uploads/2020/3/directoryoo/file/file.txt");
//        byte[] bytes =new byte[2];
//        int len =fileInputStream.read(bytes);
//        System.out.println(len);
//        System.out.println(Arrays.toString(bytes));
//        System.out.println(new String(bytes));
        byte[] bytes =new byte[1024];
        int len=0;
        while ((len=fileInputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        fileInputStream.close();
    }
}
