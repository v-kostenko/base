package oop.interfaces.contactWindow;

import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ContactWindow {
    private ArrayList<ContactI> contacts = new ArrayList<>();
    private int currentPosition = 3;
    Scanner scanner = new Scanner(System.in);

    public ContactWindow() {
        Supplier supplier = new Supplier("Supplier", "Krakow", 480556667, "supplier@gmail.com",
                "Supplier", 99.99);
        Employee employee = new Employee("Employee", "Kyiv", 660051447, "employee@gmail.co",
                "Employee", "Finance", 1500);
        Delivery delivery = new Delivery("Delivery", "Kharkov", 998883322, "delivery@gmail.com",
                "Delivery", 12.87);
        Client client = new Client("Client", "Poltava", 965554433, "client@gmail.com",
                "Client", 12.66);
        contacts.add(supplier);
        contacts.add(employee);
        contacts.add(delivery);
        contacts.add(client);
    }

    public void previous() {
        if (currentPosition == 0) {
            currentPosition = contacts.size() - 1;
            System.out.println(contacts.get(currentPosition));
        } else {
            currentPosition--;
            System.out.println(contacts.get(currentPosition));
        }
    }

    public void next() {
        if (currentPosition == contacts.size() - 1) {
            currentPosition = 0;
            System.out.println(contacts.get(currentPosition));
        } else {
            currentPosition++;
            System.out.println(contacts.get(currentPosition));
        }
    }

    public void remove() {
        if (currentPosition == contacts.size() - 1)
            currentPosition--;
        else
            contacts.remove(currentPosition);
        System.out.println(contacts.get(currentPosition));
    }

    public void edit() {
        vasya:
        while (true) {
            System.out.println("Какое поле хотите отредактировать?\n1. Name \n2.Address \n3. Phone \n4. Email \n5. Exit");
            int result = scanner.nextInt();
            switch (result) {
                case 1:
                    System.out.println("Введите новое имя.");
                    String newName = scanner.next();
                    contacts.get(currentPosition).setName(newName);
                    break;
                case 2:
                    System.out.println("Введите новый адрес");
                    String newAddress = scanner.next();
                    contacts.get(currentPosition).setAddress(newAddress);
                    break;
                case 3:
                    System.out.println("Введите новый номер телефона");
                    int newPhoneNumber = scanner.nextInt();
                    contacts.get(currentPosition).setPhone(newPhoneNumber);
                    break;
                case 4:
                    System.out.println("Введите новый e-mail");
                    String newEmail = scanner.next();
                    contacts.get(currentPosition).setEmail(newEmail);
                    break;
                case 5:
                    break vasya;
            }
        }
        System.out.println(contacts.get(currentPosition));

    }

    public void sorting() {
        System.out.println("По какому критерию будем сортировать?\n1. По имени \n2. По адресу \n3. По номеру телефона \n4. По e-mail \n5. По типу");
        int result = scanner.nextInt();
        switch (result) {
            case 1:
                Collections.sort(contacts, new ContactByNameComparator());
                break;
            case 2:
                Collections.sort(contacts, new ContactByAddressComparator());
                break;
            case 3:
                Collections.sort(contacts, new ContactByPhoneNumberComparator());
                break;
            case 4:
                Collections.sort(contacts, new ContactByEmailComparator());
                break;
            case 5:
                Collections.sort(contacts, new ContactByTypeComparator());
                break;
        }
        currentPosition = 0;

    }


}
