package oop.io.textToZip;

import oop.io.text.Toy;
import oop.library.Library;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Toy toy1 = new Toy("Ball", 12.33, 5, "Leather", 100004);
        Toy toy2 = new Toy("Car", 10.10, 3, "Plastic", 100002);
        Toy toy3 = new Toy("Gun", 2.99, 10, "Steel", 100002);
        Toy toy4 = new Toy("WERTYUIO", 222.99, 1011, "SteelWERTYUIO", 100004);

        ControllerZipText.write(toy1);
        ControllerZipText.write(toy2);
        ControllerZipText.write(toy3);

//        List<Toy> toyList = ControllerZipText.find();
//        System.out.println(toyList);

        toy1 = toy4;

        ControllerZipText.update(toy1);
        System.out.println();
        List<Toy> toyList2 = ControllerZipText.find();
        System.out.println(toyList2);

        System.out.println();
        ControllerZipText.delete(toy2);
        List<Toy> toyList3 = ControllerZipText.find();
        System.out.println(toyList3);





    }
}
