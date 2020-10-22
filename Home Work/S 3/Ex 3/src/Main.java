import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String str;
        Checkstring obj = new Checkstring();
        
        System.out.println("Enter a String : ");
        str = input.nextLine();
        try {
            obj.check(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
