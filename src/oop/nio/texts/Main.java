package oop.nio.texts;

import oop.library.Library;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            String text = "Where does it come from?\n" +
                    "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\n" +
                    "\n" +
                    "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.";


//            OpenOption[] openOptions = {StandardOpenOption.CREATE, StandardOpenOption.WRITE};
            Path path = Path.of("files/texts/java.txt.txt");
//            //Files.write(path, text.getBytes(StandardCharsets.UTF_8), openOptions);
//            Files.writeString(path, text, openOptions);

//            String str = Files.readString(path);
//            System.out.println(str);

            List<String> stringList = Files.readAllLines(path);
            for (String stri: stringList) {
                System.out.println(stri);
            }


        } catch (IOException ioException) {
            ioException.printStackTrace();
        }




    }
}
