
public class Student {
    
    final String name = "alireza kazemi";
    final String username = "981113046";
    final String password = "43214321";
    
    public void login(String name, String username, String password) throws exception{
        
        if(this.name.equals(name) && this.username.equals(username) && this.password.equals(password)){
            System.out.println("\n**your entry was Successfull**");
        }
        
        else{
            throw new exception();
        }
    }
}
