import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Student st1 = new Student();
        
        System.out.print("Enter your Name : ");
        st1.setName(input.nextLine());
        System.out.print("Enter your Father Name : ");
        st1.setFatherName(input.nextLine());
        System.out.print("Enter your Student Number : ");
        st1.setStudentNumber(input.nextLine());
        
        Student<String,String,String> st = new Student<>();
        
        ArrayList<Float> li = new ArrayList<>();
        
        for(int j=1; j<6; j++){
            System.out.print("Enter grade "+j+" : ");
            li.add(input.nextFloat());
        }
        
        System.out.println("\nStudent grades : ");
        System.out.println("----------------");
        
        for(Float i : li){
            System.out.println(i);
        }
    }
    
}
