package tio.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* java.io.outputstream 超类抽象类
* gongxing方法
* close
* flush
* write
* write
* write
* FileOutPutStream 把内存中的数据写入到硬盘中
* */
public class OutPutStream {
    public static void main(String[] args) throws IOException {
//        writeOne();
        writeMore();

    }
    public static void writeOne() throws IOException {
        FileOutputStream fileOutputStream =new FileOutputStream("/Users/tanzi/Documents/uploads/2020/3/directoryoo/file/file.txt");
        fileOutputStream.write(97);
        fileOutputStream.close();
    }
    public static void writeMore() throws IOException {
        FileOutputStream fileOutputStream =new FileOutputStream("/Users/tanzi/Documents/uploads/2020/3/directoryoo/file/more.txt",true);
//        byte[] bytes={65,66,67,68};
//        byte[] bytes={-65,-66,-67,68};
//
//        fileOutputStream.write(bytes);
        byte[] bytes1="你好\r".getBytes();
        fileOutputStream.write(bytes1);
        fileOutputStream.close();
    }
}
