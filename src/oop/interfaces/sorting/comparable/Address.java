package oop.interfaces.sorting.comparable;

public class Address {
    private String city;
    private String street;
    private int houseNumber;

    public Address(String city, String street, int houseNumber){
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String toString(){
        return getClass().getSimpleName() + ": \nCity - " + city + ", Str. " + street + " " + houseNumber;
    }

    public String getStreet(){
        return street;
    }


}
