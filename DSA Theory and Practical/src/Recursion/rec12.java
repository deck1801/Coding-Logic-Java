package Recursion;


public class rec12 {
    public static void main(String args[]){
        int n=3,m=3;
        int totalPaths=CountTotalPaths(0, 0, m, n);
        System.out.println(totalPaths);

    }
    
    public static int CountTotalPaths(int i,int j,int m,int n){
        if(i==n||j==m){  //out-of bounds
            return 0;
        }
        if(i==n-1 && j==m-1){ //reached boundary cells
            return 1;
        }
        
        
        //move downwards
        int downPaths=CountTotalPaths(i+1, j, m, n);
        //move Rightwards
        int rightPaths=CountTotalPaths(i, j+1, m, n);

        return downPaths+rightPaths;

    }
}
