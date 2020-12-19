
import java.util.Scanner;


public class User {
    
    private int id;
    private String name;
    private String userName;
    private String email;
    private String password;
    private int age;
    private String education;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void Entry(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Information : ");
        System.out.print("ID : ");
        id = Integer.parseInt(input.nextLine());
        System.out.print("NAME : ");
        name = input.nextLine();
        System.out.print("USER_NAME : ");
        userName = input.nextLine();
        System.out.print("EMAIL : ");
        email = input.nextLine();
        System.out.print("PASSWORD : ");
        password = input.nextLine();
        System.out.print("AGE : ");
        age = Integer.parseInt(input.nextLine());
        System.out.print("EDUCATION : ");
        education = input.nextLine();
    }

}
