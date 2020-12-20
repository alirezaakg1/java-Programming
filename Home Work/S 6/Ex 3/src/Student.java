
import java.util.Scanner;

public class Student {
    
    private String code;
    private String name;
    private int yearOfEntry;
    private float average;

    public String getcode() {
        return code;
    }

    public void setcode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfEntry() {
        return yearOfEntry;
    }

    public void setYearOfEntry(int yearOfEntry) {
        this.yearOfEntry = yearOfEntry;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }
    
    public void Entry(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student information : ");
        System.out.print("Code : ");
        code = input.nextLine();
        System.out.print("Student Name : ");
        name = input.nextLine();
        System.out.print("Year Of Entry : ");
        yearOfEntry = Integer.parseInt(input.nextLine());
        System.out.print("Average : ");
        average = Float.parseFloat(input.nextLine());
    }

}
