package DynamicProgramming;

import java.util.Arrays;

public class UniquePaths {
    public static void main(String[] args) {
        int m = 3, n = 7;
        int[][] dp=new int[m][n];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        System.out.println(memo(dp,m-1,n-1));
        
    }
    
    private static int memo(int[][] dp,int i, int j){
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;

        if(dp[i][j]!=-1) return dp[i][j];

        int up=memo(dp,i-1,j);
        int left=memo(dp,i,j-1);
        return dp[i][j]= up+left;
    }
}
