package Recursion;



/*
 * Recursion Problem: Shifting of character in the string 
 */

public class rec6 {
    public static void main(String args[]){
        String str="axbcxxd";
        ChangeCharInString(str, 0, 0, "");

    }
    
    public static void ChangeCharInString(String str,int idx,int count,String newString){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println("The Resultant String: "+newString);
            return;
        }
        char currChar=str.charAt(idx);
        if(currChar =='x' || currChar=='X'){
            count++;
            ChangeCharInString(str, idx+1, count, newString);
        }else{
           newString+=currChar;
           ChangeCharInString(str, idx+1, count, newString); 
        }

    } 
}
