package oop.io.systemBox;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Controller2 {

    public static List<SystemBox> findAll() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(
                new FileInputStream("boxes2.obj")))) {
            return (List<SystemBox>) objectInputStream.readObject();
        } catch (FileNotFoundException fileNotFoundException) {

        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        return new ArrayList<>();
    }

    private static boolean reWrite(List<SystemBox> systemBoxes) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new BufferedOutputStream(
                new FileOutputStream("boxes2.obj")))) {
            outputStream.writeObject(systemBoxes);
            return true;
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException){
            ioException.printStackTrace();
        }
        return false;
    }

    public static boolean create(SystemBox systemBox) {
        List<SystemBox> systemBoxList = findAll();
        systemBoxList.add(systemBox);
        return reWrite(systemBoxList);
    }

    public static boolean update(SystemBox systemBox){
        List<SystemBox> systemBoxList = findAll();

        if (systemBoxList.remove(systemBox)){
            systemBoxList.add(systemBox);
            return reWrite(systemBoxList);
        }
        return false;
    }

    public static boolean delete(SystemBox systemBox){
        List<SystemBox> systemBoxList = findAll();
        systemBoxList.remove(systemBox);
        return reWrite(systemBoxList);
    }


}
