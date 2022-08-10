package oop.io.bytes.basic;

import javax.imageio.IIOException;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        //FileInputStream inputStream = null;
        //FileOutputStream outputStream = null;

        BufferedInputStream inputStream = null;
        BufferedOutputStream outputStream = null;

        try {
            inputStream = new BufferedInputStream( new FileInputStream("test.mp4"));
            outputStream =new BufferedOutputStream( new FileOutputStream(new File("copy.mp4")));

            int temp = 0;
            while ((temp = inputStream.read()) != -1) {
                outputStream.write(temp);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

        }

    }
}
