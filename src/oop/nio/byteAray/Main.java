package oop.nio.byteAray;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            Path path = Path.of("files/secondFolder/DOU.png");
            byte[] array = Files.readAllBytes(path);
            System.out.println(Arrays.toString(array));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


    }
}
