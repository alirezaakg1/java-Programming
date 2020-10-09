import java.util.Scanner;

public class Practice3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter two number : ");
        int a = input.nextInt();
        int b = input.nextInt();
        
        System.out.println("\n1) Addition two numbers ");
        System.out.println("2) Subtract two numbers");
        System.out.println("3) Multiply two numbers");
        System.out.println("4) Divide two numbers");
        System.out.println("-----------------------");
        System.out.print("Please Enter your select : ");
        int x = input.nextInt();
        float result = 0;
        
        switch(x)
        {
            case 1 : 
                result = a+b;
                break;
            case 2 :
                if(a > b)
                {
                    result = a-b;
                }
                else
                {
                    result = b-a;
                }
                break;
            case 3 :
                result = a*b;
                break;
            case 4 :
                result = a/b;
                break;
            default:
                System.out.println("Yout number is Incorrect");
        }
        
        System.out.println("\n1Result : "+ result);
    }
    
}
