package Recursion;

import java.util.HashSet;

public class rec9 {
    public static void main(String args[]){
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        UniqueSubString(str,0,"",set);
    }

    public static void UniqueSubString(String str,int idx,String newString,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        
        char currChar=str.charAt(idx);
        //Want to
        UniqueSubString(str, idx+1, newString+currChar, set);
        //Do not want to
        UniqueSubString(str, idx+1, newString, set);
    }
}
