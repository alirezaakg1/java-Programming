package Ex2;
import java.util.*;

public class UserInformation {
    
    private String name;
    private String email;
    private String pass;
    
    private static UserInformation userInformation;
    
    private UserInformation(){}
    
    public synchronized static UserInformation getInstance(){
        if(userInformation == null){
            userInformation = new UserInformation();
        }
        
        return userInformation;
    }
    
    public void Detail(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        name = input.nextLine();
        System.out.print("Enter your Email : ");
        email = input.nextLine();
        System.out.print("Enter your password : ");
        pass = input.nextLine();
        System.out.println("--------------------------");
        System.out.println("User information : ");
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Password : " + pass);
    }
}
