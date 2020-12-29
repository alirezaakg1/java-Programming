
package Model.Entity;


public class UserEntity {
    
    private String name;
    private String age;
    private String userName;
    private String password;
    private String email;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setName(String name) {
        this.name = name;
        return this;
    }

    public UserEntity setAge(String age) {
        this.age = age;
        return this;
    }

    public UserEntity setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }
    
    
}
