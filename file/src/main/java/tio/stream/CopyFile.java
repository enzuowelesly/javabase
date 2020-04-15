package tio.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        copyjpeg();
    }
    public static void copyjpeg() throws IOException {
        FileInputStream fileInputStream =new FileInputStream("/Users/tanzi/Documents/uploads/2020/3/directoryoo/file/more.txt");
        FileOutputStream fileOutputStream =new FileOutputStream("/Users/tanzi/Documents/uploads/2020/3/more.txt");
        byte[] bytes=new byte[1024];
        int len=0;
        while ((len=fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,len);
        }
        fileOutputStream.close();
        fileInputStream.close();

    }
}
