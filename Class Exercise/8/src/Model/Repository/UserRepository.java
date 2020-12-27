package Model.Repository;

import Model.Entity.UserEntity;
import java.sql.*;
import java.util.*;

public class UserRepository implements AutoCloseable{
 
    private Connection connect;
    private PreparedStatement preparedStatement;
    
    public UserRepository() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","alirezakazemi","myjava123");
        connect.setAutoCommit(false);
    }
    
    public void insert(UserEntity userEntity) throws Exception{
        preparedStatement = connect.prepareStatement("insert into userData(name,pass,userName,email)values(?,?,?,?)");
        preparedStatement.setString(1,userEntity.getName());
        preparedStatement.setString(2, userEntity.getPass());
        preparedStatement.setString(3, userEntity.getUserName());
        preparedStatement.setString(4, userEntity.getEmail());
        preparedStatement.executeUpdate();
    }
    
    public List<UserEntity> select() throws Exception{
        preparedStatement = connect.prepareStatement("select userName,pass from userData");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<UserEntity> userEntityList = new ArrayList<>();
        while(resultSet.next()){
            UserEntity userEntity = new UserEntity();
            userEntity.setUserName(resultSet.getString("userName"));
            userEntity.setPass(resultSet.getString("pass"));
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
