package Mathematics;

public class ModuloArithmatic {
    public static void main(String args[]){
        System.out.println(FastPower(3, 5));
    }
    
    public static int FastPower(int n,int b){
        int res=1;
        while(b>0){
            if((b&1)!=0){ // replacement of b%2!=0
                res*=n;
            }
            n=n*n;
            b=b>>1; //replacement of b/2
        }
        return res;
    }
    
    static long LargeFastPower(long n,long b,int m){
        long res=1;
        while(b>0){
            if((b&1)!=0){
                res=(res*n % m)% m;
            }
            n=(n%m * n%m)%m;
            b=b>>1;
        }
        return res;

    }
}
