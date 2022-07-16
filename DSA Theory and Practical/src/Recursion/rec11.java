package Recursion;

public class rec11 {
    public static void main(String args[]){
       String str="abc";
       PrintPermuation(str,""); 
    }

    public static void PrintPermuation(String str,String permuation){ 
        if(str.length()==0){
            System.out.println(permuation);
            return;
        }

        
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            // abc -> bc
            String newStr=str.substring(0, i)+str.substring(i+1);
            PrintPermuation(newStr, permuation+currChar);
        }

    }
}
