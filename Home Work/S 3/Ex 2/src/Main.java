import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        quadratic_equation qz = new quadratic_equation();
        float a,b,c;
        
        System.out.format("aX%c + bX + c = 0\n",178);
        System.out.print("Enter a : ");
        a = input.nextFloat();
        System.out.print("Enter b : ");
        b = input.nextFloat();
        System.out.print("Enter c : ");
        c = input.nextFloat();
        System.out.println("---------------");
        System.out.format("%.1fX%c + %.1fX + %.1f = 0\n",a,178,b,c);
        try {
            qz.answer(a, b, c);
        } catch (exception e) {
            e.printStackTrace();
        }
        
    }
    
}
