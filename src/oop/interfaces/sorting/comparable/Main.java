package oop.interfaces.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        Collections.addAll(strings, "Car", "Motorbike", "Ball", "Money", "Coffee", "123 Test", "!@#$", "z That");

        Collections.sort(strings);
        Collections.reverse(strings);
        System.out.println(strings);

        Address addressPerson1 = new Address("Kyiv", "Khreshatyk", 1);
        Address addressPerson2 = new Address("Lviv", "Plosha rynok", 2);
        Address addressPerson3 = new Address("Kharkyv", "Barabashova str", 3);
        Address addressPerson4 = new Address("Odesa", "Derybasovska str", 4);
        Address addressPerson5 = new Address("Yoltava", "Yoltavska str", 5);

        Person person1 = new Person("Vasia", "P", new Date(1991 - 1900, 10, 21), 74.1, addressPerson1,1000001l, 2);
        Person person2 = new Person("Kolia", "Ni", new Date(1990 - 1900, 11, 11), 61.22, addressPerson2,10000022l, 1);
        Person person3 = new Person("Serhii", "Ser", new Date(1992 - 1900, 1, 1), 55.333, addressPerson3,10000033l, 3);
        Person person4 = new Person("Pavlo", "Zibr", new Date(1993 - 1900, 3, 12), 59.4444, addressPerson4,10000044l, 4);
        Person person5 = new Person("Viktor", "Pavli", new Date(1980 - 1900, 1, 5), 59.55555, addressPerson5,10000055l, 5);

        List<Person> personList = new ArrayList<>();
        Collections.addAll(personList, person1, person2, person3, person4, person5);

//        Collections.sort(personList);
//        System.out.println(personList);
//
//        Collections.reverse(personList);
//        System.out.println(personList);

        Collections.sort(personList);
        System.out.println(personList);









    }
}
