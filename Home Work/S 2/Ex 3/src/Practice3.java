import java.util.*;

public class Practice3 {

    public static void main(String[] args) {
        A x1 = new A();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = input.nextInt();
                
        x1.isEven(a);
        x1.isOdd(a);
        x1.isPosetive(a);
        x1.isNegative(a);
        x1.isZero(a);
    }
    
}
