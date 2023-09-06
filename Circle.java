package ex03;



public class Circle implements Geometric_Form{
    public double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double Calculate_Area(){
        return 3.14 * (radius*radius);
    }
            
    
}
