
public class Checkstring {
 
    public void check(String str) throws Exception {
        int k = 0;
        
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                k = 1;
                throw new exception();
            }
        }
        
        if(k == 0){
            System.out.println("length of string : "+str.length());
        }
    }
}
