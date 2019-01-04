package ex2;

import java.io.*;

public class FileOperation {

    public static String findCommonWords(File file1, File file2) throws IOException{
        String[] fileOne = getStringFromFile(file1).split(" ");
        String[] fileTwo = getStringFromFile(file2).split(" ");

        StringBuilder result = new StringBuilder();

        for (String aFileOne : fileOne) {
            for (String aFileTwo : fileTwo) {
                if (aFileOne.equals(aFileTwo)) {
                    result.append(aFileOne).append(" ");
                    break;
                }
            }
        }

        return result.toString();
    }

    public static String getStringFromFile(File file) throws IOException{
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line = "";
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }

        } catch (IOException e) {
            throw e;
        }

        return stringBuilder.toString();
    }
}
