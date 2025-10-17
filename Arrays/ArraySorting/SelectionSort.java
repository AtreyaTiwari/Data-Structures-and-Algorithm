package Arrays.ArraySorting;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void selectionSort(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            int maxInd=0;
            for(int j=0;j<n-i;j++){
                if(arr[maxInd]<arr[j]){
                    maxInd=j;
                }
            }
            swap(arr,maxInd,n-i-1);
        }
    }
    private static void swap(int[] arr,int m,int n){
        int temp=arr[m];
        arr[m]=arr[n];
        arr[n]=temp;
    }
}
