package oop.interfaces.sorting.comparator;

import oop.interfaces.sorting.comparable.Address;
import oop.interfaces.sorting.comparable.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PersonByNameComparator personByNameComparator = new PersonByNameComparator();
        PersonByAddressComparator personByAddressComparator = new PersonByAddressComparator();
        PersonByDateComparator personByDateComparator = new PersonByDateComparator();

        Address addressPerson1 = new Address("Kyiv", "Khreshatyk", 1);
        Address addressPerson2 = new Address("Lviv", "Plosha rynok", 2);
        Address addressPerson3 = new Address("Kharkyv", "Barabashova str", 3);
        Address addressPerson4 = new Address("Odesa", "Derybasovska str", 4);
        Address addressPerson5 = new Address("Yoltava", "Yoltavska str", 5);

        Person1 person1 = new Person1("Vasia", "P", new Date(1991 - 1900, 10, 21), 74.1, addressPerson1,1000001l, 2);
        Person1 person2 = new Person1("Kolia", "Ni", new Date(1990 - 1900, 11, 11), 61.22, addressPerson2,10000022l, 1);
        Person1 person3 = new Person1("Serhii", "Ser", new Date(1992 - 1900, 1, 1), 55.333, addressPerson3,10000033l, 3);
        Person1 person4 = new Person1("Pavlo", "Zibr", new Date(1993 - 1900, 3, 12), 59.4444, addressPerson4,10000044l, 4);
        Person1 person5 = new Person1("Viktor", "Pavli", new Date(1980 - 1900, 1, 5), 59.55555, addressPerson5,10000055l, 5);

        Person1[] persons = {person1, person2, person3, person4, person5};

        List<Person1> personList = new ArrayList<>();
        Collections.addAll(personList, person1, person2, person3, person4, person5);

        //Collections.sort(personList, personByAddressComparator);
        Collections.sort(personList, personByDateComparator);
        System.out.println(personList);

//        Arrays.sort(persons, personByNameComparator);
//        System.out.println(Arrays.toString(persons));

        String[] strings = {"q", "we", "rty", "zxcv", "poiuy"};
        Arrays.sort(strings, new StringByLengthComparator());
        System.out.println( Arrays.toString(strings));

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(12);
        integers.add(144);
        integers.add(166);
        integers.add(16999);

        Collections.sort(integers, new IntegerByLengthComparator());
        System.out.println(integers);


    }
}
