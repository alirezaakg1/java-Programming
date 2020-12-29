
package Model.Repository;

import Model.Entity.UserEntity;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepo implements AutoCloseable{
    
    private Connection connect;
    private PreparedStatement preparedStatement;
    
    public UserRepo() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","alirezakazemi","myjava123");
        connect.setAutoCommit(false);
    }
    
    public void insert(UserEntity userEntity) throws Exception{
        
        preparedStatement = connect.prepareStatement("insert into userData(name,age,userName,password,email)values(?,?,?,?,?)");
        preparedStatement.setString(1, userEntity.getName());
        preparedStatement.setString(2, userEntity.getAge());
        preparedStatement.setString(3, userEntity.getUserName());
        preparedStatement.setString(4, userEntity.getPassword());
        preparedStatement.setString(5, userEntity.getEmail());
        preparedStatement.executeUpdate();
    }
    
    public void update(UserEntity userEntity) throws Exception{
        
        preparedStatement = connect.prepareStatement("update userData set name=?,age=?,password=?,email=? where userName=?");
        preparedStatement.setString(1, userEntity.getName());
        preparedStatement.setString(2, userEntity.getAge());
        preparedStatement.setString(3, userEntity.getPassword());
        preparedStatement.setString(4, userEntity.getEmail());
        preparedStatement.setString(5, userEntity.getUserName());
        preparedStatement.executeUpdate();
    }
    
    
    public List<UserEntity> select() throws Exception{
        
        preparedStatement = connect.prepareStatement("select * from userData");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<UserEntity> userEntityList = new ArrayList<>();
        while(resultSet.next()){
            
            UserEntity userEntity = new UserEntity();
            userEntity.setUserName(resultSet.getString("userName"));
            userEntity.setPassword(resultSet.getString("password"));
            userEntityList.add(userEntity);
            
        }
        return userEntityList;
    }
    
    public void commit() throws Exception{
        connect.commit();
    }
    
    public void rollback() throws Exception{
        connect.rollback();
    }
    
    public void close() throws Exception{
        preparedStatement.close();
        connect.close();
    }
}

