package oop.interfaces.contactWindow;

import java.util.Comparator;

public class ContactByAddressComparator implements Comparator<ContactI> {

    @Override
    public int compare(ContactI contact1, ContactI contact2){
        return contact1.getAddress().compareTo(contact2.getAddress());
    }
}
