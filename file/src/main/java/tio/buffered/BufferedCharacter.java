package tio.buffered;
/*
*bufferedwriter  extends writer
*
* write
* flush
* close
*
*
*bufferedreader extends reader
* read
* read
* close
*
 */

import java.io.*;

public class BufferedCharacter {
    public static void main(String[] args) throws IOException {
    usewriter();
    useread();
    usereadTwo();
    }
    public static void usewriter() throws IOException {
        FileWriter fileWriter =new FileWriter("/Users/tanzi/Documents/uploads/2020/buffered/stringwriter.txt",true);
        BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
        for (int i = 0; i < 1; i++) {
            bufferedWriter.write("测试bufferedwriter 字符流缓冲区的写入");
            bufferedWriter.newLine();
        }
         bufferedWriter.flush();
         bufferedWriter.close();
    }
    public static void useread() throws IOException{
        FileReader fileReader =new FileReader("/Users/tanzi/Documents/uploads/2020/buffered/stringwriter.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        int len=0;
        while ((len=bufferedReader.read())!=-1){
            System.out.print((char) len);
        }
        bufferedReader.close();
        System.out.println("=========");
    }
    public static void usereadTwo()throws IOException{
        FileReader fileReader =new FileReader("/Users/tanzi/Documents/uploads/2020/buffered/stringwriter.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        String s;
        while ((s=bufferedReader.readLine())!=null){
            System.out.println(s);
        }
        bufferedReader.close();
    }
}
