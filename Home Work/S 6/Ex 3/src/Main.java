import java.util.*;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        
        Student student = new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("1) Insert student information");
        System.out.println("2) Update student information");
        System.out.println("3) Delete student infromation");
        System.out.print("Enter you choice : ");
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
                    String s1;
                    do{
                    student.Entry();
                    preparedStatement = connect.prepareStatement("insert into student(code,name,yearOfEntry,average)values(?,?,?,?)");
                    preparedStatement.setString(1, student.getcode());
                    preparedStatement.setString(2, student.getName());
                    preparedStatement.setLong(3, student.getYearOfEntry());
                    preparedStatement.setLong(4, (long) student.getAverage());
                    preparedStatement.executeUpdate();
                    System.out.println("** Insert successfully **");
                        System.out.print("Do you want to continue ? ");
                        s1 = input.nextLine();
                    }while(s1.equals("yes") || s1.equals("Yes") || s1.equals("YES"));
                    break;
                    // end of case 1
                    
                case 2:
                    boolean check = false;
                    String s2;
                    do{
                        System.out.print("Enter CODE you want update : ");
                        String code = input.nextLine();
                        preparedStatement = connect.prepareStatement("select code from student");
                        ResultSet resultSet = preparedStatement.executeQuery();
                        while(resultSet.next()){
                            if(resultSet.getString("code").equals(code)){
                                student.Entry();
                                preparedStatement = connect.prepareStatement("update student set code=?,name=?,yearOfEntry=?,average=? where code="+code);
                                preparedStatement.setString(1, student.getcode());
                                preparedStatement.setString(2, student.getName());
                                preparedStatement.setLong(3, student.getYearOfEntry());
                                preparedStatement.setLong(4, (long) student.getAverage());
                                preparedStatement.executeUpdate();
                                System.out.println("** Update successfully **");
                                check = true;
                                break;
                            }
                        }
                        if(check == false){
                            System.out.println("this CODE not exist !!");
                        }
                        System.out.print("Do you want to continue ? ");
                        s2 = input.nextLine();
                    }while(s2.equals("yes") || s2.equals("Yes") || s2.equals("YES"));
                    break;
                    // end of case 2
                    
                case 3:
                    check = false;
                    String s3;
                    do{
                        System.out.print("Enter CODE you want delete : ");
                        String code = input.nextLine();
                        preparedStatement = connect.prepareStatement("select code from student");
                        ResultSet resultSet = preparedStatement.executeQuery();
                        while(resultSet.next()){
                            if(resultSet.getString("code").equals(code)){
                                preparedStatement = connect.prepareStatement("delete from student where code="+code);
                                preparedStatement.executeUpdate();
                                System.out.println("** Delete successfully **");
                                check = true;
                                break;
                            }
                        }
                        if(check == false){
                            System.out.println("your CODE not exist !!");
                        }
                        System.out.print("Do you want to continue ? ");
                        s3 = input.nextLine();
                    }while(s3.equals("yes") || s3.equals("Yes") || s3.equals("YES"));
                    break;
                    // end of case 3
                    
                default :
                    System.out.println("your entered number INCORRECT !!");
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
