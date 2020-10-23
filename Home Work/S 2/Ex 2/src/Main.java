import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("1) math1\n2) math2\n3) advanced programming\n4) defferential equation");
        System.out.print("\nEnter your select : ");
        int a = input.nextInt();
        
        switch(a){
            case 1:
                Lesson math1 = new Lesson();
                math1.math1();
                break;
                
            case 2: 
                Lesson math2 = new Lesson();
                math2.math2();
                break;
                
            case 3:
                Lesson advanced = new Lesson();
                advanced.advancedProgramming();
                break;
                
            case 4:
                Lesson equation = new Lesson();
                equation.defferential_equation();
                break;
                
            default:
                System.out.println("the option you entered was incorrect");
                break;
        }
    }
    
}
