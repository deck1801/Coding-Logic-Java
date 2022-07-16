package Recursion;

/*
 * Recursion Question - 4
 * Checking if Array is Sorted or not.
 * 
 */

public class rec5 {
    public static String check="False";
    public static void main(String args[]){
        int[] arr=new int[]{1,2,3,4,5};
        System.out.println(SortCheck(arr, 0));
    }
    
    public static boolean SortCheck(int arr[],int pos){
        if(pos==arr.length-1){
            return true;
        }
        if(arr[pos]<arr[pos+1]){
            return SortCheck(arr, pos+1);
        }else{
            return false;
        }
    
    }
}
