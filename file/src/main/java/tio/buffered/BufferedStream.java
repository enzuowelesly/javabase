package tio.buffered;

import java.io.*;

/*
* bufferedOutputstream extends outpuystream
*
* close
* flush
* write
* bufferedoutputstream(outputstream out)
* bufferedoutputstream(outputstream out,int size)
*
*
* */
public class BufferedStream {
    public static void main(String[] args) throws IOException {
        useoutput();
        useinput();
    }
    public static void useoutput() throws IOException{
        FileOutputStream fileOutputStream =new FileOutputStream("/Users/tanzi/Documents/uploads/2020/buffered/bufferedfile.txt",false);
        BufferedOutputStream bufferedOutputStream =new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write("abc".getBytes());
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
    public static void useinput() throws IOException{
        FileInputStream fileInputStream=new FileInputStream("/Users/tanzi/Documents/uploads/2020/buffered/bufferedfile.txt");
        BufferedInputStream bufferedInputStream =new BufferedInputStream(fileInputStream);
        int len=0;
        while ((len=bufferedInputStream.read())!=-1){
            System.out.println(len);
        }
        bufferedInputStream.close();
    }
}
