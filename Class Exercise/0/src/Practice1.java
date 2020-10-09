import java.util.Scanner;

public class Practice1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        
        for(int i=0; i<5; i++)
        {
            System.out.format("Enter arr[%d] : ",i+1);
            arr[i] = input.nextInt();
        }
        
        System.out.print("and enter one number : ");
        int a = input.nextInt();
        int r=0;
        int m=0;
        
        for(int i=0; i<5; i++)
        {
            if(a == arr[i])
            {
                r++;
                m=1;
            }
        }
        
        if(m == 1)
        {
            System.out.println("** True **");
            System.out.format("Repeated = %d\n",r);
        }
        else
        {
            System.out.println("** False **");
        }
    }
    
}
