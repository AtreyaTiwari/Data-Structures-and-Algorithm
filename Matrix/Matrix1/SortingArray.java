package Matrix.Matrix1;
import java.util.*;
public class SortingArray {
    public static void main(String[] args) {
        int[] nums = {5,1,1,2,0,0};
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    private static void heapSort(int[] nums){
        int n=nums.length;

        //creating maxHeap
        for(int i=n/2;i>=0;i--){
            heapify(nums,i,n);
        }
        //push largest element to the end
        for(int i=n-1;i>=0;i--){
            int temp=nums[0];
            nums[0]=nums[i];
            nums[i]=temp;

            //fixing heap
            heapify(nums,0,i);
        }
    }
    private static void heapify(int[] nums, int i,int size){
        int left=2*i + 1; int right=2*i + 2;
        int maxInd=i;

        if(left<size && nums[left]>nums[maxInd]){
            maxInd=left;
        }
        if(right<size && nums[right]>nums[maxInd]){
            maxInd=right;
        }
        if(maxInd!=i){
            int temp=nums[maxInd];
            nums[maxInd]=nums[i];
            nums[i]=temp;

            heapify(nums,maxInd,size);
        }
    }
}
