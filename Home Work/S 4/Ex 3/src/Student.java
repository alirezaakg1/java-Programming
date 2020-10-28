
public class Student<Name,fatherName,studentNumber> {
    
    private Name name;
    private fatherName fatherName;
    private studentNumber studentNumber;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public fatherName getFatherName() {
        return fatherName;
    }

    public void setFatherName(fatherName fatherName) {
        this.fatherName = fatherName;
    }

    public studentNumber getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(studentNumber studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    
}
