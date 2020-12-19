
import java.sql.*;
import java.util.*;



public class Main {

    public static void main(String[] args) {
        
        User user = new User();
        Scanner input = new Scanner(System.in);
        boolean check = true;
        System.out.println("1) Insert");
        System.out.println("2) Update");
        System.out.print("Enter your choice : ");
        int choice = Integer.parseInt(input.nextLine());
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        try {
            Connection connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","alirezakazemi","myjava123");
            switch(choice){
                case 1:
                    while(check){
                        user.Entry();
                        PreparedStatement preparedStatement = connect.prepareStatement("insert into detail (id,name,userName,email,password,age,"
                                + "education)values(?,?,?,?,?,?,?)");
                        preparedStatement.setLong(1, user.getId());
                        preparedStatement.setString(2, user.getName());
                        preparedStatement.setString(3, user.getUserName());
                        preparedStatement.setString(4, user.getEmail());
                        preparedStatement.setString(5, user.getPassword());
                        preparedStatement.setLong(6, user.getAge());
                        preparedStatement.setString(7, user.getEducation());
                        preparedStatement.executeUpdate();
                        System.out.println("** Insert successfully **");
                        System.out.print("do you want to continue ?? ");
                        String s = input.nextLine();
                        if(s.equals("yes") || s.equals("YES") || s.equals("Yes"))
                            check = true;
                        else
                            check = false;
                    } // end of while
                    break;
                case 2:
                    check = true;
                    boolean t = false;
                    while(check){
                        System.out.print("Enter ID you want to update : ");
                        int checkId = Integer.parseInt(input.nextLine());
                        PreparedStatement preparedStatement = connect.prepareStatement("select id from detail");
                        ResultSet resultSet = preparedStatement.executeQuery();
                        while(resultSet.next()){
                            if(checkId == resultSet.getLong("id")){
                                user.Entry();
                                preparedStatement = connect.prepareStatement("update detail set id=?,name=?,userName=?,email=?,password=?,age=?,"
                                        + "education=?");
                                preparedStatement.setLong(1, user.getId());
                                preparedStatement.setString(2, user.getName());
                                preparedStatement.setString(3, user.getUserName());
                                preparedStatement.setString(4, user.getEmail());
                                preparedStatement.setString(5, user.getPassword());
                                preparedStatement.setLong(6, user.getAge());
                                preparedStatement.setString(7, user.getEducation());
                                System.out.println("** Update successfully **");
                                preparedStatement.executeUpdate();
                                t = true;
                                break;
                            }
                        }  // end of while(resultSet)
                        if(t == false){
                            System.out.println("this ID does not exist");
                        }
                        System.out.print("do you want to continue ?? ");
                        String s = input.nextLine();
                        if(s.equals("yes") || s.equals("YES") || s.equals("Yes"))
                            check = true;
                        else
                            check = false;

                    } //end of while(check)
                    break;
                default:
                    System.out.println("the number entered is INCORRECT !!!");
            } // end of switch
  
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
