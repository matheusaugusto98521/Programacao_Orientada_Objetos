package ex01;


public class P_o_o {

 
    public static void main(String[] args) {
        Calculator sum = new Calculator();
        Calculator multiplication = new Calculator();
        Calculator division = new Calculator();
        Calculator subtraction = new Calculator();
        
        int sum_i = sum.Sum(5, 8);
        double sum_d = sum.Sum(5.5, 5);
        
        int mult_i = multiplication.Multiplication(5, 8);
        double mult_d = multiplication.Multiplication(5.5, 5);
        
        int div_i = division.Division(5, 8);
        double div_d = division.Division(5.5, 5);
        
        int sub_i = subtraction.Subtraction(5, 8);
        double sub_d = subtraction.Subtraction(5.5, 5);
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("| Sum with whole numbers : " + sum_i);
        System.out.println("| Sum with real numbers: " + sum_d);
        System.out.println("     -=-=-=-=-      ");
        System.out.println("| Multiplication with whole numbers : " + mult_i);
        System.out.println("| Multiplication with real numbers: " + mult_d);
        System.out.println("     -=-=-=-=-      ");
        System.out.println("| Division with whole numbers : " + div_i);
        System.out.println("| Division with real numbers: " + div_d);
        System.out.println("     -=-=-=-=-      ");
        System.out.println("| Subtraction with whole numbers : " + sub_i);
        System.out.println("| Subtraction with real numbers: " + sub_d);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    }
    
}
