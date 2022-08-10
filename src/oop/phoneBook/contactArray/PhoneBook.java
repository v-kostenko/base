package oop.phoneBook.contactArray;

import oop.phoneBook.contactArray.Contact;

import java.util.Scanner;

public class PhoneBook {
    private Contact[] contacts = new Contact[7];
    private int freeIndex = 2;
    Scanner scanner = new Scanner(System.in);

    PhoneBook() {
        contacts[0] = new Contact("Bob", "Parkinson", 380660051447l, "New York", "bob@test.com");
        contacts[1] = new Contact("Jhon", "Erikson", 380996651447l, "Los Angeles", "jhon@test.com");
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

    private void deleteContact() {
        System.out.println("Введите имя или фамилию");
        String nameSurname = scanner.next();

        for (int i = 0; i < contacts.length; i++) {

            if (contacts[i] != null && (contacts[i].getSurname().equals(nameSurname) || contacts[i].getName().equals(nameSurname))) {
                System.out.print(i);
                contacts[i].getInfo();

                System.out.println("Какой контакт удатить?");
                int numberForDelete = scanner.nextInt();
                System.arraycopy(contacts, numberForDelete + 1, contacts, numberForDelete, freeIndex - numberForDelete - 1);
                freeIndex--;
                if (contacts.length - freeIndex > 3) {
                    Contact[] shorterArray = new Contact[freeIndex + 3];

                    System.arraycopy(contacts, 0, shorterArray, 0, freeIndex);
                    contacts = shorterArray;
                }

                System.out.println("Контакт удален");
                return;
            }

        }
        System.out.println("Такого контакта нет в телефоной книге");

    }

    private void addContact() {
        System.out.println("Добавить новый контакт. Введи номер телефона в формате 380 ХХХ ХХ ХХ");
        long newPhone = scanner.nextLong();

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && newPhone == contacts[i].getPhoneNumber()) {
                System.out.println("Такой номер уже существует");
                return;
            }
        }

        Contact contact = new Contact(newPhone);

        contacts[freeIndex++] = contact;
        if (freeIndex == contacts.length) {
            Contact[] newContact = new Contact[contacts.length + 3];
            System.arraycopy(contacts, 0, newContact, 0, contacts.length);
            contacts = newContact;
        }
    }

    private void updateContact(){
        System.out.println("Какой контакт обновить? Введите имя или фамилию");
        String nameSurname = scanner.next();

        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null && (contacts[i].getSurname().equals(nameSurname) || contacts[i].getName().equals(nameSurname))) {
                System.out.print("Индекс" + i);
                contacts[i].getInfo();
            }
        }

        System.out.println("Под каким номером удалить контакт?");
        int number = scanner.nextInt();
        Contact selected = contacts[number];

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
