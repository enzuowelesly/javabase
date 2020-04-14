package recursive;

import java.io.File;

public class FileFilterimpl implements java.io.FileFilter {


    public boolean accept(File pathname) {
        if (pathname.isDirectory()){
            return true;
        }
        return pathname.toString().toLowerCase().endsWith(".jpeg");
    }
}
