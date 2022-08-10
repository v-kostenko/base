package oop.io.textToZip;

import oop.io.text.Toy;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ControllerZipText {

    private static boolean reWrite(List<Toy> toyList) {
        try (ZipOutputStream outputStream = new ZipOutputStream(new BufferedOutputStream(
                new FileOutputStream("toys.zip")))) {
            ZipEntry zipEntry = new ZipEntry("toys.txt");
            outputStream.putNextEntry(zipEntry);

            for (Toy toys: toyList) {
                outputStream.write((toys.toString() + "\n").getBytes(StandardCharsets.UTF_8));
            }

            return true;
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return false;
    }

    public static boolean write(Toy toy) {
        List<Toy> toyList = find();
        toyList.add(toy);
        try (ZipOutputStream outputStream = new ZipOutputStream(new BufferedOutputStream(
                new FileOutputStream("toys.zip")))) {
            ZipEntry zipEntry = new ZipEntry("toys.txt");
            outputStream.putNextEntry(zipEntry);

//            BufferedWriter printWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
//            printWriter.append(toy + "\n");
//            outputStream.closeEntry();
            for (Toy toys: toyList) {
                outputStream.write((toys.toString() + "\n").getBytes(StandardCharsets.UTF_8));
            }
            return true;
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return false;
    }

    public static List<Toy> find() {
        List<Toy> toyList = new ArrayList<>();
        try (ZipInputStream inputStream = new ZipInputStream(new BufferedInputStream(
                new FileInputStream("toys.zip")))) {
            inputStream.getNextEntry();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String str = "";
            while ((str = bufferedReader.readLine()) != null){
                String title = str.split(" ")[1];

                str = bufferedReader.readLine();
                String toyPrice = str.split(" ")[2];
                double price = Double.parseDouble(toyPrice);

                str = bufferedReader.readLine();
                String toyAgeFrom = str.split(" ")[3];
                int ageFrom = Integer.parseInt(toyAgeFrom);

                str = bufferedReader.readLine();
                String material = str.split(" ")[2];

                str = bufferedReader.readLine();
                String toySerNumb = str.split(" ")[0];
                long serNumber = Long.parseLong(toySerNumb);

                Toy toy = new Toy(title, price, ageFrom, material, serNumber);
                toyList.add(toy);
            }
            return toyList;

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return new ArrayList<>();
    }

    public static boolean update(Toy toy){
        List<Toy> toyList = find();
        if (toyList.remove(toy)){
            toyList.add(toy);
           return reWrite(toyList);
        }
        return false;
    }

    public static boolean delete(Toy toy){
        List<Toy> toyList = find();
        if (toyList.remove(toy)){
            return  reWrite(toyList);
        }
        return false;
    }


}
