package oop.interfaces.sorting.comparable;

import javax.xml.crypto.Data;
import java.util.Date;

public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private Date dataOfBirth;
    private double weight;
    private Address address;
    private long id;
    private int height;

    public Person(String name, String surname, Date dataOfBirth, double weight, Address address, long id, int height) {
        this.name = name;
        this.surname = surname;
        this.dataOfBirth = dataOfBirth;
        this.weight = weight;
        this.address = address;
        this.id = id;
        this.height = height;
    }

    public String toString() {
        return "\n*" + name + " " + surname + "*" + "\nBirth: " + dataOfBirth + "\nWeight: " + weight + "\n" + address +
                "\nID: " + id + "\nHeight: " + height;
    }

    @Override
    public int compareTo(Person person) {

        //return this.name.compareTo(person.name);
        //return - this.address.getStreet().compareTo(person.address.getStreet()); // Положительное, возвращается наоборот
        //return this.address.getStreet().compareTo(person.address.getStreet());
        //return - this.surname.length() - person.surname.length();
        //return this.dataOfBirth.compareTo(person.dataOfBirth);
        //Double.compare(this.weight, person.weight);

        String s= "" + this.weight;
        char[] chars = s.toCharArray();
        int counterThis = 0;
        for (int i = chars.length-1; i >= 0; i--) {
            if (chars[i] != '.'){
                counterThis++;
            } else {
                break;
            }
        }

        String sPerson= "" + person.weight;
        char[] charsPerson = s.toCharArray();
        int counterPerson = 0;
        for (int i = charsPerson.length - 1; i >= 0; i--) {
            if (chars[i] != '.'){
                counterPerson++;
            } else {
                break;
            }
        }

        return counterThis - counterPerson;



//        if (this.height == person.height) {
//            return 0;
//        }
//        if (this.height < person.height) {
//            return -1;
//        }
//        return 1;
    }


}
