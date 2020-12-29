
package Controller;

import Model.Entity.UserEntity;
import Model.Service.UserService;
import java.util.List;


public class UserController {
    
    public boolean insert(String name, String age, String userName, String password, String email) throws Exception{
        
        boolean check;
        
        if(name.equals("") || age.equals("") || userName.equals("") || password.equals("") || email.equals("")){
            
            check = false;
            return check;
        } else{
            
            check = true;
            return check;
        }
    }
    
    public boolean select(String userName, String password) throws Exception{
        
        boolean check = false;
        List<UserEntity> userEntityList = UserService.getInstance().select();
        
        for(UserEntity userEntity : userEntityList){
            
            if(userEntity.getUserName().equals(userName) && userEntity.getPassword().equals(password)){
                
                check = true;
                return check;
                
            } // end of if
                
        } // end of for
        
        return check;
        
    }
    
    public boolean update(String name, String age, String userName, String password, String email) throws Exception{
        
        boolean check;
        
        if(name.equals("") || age.equals("") || userName.equals("") || password.equals("") || email.equals("")){
            
            check = false;
            
        } else{
            
            check = true;
            UserService.getInstance().update(new UserEntity().setName(name).setAge(age).setUserName(userName).setPassword(password).setEmail(email));
            
        }
        
        return check;
    }
}
