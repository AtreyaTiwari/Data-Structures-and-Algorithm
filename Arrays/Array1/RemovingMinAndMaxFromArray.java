package Arrays.Array1;

public class RemovingMinAndMaxFromArray {
    public static void main(String[] args) {
        int nums[] = {2,10,7,5,4,1,8,6};
        System.out.println(minimumDeletions(nums));
    }
    public static int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int minInd=-1,maxInd=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxInd=i;
            }
            if(nums[i]<min){
                min=nums[i];
                minInd=i;
            }
        }
        minInd+=1;maxInd+=1;
        if(minInd<=(n/2) && maxInd<=(n/2)){
            return Math.max(minInd,maxInd);
        }
        else if(minInd>=(n/2) && maxInd>=(n/2)){
            return n-Math.min(minInd,maxInd)+1;
        }
        else{
            int small=Math.min(minInd,maxInd);
            int large=Math.max(minInd,maxInd);

            int pos= small+(n-large+1); //sum of total element which can be removed
            //check is sum exceed larger index
            if(pos>large){
                return large;
            }else{
                return pos;
            }
        }
    }
}
