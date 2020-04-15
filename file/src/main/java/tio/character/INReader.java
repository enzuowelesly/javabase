package tio.character;


import java.io.FileReader;
import java.io.IOException;

/*
* java.io.reader  字符输入流 抽象类
* read
* read(char[])
*close
* filereader extends inputstreamreader extends reader
*
*
* */
public class INReader {
    public static void main(String[] args) throws IOException {
//        readfile();
        readfilemore();
    }
    public static void readfile() throws IOException {
        FileReader fileReader =new FileReader("/Users/tanzi/Documents/uploads/2020/3/directoryoo/file/more.txt");
        int len=0;
        while ((len=fileReader.read())!=-1){
            System.out.print((char) len);
        }
        fileReader.close();
    }
    public static void readfilemore() throws IOException{
        FileReader fileReader =new FileReader("/Users/tanzi/Documents/uploads/2020/3/directoryoo/file/more.txt");
        char[] chars= new char[1024];
        int len=0;
        while ((len=fileReader.read(chars))!=-1) {
            System.out.println(new String(chars,0,len));
        }
        fileReader.close();

    }
}
