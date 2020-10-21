import java.util.*;

public class Detail {
    
    String[] name = new String[2];
    String[] family = new String[2];
    int[] age = new int[2];
    
    public void getdetail(){
        Scanner input = new Scanner(System.in);
        System.out.println("Number 1 :");
        System.out.print("Enter your name : ");
        name[0] = input.nextLine();
        System.out.print("Enter your family name : ");
        family[0] = input.nextLine();
        System.out.print("Enter your age : ");
        age[0] = Integer.parseInt(input.nextLine());
        

        System.out.println("\nNumber 2 :");
        System.out.print("Enter your name : ");
        name[1] = input.nextLine();
        System.out.print("Enter your family name : ");
        family[1] = input.nextLine();
        System.out.print("Enter your age : ");
        age[1] = Integer.parseInt(input.nextLine());
    }
    

    public void check() throws exception{
        
        if((age[0] == age[1]) && (name[0].equals(name[1])) && (family[0].equals(family[1]))){
            throw new exception();    
        }
        
        else{
            System.out.println("\n\nUsers information was successfully registered.");
        }
    }
}
