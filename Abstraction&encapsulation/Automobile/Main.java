package Automobile;


public class Main {
    
    
    public static void main(String[] args){
   
        Vehicle generic = new Cars("Honda",null,2017);
        
        
        System.out.println("-=-=-=-=-=-=-=-=-=-");
        System.out.println("  >>> VEHICLE <<<  ");
        System.out.println("| Brand: " + generic.getBrand());
        System.out.println("| Model: " + generic.getModel());
        System.out.println("| Year: " + generic.getYear());
        System.out.println("-=-=-=-=-=-=-=-=-=-");
       
        
    }
    
}
