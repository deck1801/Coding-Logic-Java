package Mathematics;

public class GCD {
    public static void main(String args[]){
        System.out.println("GCD: "+ FindGCD(4, 2));
    }
    
    public static int FindGCD(int a, int b){
        if(a==0){
            return b;
        }else if(b==0){
            return a;
        }else if(a==b){
            return a;
        }

        if(a>b){
            return FindGCD(a-b, b);
        }else if(b>a){
            return FindGCD(a, b-1);
        }
        
        return -1;
    }
}
