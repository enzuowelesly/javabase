package file;

import java.io.File;
import java.io.IOException;

/*
* java.io.file 对文件和文件夹进行操作
*
* */
public class UseFile {
    public static void main(String[] args) throws IOException {
//          newFile();
//          FileGet();
//          FileIs();
//          FileOperation();
//          DirectoryOperation();
        fileList();
    }
    public static void  fileList(){
        File file=new File ("/Users/tanzi/Documents/uploads/2020/3/directoryoo/");
        System.out.println(file);
        String[] filelist =file.list();
        System.out.println(filelist.length);
        for (String s : filelist) {
            System.out.println(s);
        }
        File file2=new File ("/Users/tanzi/Documents");
        File[] files = file2.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
    public static void DirectoryOperation(){
        File file =new File ("/Users/tanzi/Documents/uploads/2020/3/directoryoo");
        boolean newdire=file.mkdir();
        System.out.println(newdire);

        File file1=new File ("/Users/tanzi/Documents/uploads/2020/3/directoryoo/12/23/43/233/333");
        boolean newdire1=file1.mkdirs();
        System.out.println(newdire1);

        File file2=new File ("/Users/tanzi/Documents/uploads/2020/3/directoryoo/file/123.txt");
        boolean newdire2=file2.mkdirs();
        boolean delete =file2.delete();
        System.out.println(newdire2);
        System.out.println("=====================");
        System.out.println(delete);


    }
    public static void FileOperation() throws IOException {
        File file =new File("/Users/tanzi/Documents/uploads/2020/3/123.txt");
        boolean newfilw =file.createNewFile();
        System.out.println(newfilw);
        System.out.println("==================");
        File file1 =new File("test.txt");
        boolean newfilw1 =file1.createNewFile();
        System.out.println(newfilw1);
        System.out.println("==================");
        File file2 =new File("/Users/tanzi/Documents/uploads/2020/3/directory/directory.txt");
        boolean newfilw2 =file2.createNewFile();
        System.out.println(newfilw2);
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
