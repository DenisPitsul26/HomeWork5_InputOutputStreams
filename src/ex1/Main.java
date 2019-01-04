package ex1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File dirIn = new File("txt1");
        dirIn.mkdirs();
        File file1 = new File(dirIn,"1.txt");
        File file2 = new File(dirIn,"2.pdf");
        File file3 = new File(dirIn,"3.txt");
        File file4 = new File(dirIn,"4.docx");
        File file5 = new File(dirIn,"5.txt");
        File dirOut = new File("txt2");
        dirOut.mkdirs();
        try {
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
            file4.createNewFile();
            file5.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileOperation.fileCopy(dirIn, dirOut, "txt");
        } catch (IOException e) {
            System.out.println("Error copy file!");
        }
    }
}
