package DynamicProgramming;

import java.util.Arrays;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost={10,15,20};
        int n=cost.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(Math.min(climb(n-1,cost,dp),climb(n-2,cost,dp)));

        System.out.println(tabu(cost));
    }
    private static int climb(int ind,int[] cost,int[] dp){
        if(ind==0) return cost[0];
        if(dp[ind]!=-1) return dp[ind];
        int jump1=climb(ind-1,cost,dp);
        int jump2=0;
        if(ind>1) jump2=climb(ind-2,cost,dp);

        return dp[ind]=cost[ind]+Math.min(jump1,jump2);
    }
    private static int tabu(int[] cost){
        int n=cost.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);

        dp[0]=cost[0];
        dp[1]=cost[1];

        for(int i=2;i<n;i++){
            dp[i]=cost[i]+ Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
}
