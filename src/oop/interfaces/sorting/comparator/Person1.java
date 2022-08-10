package oop.interfaces.sorting.comparator;

import oop.interfaces.sorting.comparable.Address;

import java.util.Date;

public class Person1 {
    private String name;
    private String surname;
    private Date dataOfBirth;
    private double weight;
    private Address address;
    private long id;
    private int height;

    public Person1(String name, String surname, Date dataOfBirth, double weight, Address address, long id, int height) {
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

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public Date getDataOfBirth(){
        return dataOfBirth;
    }

    public double getWeight(){
        return weight;
    }

    public Address getAddress(){
        return address;
    }

    public long getId(){
        return id;
    }

    public int getHeight(){
        return height;
    }

}
