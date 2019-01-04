package ex1;

import java.io.*;

public class FileOperation {

    public static void fileCopy(File in, File out, String extension) throws IOException {
        MyFileFilter fileFilter = new MyFileFilter(extension);

        File[] files = in.listFiles(fileFilter);

        byte[] buffer = new byte[1024*1024];
        for (File file: files) {
            int readByte = 0;
            try (FileInputStream fis = new FileInputStream(file);
                 FileOutputStream fos = new FileOutputStream(out + "\\" + file.getName())) {
                while ((readByte = fis.read(buffer)) > 0) {
                    fos.write(buffer, 0, readByte);
                }
            } catch (IOException e) {
                throw e;
            }

        }

    }

}
