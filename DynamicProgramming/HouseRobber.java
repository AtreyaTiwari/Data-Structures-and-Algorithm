package DynamicProgramming;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return tab(nums,dp);
    }
    private static int tab(int[] nums,int[] dp){
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            int pick=nums[i];
            if(i>1) pick+=dp[i-2];
            int notPick=0+dp[i-1];
            dp[i]=Math.max(pick,notPick);
        }
        return dp[dp.length-1];
    }
}
