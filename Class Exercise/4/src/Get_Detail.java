
public class Get_Detail {
 
    private String name;
    private String family;
    private int age;
    private String pass;
    private String username;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    
    
    public void information(){
        System.out.println("\n**your information : **");
        System.out.println("-------------------------");
        System.out.println("Name : "+ name);
        System.out.println("Family : " + family);
        System.out.println("Age : "+ age);
        System.out.println("Pass : "+ pass);
        System.out.println("Username : "+ username);
        System.out.println("Job : "+ job);
    }
}
