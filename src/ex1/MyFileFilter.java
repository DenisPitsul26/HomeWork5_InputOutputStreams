package ex1;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {
    private String arr;

    public MyFileFilter(String arr) {
        this.arr = arr;
    }

    @Override
    public boolean accept(File pathname) {
        int pointerIndex = pathname.getName().lastIndexOf(".");
        if (pointerIndex == -1)
            return false;

        String extension = pathname.getName().substring(pointerIndex+1);
        return arr.equals(extension);
    }
}
