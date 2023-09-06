package ex03;


public class teste {
    
    public static void main(String[] args){
        Geometric_Form circle = new Circle(15.5);
        Geometric_Form rectangle = new Rectangle(8.8, 4.3);
        
        double res1 = circle.Calculate_Area();
        double res2 = rectangle.Calculate_Area();
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("| Circle Area: " + res1);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("| Rectangle Area: " + res2);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
    
}
