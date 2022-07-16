package Recursion;

public class rec13 {
    public static void main(String args[]){
        int n=4,m=2;
        int totalWays=PlaceTiles(n, m);
        System.out.println(totalWays);
    }
    public static int  PlaceTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int verticalPlacements=PlaceTiles(n-m, m);
        int HorizontalPlacements=PlaceTiles(n-1, m);
        return verticalPlacements+HorizontalPlacements;
    }
}
