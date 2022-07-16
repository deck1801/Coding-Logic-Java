package Recursion;

/**
 * Recerssion Question-2 
 * Reverse the given String
 * "abcd" --> "dcba"
 */

public class rec3 {
    public static void main(String args[]){
        String str="abcd";
        int len=str.length();
        ReverseString(len, str, 0);

    }
    public static void ReverseString(int n,String str,int pos){
        if(n==pos){
            return;
        }
        ReverseString(n, str, pos+1);
        System.out.print(str.charAt(pos));
    }
}
