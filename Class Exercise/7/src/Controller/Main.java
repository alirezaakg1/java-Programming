package Controller;

import Model.Entity.UserEntity;
import Model.Service.UserServ;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("1) SignUp");
        System.out.println("2) SignIn");
        System.out.print("Enter your choice : ");
        int choice = Integer.parseInt(input.nextLine());
        
        switch(choice){
            case 1:
                String name,pass,userName,email;
                System.out.println("Enter your information : ");
                System.out.print("Name : ");
                name = input.nextLine();
                System.out.print("Pass : ");
                pass = input.nextLine();
                System.out.print("UserName : ");
                userName = input.nextLine();
                System.out.print("Email : ");
                email = input.nextLine();
                try{
                    UserServ.getInstance().singUp(new UserEntity().setName(name).setPass(pass).setUserName(userName).setEmail(email));
                    System.out.println("SignUp was successfully");
                } catch(Exception e){
                    System.out.println("Fail to SignUp!");
                    e.printStackTrace();
                }
                break;
                
            case 2:
                boolean i = false;
                System.out.print("UserName : ");
                userName = input.nextLine();
                System.out.print("Password : ");
                pass = input.nextLine();
                try{
                    List<UserEntity> userList = UserServ.getInstance().signIn();
                    for(UserEntity userEntity : userList){
                        if(userEntity.getUserName().equals(userName) && userEntity.getPass().equals(pass)){
                            i = true;
                            break;
                        }
                    }
                    if(i == true){
                        System.out.println("SignIn was successfully");
                    } else{
                        System.out.println("userName or password is invalid");
                    }
                   
                }catch(Exception e){
                    System.out.println("Fail to SignIn!");
                    e.printStackTrace();
                }
                break;
            
            default : 
                System.out.println("your choice is INCORRECT!!");
                }
                
    }
    
}
