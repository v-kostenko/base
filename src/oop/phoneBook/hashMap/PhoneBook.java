package oop.phoneBook.hashMap;

import oop.phoneBook.contactArray.Contact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    private HashMap<Long, Contact> map = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    PhoneBook() {
        map.put(380660051447l, new Contact("Bob", "Parkinson", 380660051447l, "New York", "bob@test.com"));
        map.put(380996651447l, new Contact("Jhon", "Erikson", 380996651447l, "Los Angeles", "jhon@test.com"));

        menu();
    }

    public void menu() {
        System.out.println("Выберите опцию. \n1. Добавить контакт \n2. Delete contact \n3. Update contact \n4. FindContact");
        int option = scanner.nextInt();

        switch (option) {
            case 1 -> addContact();
            case 2 -> deleteContact();
            case 3 -> updateContact();
            case 4 -> findContact();
        }
        menu();
    }

    private void deleteContact() {
        System.out.println("Введите имя или фамилию");
        String nameSurname = scanner.next();

        ArrayList<Contact> arrayList = new ArrayList<>(map.values());

        boolean isFound = false;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().equals(nameSurname) || arrayList.get(i).getSurname().equals(nameSurname)) {
                System.out.println("Индекс" + i);
                arrayList.get(i).getInfo();
                isFound = true;
            }
        }

        System.out.println("Какой контакт удатить?");
        int numberForDelete = scanner.nextInt();
        arrayList.remove(numberForDelete);

        if (isFound == true) {
            System.out.println("Контакт удален");
        } else {
            System.out.println("Такого контакта нет в телефоной книге");
        }

    }

    private void addContact() {
        System.out.println("Добавить новый контакт. Введи номер телефона в формате 380 ХХХ ХХ ХХ");
        long newPhone = scanner.nextLong();

        if (map.containsKey(newPhone)) {
            System.out.println("Такой номер уже существует");
            return;
        }

        Contact contact = new Contact(newPhone);

        if (map.put(newPhone, contact) == null) {
            System.out.println("Контакт добавлен");
        } else {
            System.out.println("Контакт не добавлен");
        }

    }

    private void updateContact() {
        System.out.println("Какой контакт обновить? Введите имя или фамилию");
        String nameSurname = scanner.next();

        ArrayList<Contact> arrayList = new ArrayList<>(map.values());

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getName().equals(nameSurname) ||
                    arrayList.get(i).getSurname().equals(nameSurname)) {
                System.out.println("Индекс " + i);
                arrayList.get(i).getInfo();
            }
        }

        System.out.println("Под каким индексом обновить контакт?");
        int index = scanner.nextInt();

        Contact selected = arrayList.get(index);

        updateMenu(selected);

    }

    private void findContact() {
        System.out.println("По какому критерию найти. Выбрать цифру? \n1. Name \n2. Surname \n3. Phone Number");
        int var = scanner.nextInt();

        switch (var) {
            case 1:
                System.out.println("Введите имя");
                String name = scanner.next();
                for (Contact contact : map.values()) {
                    if (name.equals(contact.getName())) {
                        System.out.println("Контакт найден");
                        contact.getInfo();
                        return;
                    }
                }
                System.out.println("Контакт не найден");
                break;
            case 2:
                System.out.println("Введите фамилию");
                String surname = scanner.next();
                for (Contact contact : map.values()
                ) {
                    if (surname.equals(contact.getSurname())) {
                        System.out.println("Контакт найден");
                        contact.getInfo();
                        return;
                    }
                }
                System.out.println("Контакт не найден");
                break;
            case 3:
                System.out.println("Введите номер телефона");
                long phoneNumber = scanner.nextLong();
                for (Contact contact : map.values()
                ) {
                    if (phoneNumber == contact.getPhoneNumber()) {
                        System.out.println("Контакт найден");
                        contact.getInfo();
                        return;
                    }
                }
                System.out.println("Контакт не найден");
        }
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
