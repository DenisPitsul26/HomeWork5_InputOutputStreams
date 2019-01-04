package ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        File file1 = new File("1.txt");
        File file2 = new File("2.txt");
        try (PrintWriter writer1 = new PrintWriter(file1);
            PrintWriter writer2 = new PrintWriter(file2)){
            writer1.print("hello world temp");
            writer2.print("text hello world");
        } catch (FileNotFoundException e){
            System.out.println("Error write to file");
        }

        File fileResult = new File("result.txt");
        String commonWords = "";
        try {
            commonWords = FileOperation.findCommonWords(file1, file2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (PrintWriter writer = new PrintWriter(fileResult)){
            writer.print(commonWords);
        } catch (FileNotFoundException e){
            System.out.println("Error write to file");
        }
    }
}
