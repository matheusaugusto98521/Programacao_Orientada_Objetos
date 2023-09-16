package ContactBook2;



public class Main {
    
    public static void main(String[] args){
        
        PersonalContact contact1 = new PersonalContact("Matheus", 9966453, "matheusferreirasoares1234@gmail.com");
        PersonalContact contact2 = new PersonalContact("Regina", 9986453, "reginaud8e@gmail.com");
        PersonalContact contact3 = new PersonalContact("Marcelo", 9965953, "marcelomarques@gmail.com");
        
        ContactsList list = new ContactsList();
        
        try{
            list.addContact(contact1);
            list.addContact(contact2);
            list.addContact(contact3);

            System.out.println("-=-=-=-=-= Contacts =-=-=-=-=-");
            list.listContacts();
                
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            
            list.removeContact(contact1);
            
            System.out.println("-=-=-=-=-= Contacts Update =-=-=-=-=-");
            
            list.listContacts();
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            }
            
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }


    }
    
}
