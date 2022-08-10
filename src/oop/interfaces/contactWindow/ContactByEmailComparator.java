package oop.interfaces.contactWindow;

import java.util.Comparator;

public class ContactByEmailComparator implements Comparator<ContactI> {

    @Override
    public int compare(ContactI contact1, ContactI contact2){
        return contact1.getEmail().compareTo(contact2.getEmail());
    }
}
