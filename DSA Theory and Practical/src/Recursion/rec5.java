package Recursion;

/*
 * Recusrsion Problem 2: Strictly Increasing
 * Simply Sorted Array
 */

public class rec5 {
    public static void main(String args[]){
        int[] arr=new int[]{1,2,3,4,5};
        System.out.println("IS SORTED: "+StrictlyIncreasing(arr, 0));
        
    }

    public static boolean StrictlyIncreasing(int[] arr,int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            //array is sorted till now
            return StrictlyIncreasing( arr, idx+1);
        } else{
            return false;
        }

    }
}
