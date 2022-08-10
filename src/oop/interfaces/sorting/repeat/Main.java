package oop.interfaces.sorting.repeat;

import oop.library.Library;
import oop.stream.orders.Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Battery battery1 = new Battery(100.24, "Samsung");
        Battery battery2 = new Battery(99.94, "LG");
        Battery battery3 = new Battery(79.51, "Mi");

        Phone phone1 = new Phone(battery1, "Samsung", 999.99, 100001l);
        Phone phone2 = new Phone(battery2, "LG", 555.99, 100002l);
        Phone phone3 = new Phone(battery3, "Miy", 456.99, 100003l);

        List<Phone> phonesList = new ArrayList<>();
        Collections.addAll(phonesList, phone1, phone2, phone3);

//        Collections.sort(phonesList);
//        phonesList.forEach(p -> System.out.println(p));

//        Collections.sort(phonesList, (p1, p2) -> - Double.compare(p1.getPrice(), p2.getPrice()));
//        phonesList.forEach(p -> System.out.println(p));










    }
}
