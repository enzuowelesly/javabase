package recursive;

import java.io.File;

public class RecurisiveFile {
    public static void main(String[] args) {
        File file=new File ("/Users/tanzi/Documents/uploads/2020/3/directoryoo/");
//            reFile(file);
//        reFileTwo(file);
        fileFilter(file);
    }

    public static void fileFilter(File file) {
        File[] files = file.listFiles(new FileFilterimpl());
        //System.out.println(files);
        for (File file1 : files) {
            if (file1.isDirectory()) {
                fileFilter(file1);
            } else {

                System.out.println(file1);
            }
        }
    }
    public static void reFile(File file){
        //System.out.println(file);
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
        //System.out.println(file);
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
