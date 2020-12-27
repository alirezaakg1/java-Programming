
package Model.Service;

import Model.Entity.UserEntity;
import Model.Repository.UserRepository;
import java.util.List;

public class UserService {
    
    private UserService(){
        
    }
    
    private static UserService userService = new UserService();
    
    public static UserService getInstatnce(){
        return userService;
    }
    
    public void insert(UserEntity userEntity) throws Exception{
        try(UserRepository userRepository = new UserRepository()){
            userRepository.insert(userEntity);
            userRepository.commit();
        }
    }
    
    public List<UserEntity> select() throws Exception{
        List<UserEntity> userEntityList;
        try(UserRepository userRepository = new UserRepository()){
            userEntityList = userRepository.select();
        }
        return userEntityList;
    }

}
