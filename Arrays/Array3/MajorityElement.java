package Arrays.Array3;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }  
    public static int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];

        // Boyer-Moore Voting Algorithm - (more optimized)
        int freq=0,ans=0;
        for(int n:nums){
            if(freq==0){
                ans=n;
            }
            if(ans==n) freq++;
            else freq--;
        }
        return ans;
    }
}
