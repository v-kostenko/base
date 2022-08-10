package oop.phoneBook.contactArray;

import java.util.Scanner;

public class Contact {
    private String name;
    private String surname;
    private long phoneNumber = 380660051447l;
    private String address;
    private String email;

    Scanner scanner = new Scanner(System.in);

    public Contact(){
        this.phoneNumber = phoneNumber;

        System.out.println("Заполните инфорацию про абонента \n Введите имя");
        String name = scanner.next();
        this.name = name;

        System.out.println("Введите фамилию");
        String surname = scanner.next();
        this.surname = surname;

        System.out.println("Введит адрес");
        String address = scanner.next();
        this.address = address;

        System.out.println("Введите e-mail");
        String email = scanner.next();
        this.email = email;
    }

    public Contact(String name, String surname, long phoneNumber, String address, String email){
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    public Contact(long phoneNumber){
        this.phoneNumber = phoneNumber;

        System.out.println("Заполните инфорацию про абонента \n Введите имя");
        String name = scanner.next();
        this.name = name;

        System.out.println("Введите фамилию");
        String surname = scanner.next();
        this.surname = surname;

        System.out.println("Введит адрес");
        String address = scanner.next();
        this.address = address;

        System.out.println("Введите e-mail");
        String email = scanner.next();
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void getInfo(){
        System.out.println("Name :" + name + "\nSurname :" + surname +
                "\nPhone :" + phoneNumber + "\nAddress :" + address +
                "\nEmail : " + email);
    }

}
