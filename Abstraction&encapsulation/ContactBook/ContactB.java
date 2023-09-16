package ContactBook2;


public abstract class ContactB{
    private String name;
    private int phone;
    private String email;
    
    public ContactB(String name, int phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
        
        
        
    }
    
    public abstract void displayContact();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
