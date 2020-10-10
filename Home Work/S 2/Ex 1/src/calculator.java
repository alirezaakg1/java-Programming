public class calculator {
    float a;
    float b;
    float temp;
    
    public float addition(float a, float b){
        this.a = a;
        this.b = b;
        temp = a + b;
        return temp;
    }
    
    public float subtract(float a, float b){
        this.a = a;
        this.b = b;
        temp = a - b;
        return temp;
    }
    
    public float multiply(float a, float b){
        this.a = a;
        this.b = b;
        temp = a * b;
        return temp;
    }
    
    public float divide(float a, float b){
        this.a = a;
        this.b = b;
        temp = a / b;
        return temp;
    }
}
