package tio.buffered;

import java.io.*;

public class CopyStreamFile {
    public static void main(String[] args) throws IOException {
            usecopyStream();
    }
    public static void usecopyStream()throws IOException{
        Long snow=System.currentTimeMillis();
        FileInputStream fileInputStream =new FileInputStream("/Users/tanzi/Documents/uploads/2020/buffered/bufferedfile.txt");
        FileOutputStream fileOutputStream  =new FileOutputStream("/Users/tanzi/Documents/uploads/2020/buffered/copy/bufferedfile.txt");
        BufferedInputStream bufferedInputStream =new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream =new BufferedOutputStream(fileOutputStream);
        int len=0;
        while ((len=bufferedInputStream.read())!=-1){
            bufferedOutputStream.write(len);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
        Long enow=System.currentTimeMillis();
        System.out.println("消耗时间"+(enow-snow)+"毫秒");
    }
}
