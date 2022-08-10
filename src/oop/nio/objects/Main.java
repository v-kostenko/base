package oop.nio.objects;

import oop.io.bytes.data.ObjectInputStreamMy1;
import oop.io.bytes.data.ObjectOutputStreamMy1;
import oop.io.systemBox.ObjectInputStreamMy;
import oop.io.systemBox.ObjectOutputStreamMy;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Bob", 12);
        Person person2 = new Person("Ben", 32);
        Person person3 = new Person("Jhon", 22);

        Path path = Path.of("files/texts/person.obj");
        OpenOption[] openOptions = {StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.APPEND};

        try (ObjectOutputStreamMy1 objectOutputStream = new ObjectOutputStreamMy1(Files.newOutputStream(path, openOptions))) {
            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);
            objectOutputStream.writeObject(person3);
        } catch (IOException ioException){
            ioException.printStackTrace();
        }

        OpenOption[] openOptions1 = {StandardOpenOption.READ};
        try (ObjectInputStreamMy1 objectInputStream = new ObjectInputStreamMy1(Files.newInputStream(path, openOptions1))) {
            List<Person> personList = new ArrayList<>();

            try {
                while (true) {
                    Person person = (Person) objectInputStream.readObject();
                    personList.add(person);
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }

            for (Person pe : personList) {
                System.out.println(pe);
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }


    }
}
