package Recursion;

/*
 * Tower of Hanoi Classical Recursion Problem
 * 
 */

public class rec2 {
    public static void main(String args[]){
        int n=3;
        TowerOfHanoi(n,"S","H","D");
        
        
    }

    public static void TowerOfHanoi(int n, String Source,String Helper,String Destination){
        if(n==1){
            System.out.println("Tranfer Disk "+ n +" From: "+Source+" To: "+Destination);
            return;
        }
        
          TowerOfHanoi(n-1, Source, Destination, Helper);
        System.out.println("Tranfer Disk "+ n +" From: "+Source+" To: "+Destination);
        TowerOfHanoi(n-1, Helper, Source, Destination);
    }
}
