package e_s_ll;


public class E_S_ll {

  
    public static void main(String[] args) {
        Person functionary = new Person();
        Person teatcher = new Person();
        Person seller = new Person();
        
        
        functionary.name = "Matheus";
        functionary.age = 20;
        functionary.setCPF(587987187);
        functionary.setRG(587316457);
        functionary.setCDT(84576);
        functionary.type_person = "Functionary";
        
        teatcher.name = "Matheus";
        teatcher.age = 20;
        teatcher.setCPF(587984456);
        teatcher.setRG(587345865);
        teatcher.setCDT(87564);
        teatcher.type_person = "Teatcher";
        
        seller.name = "Matheus";
        seller.age = 20;
        seller.setCPF(456387920);
        seller.setRG(234687239);
        seller.setCDT(88976);
        seller.type_person = "Seller";
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("| Name: " + functionary.name);
        System.out.println("| Age: " + functionary.age);
        System.out.println("| Office: " + functionary.type_person);
        System.out.println("| CPF: " + functionary.getCPF());
        System.out.println("| RG: " + functionary.getRG());
        System.out.println("| CDT: " + functionary.getCDT());
        functionary.Receive_Payment(functionary.type_person, 1000);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("| Name: " + teatcher.name);
        System.out.println("| Age: " + teatcher.age);
        System.out.println("| Office: " + teatcher.type_person);
        System.out.println("| CPF: " + teatcher.getCPF());
        System.out.println("| RG: " + teatcher.getRG());
        System.out.println("| CDT: " + teatcher.getCDT());
        teatcher.Receive_Payment(teatcher.type_person, 1000);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("| Name: " + seller.name);
        System.out.println("| Age: " + seller.age);
        System.out.println("| Office: " + seller.type_person);
        System.out.println("| CPF: " + seller.getCPF());
        System.out.println("| RG: " + seller.getRG());
        System.out.println("| CDT: " + seller.getCDT());
        seller.Receive_Payment(seller.type_person, 1000);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        
    }
    
}
