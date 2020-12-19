
import java.util.Scanner;


public class Employe {
    private int id;
    private String name;
    private String nationalNumber;
    private String fatherName;
    private String position;
    private long salary;
    private int workExperience;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(String nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }
    
    public void Entry(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employe information : ");
        System.out.print("ID : ");
        id = Integer.parseInt(input.nextLine());
        System.out.print("NAME : ");
        name = input.nextLine();
        System.out.print("NATIONAL NUMBER : ");
        nationalNumber = input.nextLine();
        System.out.print("FATHER NAME : ");
        fatherName = input.nextLine();
        System.out.print("POSITION : ");
        position = input.nextLine();
        System.out.print("SALARY : ");
        salary = Long.parseLong(input.nextLine());
        System.out.print("WORK EXPERIENCE : ");
        workExperience = Integer.parseInt(input.nextLine());
    }
}
