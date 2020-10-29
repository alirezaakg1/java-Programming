
public class User<userName,gmail,pass> implements Cloneable {
    
    private String userName;
    private String gmail;
    private String pass;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    
}
