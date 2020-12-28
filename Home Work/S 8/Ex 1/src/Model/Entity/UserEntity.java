package Model.Entity;


public class UserEntity {
 
    private String name;
    private String age;
    private String fatherName;
    private String phoneNumber;
    private String nationalCode;
    private String address;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public String getAddress() {
        return address;
    }

    public UserEntity setName(String name) {
        this.name = name;
        return this;
    }

    public UserEntity setAge(String age) {
        this.age = age;
        return this;
    }

    public UserEntity setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public UserEntity setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserEntity setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
        return this;
    }

    public UserEntity setAddress(String address) {
        this.address = address;
        return this;
    }
    
    
}
