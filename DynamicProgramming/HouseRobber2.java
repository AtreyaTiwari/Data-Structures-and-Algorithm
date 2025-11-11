package DynamicProgramming;

public class HouseRobber2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int n=nums.length;
        if (n == 1) return nums[0];
        return Math.max(robery(nums,0,n-2),robery(nums,1,n-1));
    }
    private static int robery(int[] nums,int i,int j){
        int prev2=0;
        int prev=nums[i];

        for(int m=i+1;m<=j;m++){
            int pick=nums[m];
            // if(i+1>1){
            if(m>i+1){
                pick+=prev2;
            }
            int notPick=0+prev;
            
            int curri=Math.max(pick,notPick);

            prev2=prev;
            prev=curri;
        }
        return prev;
    }
}
