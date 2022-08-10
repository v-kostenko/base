package oop.interfaces.clone.clonning;

public class Main {
    public static void main(String[] args) {
        Contact contactBob = new Contact("New York", "Street", 993332211);
        Human humanOriginal = new Human("Bob", 47, contactBob);

        Human humanCopy = humanOriginal.clone();

        System.out.println(humanOriginal);
        System.out.println(humanCopy);

        System.out.println();
        humanOriginal.setName("Bob Edited Name");
        Contact contact = new Contact("New", "New", 111111);
        humanOriginal.setContact(contact);

        System.out.println(humanOriginal);
        System.out.println(humanCopy);



    }
}
