
public class A implements Mylnteger  {
    int a;
    
    
    public void isEven(int a){
        if((a % 2) == 0){
            System.out.println(a+" is Even.");
        }
    }
    
    public void isOdd(int a){
        if((a % 2) != 0){
            System.out.println(a+" is Odd.");
        }
    }
    
    public void isPosetive(int a){
        if(a > 0){
            System.out.println(a+" is Posetive.");
        }
    }
    
    public void isNegative(int a){
        if(a < 0){
            System.out.println(a+" is Negative.");
        }
    }

    public void isZero(int a){
        if(a == 0){
            System.out.println(a+" is Zero.");
        }
    }

}
