public class Builder {
    
    private String userName;
    private String realName;
    private String password;
    private int age;
    private String address;
    private String phoneNumber;
    private String education;

    public Builder setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public Builder setRealName(String realName) {
        this.realName = realName;
        return this;
    }

    public String getRealName() {
        return realName;
    }

    public Builder setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Builder setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Builder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Builder setEducation(String education) {
        this.education = education;
        return this;
    }

    public String getEducation() {
        return education;
    }
    
    
}
