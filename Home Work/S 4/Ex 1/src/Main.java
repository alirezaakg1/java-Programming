import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your Name : ");
        String name = input.nextLine();
        System.out.print("Enter your Student Number : ");
        String studentNumber = input.nextLine();
        System.out.print("Enter your average : ");
        float average = Float.parseFloat(input.nextLine());
        System.out.println("--------------------");
        
        HashMap<String,String> map = new HashMap<>();
        map.put("Name" , name);
        map.put("Student Number" , studentNumber);
        map.put("Average" , String.valueOf(average));
        
        for(String i : map.keySet()){
            System.out.println(i + " : " + map.get(i));
        }
    }
    
}
