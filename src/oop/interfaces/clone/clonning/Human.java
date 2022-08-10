package oop.interfaces.clone.clonning;

public class Human implements Cloneable{
    private String name;
    private int age;
    private Contact contact;

    public Human(String name, int age, Contact contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public Human clone(){
        Human newHuman = new Human(name, age, contact);
        return newHuman;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", contact=" + contact +
                '}';
    }
}
