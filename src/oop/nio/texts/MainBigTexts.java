package oop.nio.texts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainBigTexts {
    public static void main(String[] args) {
        Path path = Path.of("files/texts/text2.txt");
        try (BufferedReader bufferedReader = Files.newBufferedReader(path);
             BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of("files/texts/copy.txt"))) {
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                bufferedWriter.append(str + "\n");
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }


    }
}
