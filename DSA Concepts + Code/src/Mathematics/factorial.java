package Mathematics;

public class factorial {
    public static void main(String args[]){
        int n=5;
        System.out.println("Factorial of the number: "+ Fact(n));
    }
    
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        return n*Fact(n-1);
    }
}
