package tio.character;

import java.io.FileWriter;
import java.io.IOException;

/*
* java.io.writer 字符输入流 抽象类
* 公共方法
* close
* write(char[],index,len)
*write(String ,index,len)
* flush
* filewriter outputstreamwriter  writer
* file filename
* */
public class OUTWriter {
    public static void main(String[] args) throws IOException {
//    readfile();
        readfilemore();
    }
    public static void readfile() throws IOException {
        FileWriter fileWriter =new FileWriter("/Users/tanzi/Documents/uploads/2020/writer/writerfile.txt");
        fileWriter.write(97);
        fileWriter.flush();
        fileWriter.close();
    }
    public static void readfilemore() throws IOException{
        FileWriter fileWriter=null;
        try{
            fileWriter =new FileWriter("/Users/tanzi/Documents/uploads/2020/writer/writerfile.txt",true);
            char[] chars={'t','f','e','q'};
//            fileWriter.write(chars);
            fileWriter.write(chars,0,2);
            fileWriter.write(97);
            for (int i = 0; i < 4; i++) {
                fileWriter.write("\r");
                fileWriter.write("javabase  java 输入输出IO");
            }

        }catch(IOException e){
            System.out.println(e);
        }finally {

            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
