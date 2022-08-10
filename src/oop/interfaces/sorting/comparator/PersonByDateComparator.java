package oop.interfaces.sorting.comparator;

import java.util.Comparator;

public class PersonByDateComparator implements Comparator<Person1> {

    @Override
    public int compare(Person1 person1, Person1 person2){
        return person1.getDataOfBirth().compareTo(person2.getDataOfBirth());
    }
}
