package Mathematics;

public class Palindrome {
    public static void main(String args[]){
        String str="aba";
        int n=121;
        System.out.println(StringPalindrome(str));
        System.out.println(IntPalindrome(n));
    }
    
    public static boolean IntPalindrome(int n){
        int rem=0,rev=0;
        int test=n;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(rev==test){
            return true;
        }
        
        
        return false;
    }

    public static boolean StringPalindrome(String str){
        
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(rev.equals(str)){
            return true;
        }
        
        
        return false;
    }
}
