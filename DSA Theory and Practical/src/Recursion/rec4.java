package Recursion;

/*
 * RECURSION PROBLEM 4: 
 * First and Last Occurence of the element
 */

public class rec4 {
    public static int First=-1;
    public static int Last=-1;
    public static void main(String args[]){
        String str="abaacdaefaah";
        FirstAndLastAppreance(0, str, 'a');

    }


    public static void FirstAndLastAppreance(int idx,String str,char ch){
        
        if(idx==str.length()){
            System.out.println("First Appreance: "+ First);
            System.out.println("Second Appreance: "+ Last);
            return;
        }
        char currentChar=str.charAt(idx);
        if(currentChar==ch){
            if(First==-1){
                First=idx;
            }else{
                Last=idx;
            }
        }
            
        FirstAndLastAppreance(idx+1, str, ch);
    }
}
