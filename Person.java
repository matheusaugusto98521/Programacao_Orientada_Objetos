package e_s_ll;


public class Person {
    public String name;
    public int age;
    private int CPF;
    private int RG;
    private int CDT;
    public String type_person;

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public int getCDT() {
        return CDT;
    }

    public void setCDT(int CDT) {
        this.CDT = CDT;
    }
    
    public void Receive_Payment(String type_person, double wage){
        if (type_person == "Functionary"){
            wage = wage + (wage * 0.125);
        }
        if (type_person == "Teatcher"){
            wage = wage + (wage * 0.10);
        }
        if (type_person == "Seller"){
            wage = wage + (wage * 0.075);
        }
        System.out.println("| " + type_person + " receive with add R$ " + wage);
    }
    
    
    
}
