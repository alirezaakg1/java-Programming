
package Model.Repository;

import Model.Entity.UserEntity;
import java.sql.*;
import java.util.*;

public class UserRepo implements AutoCloseable{
    
    private Connection connection;
    private PreparedStatement preparedStatement;
    
    public UserRepo() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","alirezakazemi","myjava123");
        connection.setAutoCommit(false);
    }
    
    public void insert(UserEntity userEntity) throws Exception{
        preparedStatement = connection.prepareStatement("insert into person(name,pass,userName,email)values(?,?,?,?)");
        preparedStatement.setString(1, userEntity.getName());
        preparedStatement.setString(2, userEntity.getPass());
        preparedStatement.setString(3, userEntity.getUserName());
        preparedStatement.setString(4, userEntity.getEmail());
        preparedStatement.executeUpdate();
    }
    
    public List<UserEntity> select() throws Exception{
        List<UserEntity> userEntityList = new ArrayList<>();
        preparedStatement = connection.prepareStatement("select userName,pass from person");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            UserEntity userEntity = new UserEntity();
            userEntity.setUserName(resultSet.getString("userName"));
            userEntity.setPass(resultSet.getString("pass"));
            userEntityList.add(userEntity);
        }
        return userEntityList;
    }
    
    public void commit() throws Exception{
        connection.commit();
    }
    
    public void rollback() throws Exception{
        connection.rollback();
    }
    
    @Override
    public void close() throws Exception{
        preparedStatement.close();
        connection.close();
    }
}
