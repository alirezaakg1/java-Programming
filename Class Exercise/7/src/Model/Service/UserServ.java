package Model.Service;

import Model.Entity.UserEntity;
import Model.Repository.UserRepo;
import java.util.List;


public class UserServ {
    
    private UserServ(){
        
    }
    
    private static UserServ userServ = new UserServ();
    
    public static UserServ getInstance(){
        return userServ;
    }
    
    public void singUp(UserEntity userEntity) throws Exception{
        try(UserRepo userRepo = new UserRepo()){
            userRepo.insert(userEntity);
            userRepo.commit();
        }
    }
    
    public List<UserEntity> signIn() throws Exception{
        List<UserEntity> userEntityList;
        try(UserRepo userRepo = new UserRepo()){
            userEntityList = userRepo.select();
        }
        return userEntityList;
    }
    
}
