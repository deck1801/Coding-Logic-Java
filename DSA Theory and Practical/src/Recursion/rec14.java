package Recursion;

public class rec14 {
    public static void main(String args[]){
        int n=4;
        System.out.println(InviteGuest(n));
    }
    
    public static int InviteGuest(int n){
        if(n<=1){
            return 1;
        }
        int single=InviteGuest(n-1);
        int pair=(n-1)*InviteGuest(n-2);
        return single+pair;
    }
}
