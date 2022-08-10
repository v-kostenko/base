package oop.io.zip;

import oop.io.systemBox.ObjectInputStreamMy;
import oop.io.systemBox.ObjectOutputStreamMy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ControllerCar {

    private static boolean reWrite(List<Car> cars) {
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(
                new FileOutputStream("cars.zip")))) {
            ZipEntry zipEntry = new ZipEntry("cars.obj");
            zipOutputStream.putNextEntry(zipEntry);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(zipOutputStream);
            objectOutputStream.writeObject(cars);
            return true;
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return false;
    }

    public static boolean create(Car car) {
        List<Car> cars = read();
        cars.add(car);

        return reWrite(cars);
    }

    public static List<Car> read() {
        try (ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(
                new FileInputStream("cars.zip")))) {
            zipInputStream.getNextEntry();
            ObjectInputStream objectInputStream = new ObjectInputStream(zipInputStream);

            return (List<Car>) objectInputStream.readObject();

        } catch (FileNotFoundException fileNotFoundException) {

        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        return new ArrayList<>();

    }

    public static boolean delete(Car car) {
        List<Car> carList = read();

        if (carList.remove(car)) {
            return reWrite(carList);
        }
        return false;
    }


}
