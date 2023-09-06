package ex02;


public class Person {
    public String name;
    public int age;
    public String adress;
    
    public Person(String name){
        this.name = name;
    }
    
    public Person(int age){
        this.age = age;
    }
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public Person(String name, String adress){
        this.name = name;
        this.adress = adress;
    }

    public Person(int age, String adress){
        this.age = age;
        this.adress = adress;
    }
    //full constructor
    public Person(String name, int age, String adress){
        this.name = name;
        this.age = age;
        this.adress = adress;
    }
    
    public void Display_Information(){
        System.out.println("| Name: " + name);
        System.out.println("| Age: " + age);
        System.out.println("| Adress: " + adress);
    }
    
    
}
