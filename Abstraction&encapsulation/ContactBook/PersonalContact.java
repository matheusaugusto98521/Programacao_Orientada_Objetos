package ContactBook2;


public class PersonalContact extends ContactB{
    
    public PersonalContact(String name, int phone, String email){
        super(name, phone, email);
        if((name == null || email == null) || phone == 0){
            throw new RuntimeException(">>> Invalid information <<<");
        }
    }
    
    @Override
    public void displayContact(){
        System.out.println("| Name: " + getName());
        System.out.println("| E-mail: " + getEmail());
        System.out.println("| Phone: " + getPhone());
    }
    
}
