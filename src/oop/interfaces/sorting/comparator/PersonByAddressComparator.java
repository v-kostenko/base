package oop.interfaces.sorting.comparator;

import java.util.Comparator;

public class PersonByAddressComparator implements Comparator<Person1> {

    @Override
    public int compare(Person1 person1, Person1 person2){
        return - (person1.getAddress().getStreet().compareTo(person2.getAddress().getStreet()));
    }
}
