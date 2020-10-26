
public class number3 {

    public static void main(String[] args) {
        Detail user = new Detail();
        user.getdetail();
        
        try{
            user.check();
        } catch(exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
