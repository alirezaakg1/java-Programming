
package Controller;


import Model.Service.UserService;
import view.UserView;


public class UserController {
    
    public boolean insert(String name, String age, String fatherName, String phoneNumber, String nationalCode, String address) throws Exception{
        
        boolean check = false;
        
        if(name.equals("") || age.equals("") || fatherName.equals("") || phoneNumber.equals("") || nationalCode.equals("") || address.equals("")){
            
            check = false;
            return check;
            
        } else{
            
            check = true;
            return check;
            
        }
        
    }
}
