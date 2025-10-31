package Recursion.Recursion2;

public class PivotIndex {
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        int total=0;
        for(int n:nums){
            total+=n;
        }
        System.out.println(pivot(nums, 0, 0, total));
    }
    private static int pivot(int[] nums, int ind,int left, int total){
        if(ind<0 || ind>=nums.length){
            return -1;
        }
        int right=total-left-nums[ind];
        if(left==right){
            return ind;
        }
        return pivot(nums, ind+1, left+nums[ind], total);
    }
}
