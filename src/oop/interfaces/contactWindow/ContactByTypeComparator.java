package oop.interfaces.contactWindow;

import java.util.Comparator;

public class ContactByTypeComparator implements Comparator<ContactI> {

    @Override
    public int compare(ContactI contact1, ContactI contact2){
        return contact1.getType().compareTo(contact2.getType());
    }
}
