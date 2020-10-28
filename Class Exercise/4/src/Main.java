import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Get_Detail s1 = new Get_Detail();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your Name : ");
        s1.setName(input.nextLine());
        System.out.print("Enter your Family : ");
        s1.setFamily(input.nextLine());
        System.out.print("Enter your Age : ");
        s1.setAge(Integer.parseInt(input.nextLine()));
        System.out.print("Enter your Pass : ");
        s1.setPass(input.nextLine());
        System.out.print("Enter your UserName : ");
        s1.setUsername(input.nextLine());
        System.out.print("Enter your Job : ");
        s1.setJob(input.nextLine());
        
        s1.information();
    }
    
}
