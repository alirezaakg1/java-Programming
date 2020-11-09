import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your User Name : ");
        String userName = input.nextLine();
        System.out.print("Enter your Real Name : ");
        String realName = input.nextLine();
        System.out.print("Enter your password : ");
        String password = input.nextLine();
        System.out.print("Enter your Age : ");
        int age = Integer.parseInt(input.nextLine());
        System.out.print("Enter your Home Address : ");
        String address = input.nextLine();
        System.out.print("Enter your Phone Number : ");
        String phoneNumber = input.nextLine();
        System.out.print("Enter your Education : ");
        String education = input.nextLine();
        
        Builder user = new Builder().setUserName(userName).setRealName(realName).setPassword(password).setAge(age).setAddress(address).setPhoneNumber(phoneNumber).setEducation(education);
        
        System.out.println("--------------------------");
        System.out.println("User Name : " + user.getUserName());
        System.out.println("Real Name : " + user.getRealName());
        System.out.println("Password : " + user.getPassword());
        System.out.println("Age : " + user.getAge());
        System.out.println("Address : " + user.getAddress());
        System.out.println("Phone Number : " + user.getPhoneNumber());
        System.out.println("Education : " + user.getEducation());
    }   
    
}
