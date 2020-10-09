import java.util.*;

public class Practice3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f\n");
        System.out.print("a : ");
        int a = input.nextInt();
        System.out.print("b : ");
        int b = input.nextInt();
        System.out.print("c : ");
        int c = input.nextInt();
        System.out.print("d : ");
        int d = input.nextInt();
        System.out.print("e : ");
        int e = input.nextInt();
        System.out.print("f : ");
        int f = input.nextInt();
        System.out.println("\n"+a+"x + "+b+"y = "+e);
        System.out.println(c+"x + "+d+"y = "+f);
        System.out.println("---------------------");
        
        int x = ((e*d) - (b*f)) / ((a*d) - (b*c));
        int y = ((a*f) - (e*c)) / ((a*d) - (b*c));
        
        if((a/c) != (d/b)){
            System.out.println(" X = "+ x);
            System.out.println(" Y = "+ y);
        }
        
        else{
           System.out.println("This equation has no answer.");
        }
    }
    
}
