package Recursion;



/*
 * Recrsion Question-3 
 * 1st and last occurence of an element.
 */

public class rec4 {
    public static int first=-1;
    public static int last=-1;
    public static void main(String args[]){
        String str="abaacdaefaah";
        FirstLastOccurence(0, str,'a');
        
    }
    
    public static void FirstLastOccurence(int idx, String str,char ch){
        if(idx==str.length()){
            System.out.println("First Occurence: "+first);
            System.out.println("Last Occurence: "+last);
            return;
        }
        char current=str.charAt(idx);
        if(current==ch){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        
        FirstLastOccurence(idx+1, str, ch);

        
    }
}
