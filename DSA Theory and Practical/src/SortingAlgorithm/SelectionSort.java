package SortingAlgorithm;

//Time Complexity: O(n^2)
public class SelectionSort {
    public static void main(String args[]){
        int[] arr=new int[]{10,9,8,7,6,5,4,3,2,1};
        System.out.println("Before Sorting: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("After Sorting: ");
        for(int i:selectionSort(arr)){
            System.out.print(i+" ");
        }

    }
    
    static int[] selectionSort(int[] arr){
        
        for(int i=0;i<arr.length-1;i++){
            int smallest=i; //select smallest element
            //And Start loop after smalllest element
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    
}
