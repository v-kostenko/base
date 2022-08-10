package oop.phoneBook.contactList;

import oop.phoneBook.contactArray.Contact;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookList {
    private ArrayList<Contact> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public PhoneBookList() {
        Contact contact = new Contact("Bob", "Parkinson", 380660051447l, "New York", "bob@test.com");
        contacts.add(contact);
        contacts.add(new Contact("Jhon", "Erikson", 380996651447l, "Los Angeles", "jhon@test.com"));
        menu();
    }


    public void menu() {
        System.out.println("Выберите опцию. \n1. Добавить контакт \n2. Delete contact \n3. Update contact");
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> addContact();
            case 2 -> deleteContact();
            case 3 -> updateContact();
        }
        menu();
    }

    private void addContact() {
        System.out.println("Добавить новый контакт. Введи номер телефона в формате 380 ХХХ ХХ ХХ");
        long newPhone = scanner.nextLong();

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i) != null && newPhone == contacts.get(i).getPhoneNumber()) {
                System.out.println("Такой номер уже существует");
                return;
            }
        }
        Contact contact = new Contact(newPhone);
        contacts.add(contact);
    }

    private void deleteContact() {
        System.out.println("Введите имя или фамилию");
        String nameSurname = scanner.next();
        boolean isFound = false;

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i) != null && (contacts.get(i).getSurname().equals(nameSurname) || contacts.get(i).getName().equals(nameSurname))) {
                System.out.print(i + " ");
                contacts.get(i).getInfo();
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Такого контакта нет в телефоной книге");
            return;
        }

        System.out.println("Какой контакт удатить?");
        int numberForDelete = scanner.nextInt();
        contacts.remove(numberForDelete);

        System.out.println("Контакт удален");
    }

    private void updateContact() {
        System.out.println("Какой контакт обновить? Введите имя или фамилию");
        String nameSurname = scanner.next();

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i) != null && (contacts.get(i).getSurname().equals(nameSurname) || contacts.get(i).getName().equals(nameSurname))) {
                System.out.print("Индекс " + i);
                contacts.get(i).getInfo();
            }
        }

        System.out.println("Под каким номером обновить контакт?");
        int number = scanner.nextInt();
        Contact selected = contacts.set(number, contacts.get(number));

        updateMenu(selected);
    }

    private void updateMenu(Contact contact) {
        for (; ; ) {
            System.out.println("Что меняем? \n1.Имя \n2.Фамилия \n3.Номер телефона \n4. Адрес \n5. e-mail \n6.Закончить редактирование");
            int whatShouldBeUpdate = scanner.nextInt();

            switch (whatShouldBeUpdate) {
                case 1:
                    System.out.println("Введи новое имя");
                    String newName = scanner.next();
                    contact.setName(newName);
                    break;
                case 2:
                    System.out.println("Введи новую фамилию");
                    String newSurname = scanner.next();
                    contact.setSurname(newSurname);
                    break;
                case 3:
                    System.out.println("Введи новый номер телефона");
                    Long newPhoneNumber = scanner.nextLong();
                    contact.setPhoneNumber(newPhoneNumber);
                    break;
                case 4:
                    System.out.println("Введи новый адрес");
                    String newAddress = scanner.next();
                    contact.setAddress(newAddress);
                    break;
                case 5:
                    System.out.println("Введи новый e-mail");
                    String newEmail = scanner.next();
                    contact.setEmail(newEmail);
                    break;
                case 6:
                    return;
            }
        }


    }
}





