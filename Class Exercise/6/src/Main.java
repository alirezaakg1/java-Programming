
import java.sql.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws SQLException {
        
            Scanner input = new Scanner(System.in);
            User user = new User();
            System.out.println("1) sign up");
            System.out.println("2) sign in");
            System.out.print("Enter your choice : ");
            int ch = Integer.parseInt(input.nextLine());
            PreparedStatement preparedStatement;
            Connection connection = null;
            
        try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "alirezakazemi","myjava123");
            connection.setAutoCommit(false);
            
        } catch(Exception e){
            e.printStackTrace();
        } 
            switch(ch){
                case 1:
                    System.out.print("Enter your Name : ");
                    user.setName(input.nextLine());
                    System.out.print("Enter your UserName : ");
                    user.setUserName(input.nextLine());
                    System.out.print("Enter your PassWord : ");
                    user.setPassword(input.nextLine());
                    System.out.print("Enter your Email : ");
                    user.setEmail(input.nextLine());
                    preparedStatement = connection.prepareStatement("insert into person(name,userName,passWord,email)"
                            + "values(?,?,?,?)");
                    preparedStatement.setString(1,user.getName());
                    preparedStatement.setString(2,user.getUserName());
                    preparedStatement.setString(3,user.getPassword());
                    preparedStatement.setString(4,user.getEmail());
                    connection.commit();
                    System.out.println("--- Sign up successfully ---");
                    break;
                    
                case 2:
                    String DBuserName;
                    String DBpassWord;
                    int temp = 0;
                    connection.setAutoCommit(false);
                    System.out.print("Enter your UserName : ");
                    user.setName(input.nextLine());
                    System.out.print("Enter your PassWord : ");
                    user.setPassword(input.nextLine());
                    
                    preparedStatement = connection.prepareStatement("select * from person");
                    ResultSet resultSet = preparedStatement.executeQuery();
                    while(resultSet.next()){
                        DBuserName = resultSet.getString("userName");
                        DBpassWord = resultSet.getString("passWord");
                        if(user.getUserName().equals(DBuserName) && user.getUserName() != null){
                            if(user.getPassword().equals(DBpassWord) && user.getPassword() != null){
                                temp = 1;
                            }
                        }
                    }
                
                    if(temp == 0)
                        System.out.println("UserName or PassWord INCORRECT !!");
                    else
                        System.out.println("-- Sign in successfully --");
                    break;
                
                default :
                    System.out.println("Invalid Number !!");
                    break;
            } //end of switch

    }
    
}
