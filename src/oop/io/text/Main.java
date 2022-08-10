package oop.io.text;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Toy toy1  = new Toy("Ball", 12.33, 5, "Leather", 100001);
        Toy toy2  = new Toy("Car", 10.10, 3, "Plastic", 100002);
        Toy toy3 = new Toy("Gun", 2.99, 10, "Steel", 100002);

        //ToyController.write(toy1);
        //ToyController.write(toy2);

        ToyController.delete(toy1);


        List<Toy> toyList = ToyController.read();

        for (Toy toy: toyList) {
            System.out.println(toy);
        }




    }
}
