package ContactBook2;

import java.util.List;
import java.util.ArrayList;

public class ContactsList{
    private List<ContactB> contacts;
    public ContactsList(){
        contacts = new ArrayList();
    }
    
    public void addContact(ContactB contact){
        contacts.add(contact);
    }
    
    public void removeContact(ContactB contact){
        contacts.remove(contact);
    }
    
    public void listContacts(){
        for(ContactB contact : contacts){
            contact.displayContact();
        }
    }

    public List<ContactB> getContacts() {
        return contacts;
    }

    public void setContacts(List<ContactB> contacts) {
        this.contacts = contacts;
    }
    
    
    
}
