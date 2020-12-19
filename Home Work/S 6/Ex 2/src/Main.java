import java.util.*;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Employe employe = new Employe();
        System.out.println("1) Insert employe information");
        System.out.println("2) Delete employe information");
        System.out.print("Enter your choice : ");
        int choice = Integer.parseInt(input.nextLine());
        Connection connect;
        PreparedStatement preparedStatement;
            
        try {  
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        try {
            connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","alirezakazemi","myjava123");
            switch(choice){
                case 1:
                    String s;
                    do{
                    employe.Entry();
                    preparedStatement = connect.prepareStatement("insert into company(id,name,nationalNumber,fatherName,position,"
                            + "salary,workExperience)values(?,?,?,?,?,?,?)");
                    preparedStatement.setLong(1, employe.getId());
                    preparedStatement.setString(2, employe.getName());
                    preparedStatement.setString(3, employe.getNationalNumber());
                    preparedStatement.setString(4, employe.getFatherName());
                    preparedStatement.setString(5, employe.getPosition());
                    preparedStatement.setLong(6, employe.getSalary());
                    preparedStatement.setLong(7, employe.getWorkExperience());
                    preparedStatement.executeUpdate();
                    System.out.println("** insert successfully **");
                    System.out.print("do you want to continue ??? ");
                    s = input.nextLine();
                    }while(s.equals("yes") || s.equals("YES") || s.equals("Yes"));
                    break;
                
                case 2:
                    String s2;
                    boolean check = false;
                    do{
                        System.out.print("Enter the ID you want to delete : ");
                        int id = Integer.parseInt(input.nextLine());
                        preparedStatement = connect.prepareStatement("select id from company");
                        ResultSet resultSet = preparedStatement.executeQuery();
                        while(resultSet.next()){
                            if(id == resultSet.getLong("id")){
                                preparedStatement = connect.prepareStatement("delete from company where id=?");
                                preparedStatement.setLong(1, id);
                                preparedStatement.executeUpdate();
                                System.out.println("** delete successfully **");
                                check = true;
                                break;
                                
                            }
                        }
                        if(check == false){
                            System.out.println("this ID not exist !!");
                        }
                        System.out.print("do you want to continue ??? ");
                        s2 = input.nextLine();
                    }while(s2.equals("yes") || s2.equals("YE") || s2.equals("Yes"));
                    break;
                    
                default:
                    System.out.println("your intered number is INCORRECT !!!");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
