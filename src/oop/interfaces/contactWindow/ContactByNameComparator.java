package oop.interfaces.contactWindow;

import java.util.Comparator;

public class ContactByNameComparator implements Comparator<ContactI> {

    @Override
    public int compare(ContactI contact1, ContactI contact2){
        return contact1.getName().compareTo(contact2.getName());
    }
}
