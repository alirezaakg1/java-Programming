import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        
        String name;
        String username;
        String password;
        
        Student user = new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("LOGIN PAGE :\n");
        System.out.print("Enter your name : ");
        name = input.nextLine();
        System.out.print("Enter your username : ");
        username = input.nextLine();
        System.out.print("Enter your password : ");
        password = input.nextLine();
        
        try {
            user.login(name,username,password);
        } catch (exception e) {
            e.printStackTrace();
        }
    }
    
}
