import java.util.*;

public class Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Square : ");
        System.out.print("Width = ");
        float a1 = input.nextFloat();
        System.out.print("Length = ");
        float a2 = input.nextFloat();
        System.out.println("--------------------");
        System.out.println("Rectangle : ");
        System.out.print("Width = ");
        float b1 = input.nextFloat();
        System.out.print("Length = ");
        float b2 = input.nextFloat();
        System.out.println("--------------------");
        
        Area sq = new Area();
        Environment sq2 = new Environment();
        System.out.println("Square Area = " + sq.square(a1, a2));
        System.out.println("Square Environment = " + sq2.square(a1, a2));
        Area rec = new Area();
        Environment rec2 = new Environment();
        System.out.println("\nRectangle Area = " + rec.rectangle(b1, b2));
        System.out.println("Rectangle Environment = " + rec2.reqtangle(b1, b2));
    }
    
}
