import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        User<String,String,String> user1 = new User<>();
        System.out.print("Enter your username : ");
        user1.setUserName(input.nextLine());
        System.out.print("Enter your email : ");
        user1.setGmail(input.nextLine());
        System.out.print("Enter your password : ");
        user1.setPass(input.nextLine());
        
        User<String,String,String> user2 =  null;
        User<String,String,String> user3 = null;
        User<String,String,String> user4 = null;
        try{
            user2 = (User) user1.clone();
            user3 = (User) user1.clone();
            user4 = (User) user1.clone();
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
            System.out.println("Clone Not Supported...!");
        }
        
        
        System.out.println("user (1) information : \n");
        System.out.println("User Name : " + user1.getUserName());
        System.out.println("Gmail : " + user1.getGmail());
        System.out.println("PassWord : " + user1.getPass());
        System.out.println("-----------------------------------");
        System.out.println("user (2) information : \n");
        System.out.println("User Name : " + user2.getUserName());
        System.out.println("Gmail : " + user2.getGmail());
        System.out.println("PassWord : " + user2.getPass());
        System.out.println("-----------------------------------");
        System.out.println("user (3) information : \n");
        System.out.println("User Name : " + user3.getUserName());
        System.out.println("Gmail : " + user3.getGmail());
        System.out.println("PassWord : " + user3.getPass());
        System.out.println("-----------------------------------");
        System.out.println("user (4) information : \n");
        System.out.println("User Name : " + user4.getUserName());
        System.out.println("Gmail : " + user4.getGmail());
        System.out.println("PassWord : " + user4.getPass());
        System.out.println("-----------------------------------");
        
    }
}
