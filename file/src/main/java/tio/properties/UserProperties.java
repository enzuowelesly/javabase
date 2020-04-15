package tio.properties;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
* java.util.properties extends hashtables implements map
* properties 是一个与io流结合的集合
* store把集合中的数据写到硬盘中
* load，把硬盘中的文件加载到集合中
* key，value   双列集合，默认都是String
*
* */
public class UserProperties {
    public static void main(String[] args) throws IOException {
//    propertiesUse();
//        useStore();
//        useStoreSteam();
        useLoad();
    }
    public static void propertiesUse(){
        Properties properties =new Properties();
        properties.setProperty("qqqq","123");
        properties.setProperty("wwww","234");
        properties.setProperty("eeee","345");

        Set<String> strings=properties.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string+"="+properties.getProperty(string));
        }
    }
    public static void useStore() throws IOException {
        Properties properties =new Properties();
        properties.setProperty("qqqq","123");
        properties.setProperty("wwww","234");
        properties.setProperty("eeee","345");
        FileWriter fileWriter =new FileWriter("/Users/tanzi/Documents/uploads/2020/writer/writerfile.txt",true);
        properties.store(fileWriter,"save properties");
        fileWriter.flush();
        fileWriter.close();

    }
    public static void useStoreSteam()throws IOException{
        Properties properties =new Properties();
        properties.setProperty("qqqq","123");
        properties.setProperty("wwww","234");
        properties.setProperty("eeee","345");
        properties.setProperty("坛子","144");
        FileOutputStream fileOutputStream =new FileOutputStream("/Users/tanzi/Documents/uploads/2020/writer/writerfile.txt",true);
        properties.store(fileOutputStream,"use fileoutputstream");
        fileOutputStream.flush();
        fileOutputStream.close();
    }
    public static void useLoad()throws IOException{
        Properties properties =new Properties();
        properties.load(new FileReader("/Users/tanzi/Documents/uploads/2020/writer/writerfile.txt"));
        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string+"="+properties.getProperty(string));
        }

    }
}
