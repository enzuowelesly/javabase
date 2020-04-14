package file;

import java.io.File;

/*
* java.io.file 对文件和文件夹进行操作
*
* */
public class UseFile {
    public static void main(String[] args) {
//       newFile();
       // FileGet();
        FileIs();
    }
    public static void FileIs(){
        File file1=new File("/Users/tanzi/Documents/uploads/2020/3/123.jpeg");
        System.out.println(file1.exists());
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());
        System.out.println("=======================================================");
        File file2=new File("/Users/tanzi/Documents/uploads/2020/3/");
        System.out.println(file2.exists());
        System.out.println(file2.isFile());
        System.out.println(file2.isDirectory());
    }

    public static void FileGet(){
        File file7=new File("123.txt");
        System.out.println(file7.getAbsolutePath());
        System.out.println(file7.getPath());
        System.out.println(file7.toString());
        System.out.println(file7.getName());
        System.out.println(file7.length());
        System.out.println("================================");
        File file6=new File("/Users/tanzi/Documents/uploads/2020/3/123.txt");
        System.out.println(file6.getAbsolutePath());
        System.out.println(file6.getPath());
        System.out.println(file6.toString());
        System.out.println(file6.getName());
        System.out.println(file6.length());


        File file8=new File("/Users/tanzi/Documents/uploads/2020/3/123.jpeg");
        System.out.println(file8.length());

    }
    public static void newFile(){
        String pathSparator = File.pathSeparator;//路径分割符
        System.out.println(pathSparator);
        String separator =File.separator;//文件分割符
        System.out.println(separator);
        File file1 =new File("/Users/tanzi/Documents/uploads/2020/3/123.txt");
        System.out.println(file1);
        File file2 =new File("/Users/tanzi/Documents/uploads/2020/");
        System.out.println(file2);
        File file3 =new File("123.txt");
        System.out.println(file3);
        File file4 =new File("/Users/tanzi/Documents/uploads/2020/","123.exe");
        System.out.println(file4);
        File file5 =new File(file2,"123.exe");
        System.out.println(file5);
    }
}
