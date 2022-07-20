package Mathematics;

public class TrailingZero {
    public static void main(String args[]){
        int n=12;
        int res=0;
        for(int i=5; i<=n;i*=5){
            res=res+(n/i);
        }
        System.out.println("The number of trailing zeroes are: "+res);
    }
}
