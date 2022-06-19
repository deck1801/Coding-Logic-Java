package Recursion;

/*
 * Reccursion Problem 2: Reverse of String
 * Time Complexity: O(n)
 */

public class rec3 {
    public static void main(String args[]){
        String str="ABCD";
        System.out.println("FOR-LOOP RESULT");
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println();
        System.out.println("RECURSION RESULT: ");
        ReverseString(str.length()-1, str);
        
    }
    
    public static void ReverseString(int n,String str){
        if(n==0){
            System.out.println(str.charAt(n));
            return;
        }
        System.out.print(str.charAt(n));
        ReverseString(n-1, str);
    }
}
