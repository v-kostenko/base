package oop.interfaces.contactWindow;

import java.util.Comparator;

public class ContactByPhoneNumberComparator implements Comparator<ContactI> {

    @Override
    public int compare(ContactI contact1, ContactI contact2){
        return contact1.getPhone() - contact2.getPhone();
    }
}
