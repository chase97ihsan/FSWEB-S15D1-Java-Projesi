import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContatct(Contact contact) {
        if (!myContacts.contains(contact)) {
            myContacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean addUpdateContact(Contact contact1, Contact contact2) {
        if (myContacts.contains(contact1)) {
            contact1.setName(contact2.getName());
            contact1.setPhoneNumber(contact2.getPhoneNumber());
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {

        if (myContacts.contains(contact)) {
            myContacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }

    public int findContact(Contact contact) {
        if (myContacts.contains(contact)) {
            return myContacts.indexOf(contact);
        } else {
            return -1;
        }
    }

    public int findContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(name)) {
                return myContacts.indexOf(name);
            }
        }
        return -1;
    }


    public Contact queryContact(String contactName) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(contactName)) {
                return contact;
            }
        }
        return null;
    }

    public void printContact() {
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(i + "." + myContacts.get(i));

        }
    }
}
