package Recursion;

public class rec8 {
    public static void main(String args[]){
        String str="abc";
        PrintSubSequences(str, 0,"");
    }

    public static void PrintSubSequences(String str,int idx,String newString){
        
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(idx);
        
        //to be 
        PrintSubSequences(str, idx+1, newString+currchar);
        
        //or not to be
        PrintSubSequences(str, idx+1, newString);

    }
}
