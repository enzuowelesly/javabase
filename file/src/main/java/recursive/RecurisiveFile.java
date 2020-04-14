package recursive;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class RecurisiveFile {
    public static void main(String[] args) {
        File file=new File ("/Users/tanzi/Documents/uploads/2020/3/directoryoo/");
//            reFile(file);
//        reFileTwo(file);
//        fileFilter(file);
//        fileFilterTwo(file);
        fileFilterThree(file);

    }
    public static void fileFilterThree(final File file){
        File[] files=file.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return new File(file,name).isDirectory()||name.toLowerCase().endsWith(".jpeg");
            }
        });
        for (File file1 : files) {
            if (file1.isDirectory()) {
                fileFilter(file1);
            } else {

                System.out.println(file1);
            }
        }
    }

    public static void fileFilterTwo(File file) {
        File[] files = file.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                if (pathname.isDirectory()){
                    return true;
                }
                return pathname.toString().toLowerCase().endsWith(".jpeg");
            }
        });
        for (File file1 : files) {
            if (file1.isDirectory()) {
                fileFilter(file1);
            } else {

                System.out.println(file1);
            }
        }
    }

    public static void fileFilter(File file) {
        File[] files = file.listFiles(new FileFilterimpl());
        for (File file1 : files) {
            if (file1.isDirectory()) {
                fileFilter(file1);
            } else {

                System.out.println(file1);
            }
        }
    }
    public static void reFile(File file){
        File[] files= file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()){
                reFile(file1);
            }else{
              String s=  file1.toString().toLowerCase();
              boolean b=s.endsWith(".jpeg");
              if (b){
                  System.out.println(file1);
              }
            }
        }
    }
    public static void reFileTwo(File file){
        File[] files= file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()){
                reFileTwo(file1);
            }else{
                if (file1.toString().toLowerCase().endsWith(".jpeg")){
                    System.out.println(file1);
                }
            }
        }
    }
}
