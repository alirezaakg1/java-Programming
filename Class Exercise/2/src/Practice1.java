import java.util.*;

public class Practice1 {

    public static void main(String[] args) {
        float a;
        float b;
        
        calculator x1 = new calculator();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        a = input.nextFloat();
        System.out.print("Enter second number : ");
        b = input.nextFloat();
        
        System.out.println("\n"+a+" + "+b+" = "+x1.addition(a,b));  
        System.out.println(a+" - "+b+" = "+x1.subtract(a,b));  
        System.out.println(a+" + "+b+" = "+x1.multiply(a,b));  
        System.out.println(a+" + "+b+" = "+x1.divide(a,b));  
    }
    
}
