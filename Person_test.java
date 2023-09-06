package ex02;


public class Person_test {
    
    public static void main(String[] args){
        Person person1 = new Person("Matheus");
        Person person2 = new Person(20);
        Person person3 = new Person("Matheus", 20);
        Person person4 = new Person("Matheus", "Rua Belmiro Romao");
        Person person5 = new Person(20, "Rua Belmiro Romao");
        Person person6 = new Person("Matheus", 20, "Rua Belmiro Romao");
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        person1.Display_Information();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        person2.Display_Information();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        person3.Display_Information();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        person4.Display_Information();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        person5.Display_Information();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        person6.Display_Information();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
    
}
