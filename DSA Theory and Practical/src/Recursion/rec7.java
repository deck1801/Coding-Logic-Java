package Recursion;
/*
 * Recursion Question
 * Remove Duplicates
 */

public class rec7 {
    public static boolean[] map=new boolean[26];
    public static void main(String args[]){
        String str="abbccda";
        RemoveDuplicate(str,0,"");
    }
    
    public static void RemoveDuplicate(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        
        char currchar=str.charAt(idx);
        if(map[currchar-'a'] == true){
            RemoveDuplicate(str, idx+1, newString);
        }else{
            newString+=currchar;
            map[currchar-'a']=true;
            RemoveDuplicate(str, idx+1, newString);
        }
    }
}
