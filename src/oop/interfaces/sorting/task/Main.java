package oop.interfaces.sorting.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Pug", 2, "Black", 9.5);
        Phone phone = new Phone(259.99, "Samsung", 12.3, 22.55);
        Table table = new Table(1234.56, "White", 25.88, Material.WOOD);

        List<ItemI> itemIS = new ArrayList<>();

        Collections.addAll(itemIS, dog, phone, table);

        for (int i = 0; i < itemIS.size(); i++) {
            itemIS.get(i).showInfo();
        }

        Collections.sort(itemIS);
        System.out.println(itemIS);
    }
}
