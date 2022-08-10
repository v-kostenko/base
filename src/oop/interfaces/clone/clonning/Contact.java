package oop.interfaces.clone.clonning;

public class Contact implements Cloneable{
    private String sity;
    private String street;
    private int phone;

    public Contact(String sity, String street, int phone){
        this.sity = sity;
        this.street = street;
        this.phone = phone;
    }

    public Contact copy(){
        Contact newContact = new Contact(sity, street, phone);
        return newContact;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "sity='" + sity + '\'' +
                ", street='" + street + '\'' +
                ", phone=" + phone +
                '}';
    }
}
