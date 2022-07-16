package Recursion;

/*
 * Move all X to the end of the string.
 */
public class rec6 {
    public static int count=0;
    public static String result="";
    public static void main(String args[]){
        String str="axbcxxd";
        System.out.println(MoveToEnd(str, 0));
        
    }
    
    public static String MoveToEnd(String str, int idx){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                result+='x';
            }
            return result;
        }
        
        char currChar=str.charAt(idx);
        if(currChar=='x'){
            count++;
            MoveToEnd(str, idx+1);
        }else{
            result+=currChar;
            MoveToEnd(str,idx+1);
        }
        return result;
        
        

    }
}
