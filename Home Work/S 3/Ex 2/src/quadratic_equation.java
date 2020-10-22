import java.lang.Math;

public class quadratic_equation {

    
    public void answer(float a ,float b,float c) throws exception{
        float delta;
        float x1 , x2;
        
        delta = (b*b) - (4*a*c);
        if(delta > 0){
            x1 = (float) (b + (Math.sqrt(delta)) / (2*a)); 
            x2 = (float) (b - (Math.sqrt(delta)) / (2*a));
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        
        if(delta == 0){
            x1 = b / (2*a);
            System.out.println("x1 , x2 = "+ x1);
        }
        
        if(delta < 0){
            throw new exception();
        }
    }
}
