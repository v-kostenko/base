package oop.io.systemBox;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    public static boolean create(SystemBox systemBox) {
        try (ObjectOutputStreamMy objectOutputStream = new ObjectOutputStreamMy(new BufferedOutputStream(
                new FileOutputStream("boxes.obj", true)))) {
            objectOutputStream.writeObject(systemBox);
            return true;
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return false;
    }

    public static List<SystemBox> find() {
        List<SystemBox> systemBoxes = new ArrayList<>();
        try (ObjectInputStreamMy objectInputStream = new ObjectInputStreamMy(new BufferedInputStream(
                new FileInputStream("boxes.obj")))) {
            try {
                while (true) {
                    SystemBox systemBox = (SystemBox) objectInputStream.readObject();
                    systemBoxes.add(systemBox);
                }
            } catch (EOFException eofException) {

            }
            return systemBoxes;
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        return systemBoxes;
    }

    private static boolean rewriteFile(List<SystemBox> systemBoxes) {
        try (ObjectOutputStreamMy objectOutputStreamMy = new ObjectOutputStreamMy(new BufferedOutputStream(
                new FileOutputStream("boxes.obj", false)))) {
            for (int i = 0; i < systemBoxes.size(); i++) {
                objectOutputStreamMy.writeObject(systemBoxes.get(i));
            }
            return true;
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return false;
    }

    public static boolean update(SystemBox systemBox) {
        List<SystemBox> systemBoxList = find();
        if (systemBoxList.remove(systemBox)) {
            systemBoxList.add(systemBox);
            return rewriteFile(systemBoxList);
        }
        return false;
    }

    public static boolean delete(SystemBox systemBox){
        List<SystemBox> systemBoxList = find();
        systemBoxList.remove(systemBox);
        return rewriteFile(systemBoxList);
    }


}
