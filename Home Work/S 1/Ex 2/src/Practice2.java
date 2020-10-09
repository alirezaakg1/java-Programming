import java.util.*;

public class Practice2 {

    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      float[] arr = new float[5];
      int[] arr2 = new int[5];
      float average;
      float s=0;
      int k=0;
      int j=0;
      
      for(int i=1; i<=5; i++){
          System.out.println("Lesson "+ i +":");
          System.out.print("Score : ");
          arr[j] = input.nextInt();
          System.out.print("Coffient : ");
          arr2[j] = input.nextInt();
          System.out.print("\n");
          k += arr2[j];
          j++;
      }
      
      for(int i=0; i<5; i++){
          s += arr[i] * arr2[i];   
      }
      
      average = s/k;
      System.out.println("\n Average = "+ average);
      
      if(average >= 12){
          System.out.println(" NOT MASHROOT");
      }
      
      else{
           System.out.println(" MASHROOT");
      }
      
    }
    
}
