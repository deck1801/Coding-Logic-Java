package Recursion;

import java.util.ArrayList;

public class rec15 {
    public static void main(String args[]){
        int n=3;
        ArrayList<Integer> subsets=new ArrayList<>();
        PrintSubsets(n, subsets);
    }
    
    public static void PrintSets(ArrayList<Integer> set){
        for(int i=0;i<set.size();i++){
            System.out.print(set.get(i)+" ");
        }
        System.out.println();
    }

    public static void PrintSubsets(int n,ArrayList<Integer> set){
        if(n==0){
            PrintSets(set);
            return;
        }
        
        //Wanted to add
        set.add(n);
        PrintSubsets(n-1, set);

        //Not Wanted to add
        set.remove(set.size()-1);
        PrintSubsets(n-1, set);

    }
}
