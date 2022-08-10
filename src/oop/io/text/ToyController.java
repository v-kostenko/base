package oop.io.text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ToyController {

    private static boolean reWrite(List<Toy> toys){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("toys.txt"))){
            for (int i = 0; i < toys.size(); i++) {
                writer.append(toys.get(i) + "\n");
                return true;
            }
        }catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException){
            ioException.printStackTrace();
        }
        return false;
    }

    public static boolean write(Toy toy) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("toys.txt", true))) {
            writer.append(toy + "\n");
            return true;
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return false;
    }

    public static List<Toy> read() {
        List<Toy> toyList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(
                new File("toys.txt")))) {
            String str = "";

            while ((str = reader.readLine()) != null) {
                String title = str.split(" ")[1];

                str = reader.readLine();
                String priceToy = str.split(" ")[2];
                double price = Double.parseDouble(priceToy);

                str = reader.readLine();
                String ageFromToy = str.split(" ")[3];
                int ageFrom = Integer.parseInt(ageFromToy);

                str = reader.readLine();
                String material = str.split(" ")[2];

                str = reader.readLine();
                String serNumberToy = str.split(" ")[0];
                long serNumber = Long.parseLong(serNumberToy);

                Toy toy = new Toy(title, price, ageFrom, material, serNumber);
                toyList.add(toy);
            }
            return toyList;

        } catch (FileNotFoundException fileNotFoundException) {

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return toyList;
    }

    public static boolean update(Toy toy) {
        List<Toy> toyList = read();

        if (!toyList.remove(toy)){
            return false;
        }

        toyList.add(toy);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("toys.txt"))) {
            for (int i = 0; i < toyList.size(); i++) {
                writer.append(toyList.get(i) + "\n");
            }
            return true;

        } catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException){
            ioException.printStackTrace();
        }
        return false;
    }

    public static boolean delete(Toy toy){
        List<Toy> toyList = read();

       if(toyList.remove(toy)){
           return reWrite(toyList);
       }
       return false;
    }

}
