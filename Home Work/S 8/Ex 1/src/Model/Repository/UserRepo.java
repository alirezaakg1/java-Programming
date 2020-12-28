
package Model.Repository;

import Model.Entity.UserEntity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class UserRepo implements AutoCloseable{
    
    private Connection connect;
    private PreparedStatement preparedStatement;
    
    public UserRepo() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "alirezakazemi", "myjava123");
        connect.setAutoCommit(false);
    }
    
    public void insert(UserEntity userEntity) throws Exception{
        
        preparedStatement = connect.prepareStatement("insert into userData(name,age,fatherName,phoneNumber,nationalCodee,address)"
                + "values(?,?,?,?,?,?)");
        preparedStatement.setString(1,userEntity.getName());
        preparedStatement.setString(2,userEntity.getAge());
        preparedStatement.setString(3,userEntity.getFatherName());
        preparedStatement.setString(4,userEntity.getPhoneNumber());
        preparedStatement.setString(5,userEntity.getNationalCode());
        preparedStatement.setString(6,userEntity.getAddress());
        preparedStatement.executeUpdate();
    }
    
    public void commit() throws Exception{
        connect.commit();
    }
    
    public void rollbacl() throws Exception{
        connect.rollback();
    }
    
    public void close() throws Exception{
        preparedStatement.close();
        connect.close();
    }
}
