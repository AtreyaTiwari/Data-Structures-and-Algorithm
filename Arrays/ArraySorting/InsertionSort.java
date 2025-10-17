package Arrays.ArraySorting;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    } 
    public static void insertionSort(int arr[]) {
        // code here
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            int key=arr[i];
            int j=i-1;
            
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
