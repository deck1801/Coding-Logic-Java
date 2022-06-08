package SortingAlgorithm;

//Time Complexity: O(n^2)
public class InsertionSort {
    public static void main(String args[]){
        int[] arr=new int[]{10,9,8,7,6,5,4,3,2,1};
        System.out.println("Before Sorting: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("After Sorting: ");
        for(int i:insertionSort(arr)){
            System.out.print(i+" ");
        }
    }

    static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        return arr;
    }
}
