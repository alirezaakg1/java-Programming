
package Model.Service;

import Model.Entity.UserEntity;
import Model.Repository.UserRepo;

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
}
