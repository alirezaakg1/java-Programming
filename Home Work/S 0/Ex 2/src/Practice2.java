import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter \'n\' : ");
        int n = input.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i] = input.nextInt();
        }
        
        int maxNum = arr[0];
        
        for(int i=0; i<n; i++)
        {
            if(arr[i] > maxNum)
            {
                maxNum = arr[i];
            }
        }
        
        
        System.out.println("\n Maximum Number : "+ maxNum);
    }
    
}
