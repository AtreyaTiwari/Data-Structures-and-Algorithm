package DynamicProgramming;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n=5;
        
        int[] nums=new int[n+1];
        System.out.println(helper(0,n,nums));
    }
    private static int helper(int current, int n,int[] nums){
        if(current>n){
            return 0;
        }
        if(current==n){
            return 1;
        }
        if(nums[current]>0){
            return nums[current];
        }
        nums[current]=helper(current+1,n,nums)+helper(current+2,n,nums);
        return nums[current];
    }
}

