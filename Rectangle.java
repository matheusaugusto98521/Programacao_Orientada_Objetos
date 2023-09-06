package ex03;


public class Rectangle implements Geometric_Form{
    public double width;
    public double length;
    
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    
    @Override
    
    public double Calculate_Area(){
        return width * length;
    }
    
}
