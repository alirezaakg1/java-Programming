
package Model.Entity;

public class UserEntity {
    
    private String name;
    private String pass;
    private String userName;
    private String email;

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
    
    public UserEntity setName(String name){
        this.name = name;
        return this;
    }

    public UserEntity setPass(String pass) {
        this.pass = pass;
        return this;
    }

    public UserEntity setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }
    
    
}
