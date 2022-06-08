package SortingAlgorithm;
//Time Complexity: O(n^2)
public class BubbleSort {
    public static void main(String args[]){
        int[] arr=new int[]{10,9,8,7,6,5,4,3,2,1};
        System.out.println("The Array Before Sorting: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("The Array After Sorting: ");
        for(int i: bubbleSort(arr)){
            System.out.print(i+" ");
        }
    }
    
    static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;

    }
}
