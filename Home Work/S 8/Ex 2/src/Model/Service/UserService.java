
package Model.Service;

import Model.Entity.UserEntity;
import Model.Repository.UserRepo;
import java.util.List;


public class UserService {
    
    private UserService(){
        
    }
    
    private static UserService userService = new UserService();
    
    public static UserService getInstance(){
        return userService;
    }
    
    public void insert(UserEntity userEntity) throws Exception{
        
        try(UserRepo userRepo = new UserRepo()){
            userRepo.insert(userEntity);
            userRepo.commit();
        }
    }
    
    public void update(UserEntity userEntity) throws Exception{
        
        try(UserRepo userRepo = new UserRepo()){
            userRepo.update(userEntity);
            userRepo.commit();
        }
    }
    
    
    public List<UserEntity> select() throws Exception{
        
        List<UserEntity> userEntityList;
        try(UserRepo userRepo = new UserRepo()){
            userEntityList = userRepo.select();
            
        }
        return userEntityList;
    }
    
    
}
